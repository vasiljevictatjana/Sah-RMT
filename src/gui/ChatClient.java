package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class ChatClient extends JFrame implements Runnable {

	static Socket socket = null;
	static BufferedReader in = null;
    static PrintWriter out = null;
    private JFrame frame;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private static JTextArea messageArea;
	private static JTextField textField;
	static BufferedReader ulazKonzola = null;
	static boolean kraj = false;
	

	/**
	 * Create the frame.
	 */
	public ChatClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getTextField(), BorderLayout.NORTH);
		pack();
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getMessageArea());
		}
		return scrollPane;
	}
	private JTextArea getMessageArea() {
		if (messageArea == null) {
			messageArea = new JTextArea();
			messageArea.setEditable(false);
		}
		return messageArea;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			/*textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					 out.println(textField.getText());
		             textField.setText("");
				}
			});*/
			textField.setEditable(false);
			textField.setColumns(10);
		}
		return textField;
	}
	
	/*private String getServerAddress() {
		return JOptionPane.showInputDialog(
				frame,
				"Enter IP Address of the Server:",
				"Welcome to the Chatter",
				JOptionPane.QUESTION_MESSAGE);
	}*/
	
	private String getUserName() {
		return JOptionPane.showInputDialog(
				frame,
				"Choose a screen name:",
				"Screen name selection",
				JOptionPane.PLAIN_MESSAGE);
	}
  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				try {
				    socket = new Socket("localhost", 30121);
					
					ulazKonzola = new BufferedReader(new InputStreamReader(System.in));
					
			        in = new BufferedReader(new InputStreamReader(
			            socket.getInputStream()));
			        out = new PrintWriter(socket.getOutputStream());
			        
				
					ChatClient frame = new ChatClient();
					frame.setVisible(true);
	
					new Thread (new ChatClient()).start(); 
					
					while (!kraj){
						textField.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								 out.println(textField.getText());
					             textField.setText("");
							}
						});
					}
					
			        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        
			        //frame.run();
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	//});
	
	@Override
	public void run() {
		//String serverAddress = getServerAddress();
	       /* Socket socket = new Socket("localhost", 9001);
	        in = new BufferedReader(new InputStreamReader(
	            socket.getInputStream()));
	        out = new PrintWriter(socket.getOutputStream(), true);
	*/
		  String line ;
		  try {
			    
				while((line = in.readLine())!= null) {
					messageArea.append(line.substring(8) + "\n");
					
					if(line.indexOf("*** Dovidjenja") == 0) {
						kraj = true;
						return;
					}
				}
				
			} catch (IOException e) {
				System.err.println("IOException: " + e);
			}
		 
	        /*while (!kraj) {
	            String line = in.readLine();
	            if (line.startsWith("SUBMITNAME")) {
	                out.println(getName());
	            } else if (line.startsWith("NAMEACCEPTED")) {
	                textField.setEditable(true);
	            } else if (line.startsWith("MESSAGE")) {
	              
	            	messageArea.append(line.substring(8) + "\n");
	            }
	        }*/
	    }
		
	}
		


	
	

