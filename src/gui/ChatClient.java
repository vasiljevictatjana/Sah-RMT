package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import globalniKlijentiKomunikacija.ChatClientB;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ChatClient extends JFrame {
	
	BufferedReader in;
    PrintWriter out;
	
	static ChatClient frame = new ChatClient();
	
	//private JFrame frame;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea messageArea;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClient client = new ChatClient();
			        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        client.frame.setVisible(true);
			        client.run();
					//ChatClientGlobal frame = new ChatClientGlobal();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatClient() {
		setTitle("Chater");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getTextField_1(), BorderLayout.NORTH);
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
			messageArea.setRows(40);
			messageArea.setColumns(8);
		}
		return messageArea;
	}
	private JTextField getTextField_1() {
		if (textField == null) {
			textField = new JTextField();
			textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					out.println(textField.getText());
	                textField.setText("");
				}
			});
			textField.setEditable(false);
			textField.setColumns(40);
		}
		return textField;
	}
	private String getServerAddress() {
        return JOptionPane.showInputDialog(frame,"Enter IP Address of the Server:",
            "Welcome to the Chatter",
            JOptionPane.QUESTION_MESSAGE);
           
    }
	/*private String getUserName() {
        return JOptionPane.showInputDialog(
            frame,
            "Choose a screen name:",
            "Screen name selection",
            JOptionPane.PLAIN_MESSAGE);
    }*/
	private void run() throws IOException {

        // Make connection and initialize streams
		
        String serverAddress = getServerAddress();
        Socket socket = new Socket(serverAddress, 30121); // if uncomment previous line then "localhost" => serverAddress
        in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        // Process all messages from server, according to the protocol.
        while (true) {
            String line = in.readLine();
            if (line.startsWith("SUBMITNAME")) {
                out.println(getName());
            } else if (line.startsWith("NAMEACCEPTED")) {
                textField.setEditable(true);
            } else if (line.startsWith("MESSAGE")) {
                messageArea.append(line.substring(8) + "\n");
            }
        }
    }
}
