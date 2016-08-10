package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import elements.Figura;
import elements.Tabla;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BoardButton extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton a8;
	private JButton b8;
	private JButton c8;
	private JButton d8;
	private JButton e8;
	private JButton f8;
	private JButton g8;
	private JButton h8;
	private JButton a7;
	private JButton b7;
	private JButton c7;
	private JButton d7;
	private JButton e7;
	private JButton f7;
	private JButton g7;
	private JButton h7;
	private JButton a6;
	private JButton b6;
	private JButton c6;
	private JButton d6;
	private JButton e6;
	private JButton f6;
	private JButton g6;
	private JButton h6;
	private JButton a5;
	private JButton b5;
	private JButton c5;
	private JButton d5;
	private JButton e5;
	private JButton f5;
	private JButton g5;
	private JButton h5;
	private JButton a4;
	private JButton b4;
	private JButton c4;
	private JButton d4;
	private JButton e4;
	private JButton f4;
	private JButton g4;
	private JButton h4;
	private JButton a3;
	private JButton b3;
	private JButton c3;
	private JButton d3;
	private JButton e3;
	private JButton f3;
	private JButton g3;
	private JButton h3;
	private JButton a2;
	private JButton b2;
	private JButton c2;
	private JButton d2;
	private JButton e2;
	private JButton f2;
	private JButton g2;
	private JButton h2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblD;
	private JLabel lblE;
	private JLabel lblF;
	private JLabel lblG;
	private JLabel lblH;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JButton a1;
	private JButton b1;
	private JButton c1;
	private JButton d1;
	private JButton e1;
	private JButton f1;
	private JButton g1;
	private JButton h1;
	private JLabel lblNewLabel_2;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private ArrayList<JButton> polja = new ArrayList<>(Arrays.asList( g1, g2, g3, g4, g5,g6,g7,g8,a1,a2,a3,a4,a5,a6,a7,a8,b1,b2,b3,b4,b5,b6,b7,b8,c1,c2,c3,c4,c5,c6,c7,c8,d1,d2,d3,d4,d5,d6,d7,d8,e1,e2,e3,e4,e5,e6,e7,e8,f1,f2,f3,f4,f5,f6,f7,f8,h1,h2,h3,h4,h5,h6,h7,h8));
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardButton frame = new BoardButton();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BoardButton() {
		setBounds(new Rectangle(0, 0, 400, 400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
		
		
		
		a8.setIcon(new ImageIcon("art/pieces/plain/BR.gif"));
		b8.setIcon(new ImageIcon("art/pieces/plain/BN.gif"));
		c8.setIcon(new ImageIcon("art/pieces/plain/BB.gif"));
		d8.setIcon(new ImageIcon("art/pieces/plain/BQ.gif"));
		e8.setIcon(new ImageIcon("art/pieces/plain/BK.gif"));
		f8.setIcon(new ImageIcon("art/pieces/plain/BB.gif"));
		g8.setIcon(new ImageIcon("art/pieces/plain/BN.gif"));
		h8.setIcon(new ImageIcon("art/pieces/plain/BR.gif"));
		a7.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		b7.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		c7.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		d7.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		e7.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		f7.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		g7.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		h7.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		a1.setIcon(new ImageIcon("art/pieces/plain/WR.gif"));
		b1.setIcon(new ImageIcon("art/pieces/plain/WN.gif"));
		c1.setIcon(new ImageIcon("art/pieces/plain/WB.gif"));
		d1.setIcon(new ImageIcon("art/pieces/plain/WQ.gif"));
		e1.setIcon(new ImageIcon("art/pieces/plain/WK.gif"));
		f1.setIcon(new ImageIcon("art/pieces/plain/WB.gif"));
		g1.setIcon(new ImageIcon("art/pieces/plain/WN.gif"));
		h1.setIcon(new ImageIcon("art/pieces/plain/WR.gif"));
		a2.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		b2.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		c2.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		d2.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		e2.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		f2.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		g2.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		h2.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		
		
		
		GenerisiFigure();
	}

	public void Move()
	{
		//TODO
		
	}
	
	
	ArrayList<Figura> beleFigure = new ArrayList<Figura>();
	ArrayList<Figura> crneFigure = new ArrayList<Figura>();
	
	ArrayList<Figura> pojedeneBele = new ArrayList<>();
	ArrayList<Figura> pojedeneCrne = new ArrayList<>();
	
	public void GenerisiFigure()
	{
		pojedeneBele = new ArrayList<>();
		pojedeneCrne = new ArrayList<>();
		crneFigure = new ArrayList<>();
		beleFigure = new ArrayList<>();
		
		//bele
		for (int i = 0; i < 8; i++) 
		{
			beleFigure.add(new Figura("art/pieces/plain/WP.gif", "w", "p"));
		}
		for (int i = 0; i < 2; i++) 
		{
			beleFigure.add(new Figura("art/pieces/plain/WN.gif","w", "n"));
			beleFigure.add(new Figura("art/pieces/plain/WR.gif","w", "r"));
			beleFigure.add(new Figura("art/pieces/plain/WB.gif","w", "b"));
		}
		beleFigure.add(new Figura("art/pieces/plain/WK.gif","w", "k"));
		beleFigure.add(new Figura("art/pieces/plain/WQ.gif","w", "q"));
		
		
		//crne
		for (int i = 0; i < 8; i++) 
		{
			crneFigure.add(new Figura("art/pieces/plain/WP.gif", "b", "p"));
		}
		for (int i = 0; i < 2; i++) 
		{
			crneFigure.add(new Figura("art/pieces/plain/WN.gif","b", "n"));
			crneFigure.add(new Figura("art/pieces/plain/WR.gif","b", "r"));
			crneFigure.add(new Figura("art/pieces/plain/WB.gif","b", "b"));
		}
		crneFigure.add(new Figura("art/pieces/plain/WK.gif","b", "k"));
		crneFigure.add(new Figura("art/pieces/plain/WQ.gif","b", "q"));
		
	}
	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(new Rectangle(0, 0, 400, 400));
			panel.setLayout(null);
			panel.add(getA8());
			panel.add(getB8());
			panel.add(getC8());
			panel.add(getD8());
			panel.add(getE8());
			panel.add(getF8());
			panel.add(getG8());
			panel.add(getH8());
			panel.add(getA7());
			panel.add(getB7());
			panel.add(getC7());
			panel.add(getD7());
			panel.add(getE7());
			panel.add(getF7());
			panel.add(getG7());
			panel.add(getH7());
			panel.add(getA6());
			panel.add(getB6());
			panel.add(getC6());
			panel.add(getD6());
			panel.add(getE6());
			panel.add(getF6());
			panel.add(getG6());
			panel.add(getH6());
			panel.add(getA5());
			panel.add(getB5());
			panel.add(getC5());
			panel.add(getD5());
			panel.add(getE5());
			panel.add(getF5());
			panel.add(getG5());
			panel.add(getH5());
			panel.add(getA4());
			panel.add(getB4());
			panel.add(getC4());
			panel.add(getD4());
			panel.add(getE4());
			panel.add(getF4());
			panel.add(getG4());
			panel.add(getH4());
			panel.add(getA3());
			panel.add(getB3());
			panel.add(getC3());
			panel.add(getD3());
			panel.add(getE3());
			panel.add(getF3());
			panel.add(getG3());
			panel.add(getH3());
			panel.add(getA2());
			panel.add(getB2());
			panel.add(getC2());
			panel.add(getD2());
			panel.add(getE2());
			panel.add(getF2());
			panel.add(getG2());
			panel.add(getH2());
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblB());
			panel.add(getLblC());
			panel.add(getLblD());
			panel.add(getLblE());
			panel.add(getLblF());
			panel.add(getLblG());
			panel.add(getLblH());
			panel.add(getLabel());
			panel.add(getLabel_1());
			panel.add(getLabel_2());
			panel.add(getLabel_3());
			panel.add(getLabel_4());
			panel.add(getLabel_5());
			panel.add(getLabel_6());
			panel.add(getLabel_7());
			panel.add(getLabel_8());
			panel.add(getLabel_9());
			panel.add(getLabel_10());
			panel.add(getLabel_11());
			panel.add(getLabel_12());
			panel.add(getLabel_13());
			panel.add(getA1());
			panel.add(getB1());
			panel.add(getC1());
			panel.add(getD1());
			panel.add(getE1());
			panel.add(getF1());
			panel.add(getG1());
			panel.add(getH1());
			panel.add(getLblNewLabel_2());
			panel.add(getLabel_14());
			panel.add(getLabel_15());
			panel.add(getLabel_16());
			panel.add(getLabel_17());
			panel.add(getLabel_18());
			panel.add(getLabel_19());
			panel.add(getLabel_20());
			panel.add(getLabel_21());
		}
		return panel;
	}
	private JButton getA8() {
		if (a8 == null) {
			a8 = new JButton("");
			a8.setBackground(Color.WHITE);
			a8.setBounds(new Rectangle(0, 0, 50, 50));
			a8.setBounds(50, 50, 50, 50);
		}
		return a8;
	}
	private JButton getB8() {
		if (b8 == null) {
			b8 = new JButton("");
			b8.setBackground(new Color(210, 105, 30));
			b8.setBounds(100, 50, 50, 50);
		}
		return b8;
	}
	private JButton getC8() {
		if (c8 == null) {
			c8 = new JButton("");
			c8.setBackground(Color.WHITE);
			c8.setBounds(150, 50, 50, 50);
		}
		return c8;
	}
	private JButton getD8() {
		if (d8 == null) {
			d8 = new JButton("");
			d8.setBackground(new Color(210, 105, 30));
			d8.setBounds(200, 50, 50, 50);
		}
		return d8;
	}
	private JButton getE8() {
		if (e8 == null) {
			e8 = new JButton("");
			e8.setBackground(Color.WHITE);
			e8.setBounds(250, 50, 50, 50);
		}
		return e8;
	}
	private JButton getF8() {
		if (f8 == null) {
			f8 = new JButton("");
			f8.setBackground(new Color(210, 105, 30));
			f8.setBounds(300, 50, 50, 50);
		}
		return f8;
	}
	private JButton getG8() {
		if (g8 == null) {
			g8 = new JButton("");
			g8.setBackground(Color.WHITE);
			g8.setBounds(350, 50, 50, 50);
		}
		return g8;
	}
	private JButton getH8() {
		if (h8 == null) {
			h8 = new JButton("");
			h8.setBackground(new Color(210, 105, 30));
			h8.setBounds(400, 50, 50, 50);
		}
		return h8;
	}
	private JButton getA7() {
		if (a7 == null) {
			a7 = new JButton("");
			a7.setBackground(new Color(210, 105, 30));
			a7.setBounds(new Rectangle(0, 0, 50, 50));
			a7.setBounds(50, 100, 50, 50);
		}
		return a7;
	}
	private JButton getB7() {
		if (b7 == null) {
			b7 = new JButton("");
			b7.setBackground(Color.WHITE);
			b7.setBounds(100, 100, 50, 50);
		}
		return b7;
	}
	private JButton getC7() {
		if (c7 == null) {
			c7 = new JButton("");
			c7.setBackground(new Color(210, 105, 30));
			c7.setBounds(150, 100, 50, 50);
		}
		return c7;
	}
	private JButton getD7() {
		if (d7 == null) {
			d7 = new JButton("");
			d7.setBackground(Color.WHITE);
			d7.setBounds(200, 100, 50, 50);
		}
		return d7;
	}
	private JButton getE7() {
		if (e7 == null) {
			e7 = new JButton("");
			e7.setBackground(new Color(210, 105, 30));
			e7.setBounds(250, 100, 50, 50);
		}
		return e7;
	}
	private JButton getF7() {
		if (f7 == null) {
			f7 = new JButton("");
			f7.setBackground(Color.WHITE);
			f7.setBounds(300, 100, 50, 50);
		}
		return f7;
	}
	private JButton getG7() {
		if (g7 == null) {
			g7 = new JButton("");
			g7.setBackground(new Color(210, 105, 30));
			g7.setBounds(350, 100, 50, 50);
		}
		return g7;
	}
	private JButton getH7() {
		if (h7 == null) {
			h7 = new JButton("");
			h7.setBackground(Color.WHITE);
			h7.setBounds(400, 100, 50, 50);
		}
		return h7;
	}
	private JButton getA6() {
		if (a6 == null) {
			a6 = new JButton("");
			a6.setBackground(Color.WHITE);
			a6.setBounds(new Rectangle(0, 0, 50, 50));
			a6.setBounds(50, 150, 50, 50);
		}
		return a6;
	}
	private JButton getB6() {
		if (b6 == null) {
			b6 = new JButton("");
			b6.setBackground(new Color(210, 105, 30));
			b6.setBounds(100, 150, 50, 50);
		}
		return b6;
	}
	private JButton getC6() {
		if (c6 == null) {
			c6 = new JButton("");
			c6.setBackground(Color.WHITE);
			c6.setBounds(150, 150, 50, 50);
		}
		return c6;
	}
	private JButton getD6() {
		if (d6 == null) {
			d6 = new JButton("");
			d6.setBackground(new Color(210, 105, 30));
			d6.setBounds(200, 150, 50, 50);
		}
		return d6;
	}
	private JButton getE6() {
		if (e6 == null) {
			e6 = new JButton("");
			e6.setBackground(Color.WHITE);
			e6.setBounds(250, 150, 50, 50);
		}
		return e6;
	}
	private JButton getF6() {
		if (f6 == null) {
			f6 = new JButton("");
			f6.setBackground(new Color(210, 105, 30));
			f6.setBounds(300, 150, 50, 50);
		}
		return f6;
	}
	private JButton getG6() {
		if (g6 == null) {
			g6 = new JButton("");
			g6.setBackground(new Color(255, 255, 255));
			g6.setBounds(350, 150, 50, 50);
		}
		return g6;
	}
	private JButton getH6() {
		if (h6 == null) {
			h6 = new JButton("");
			h6.setBackground(new Color(210, 105, 30));
			h6.setBounds(400, 150, 50, 50);
		}
		return h6;
	}
	private JButton getA5() {
		if (a5 == null) {
			a5 = new JButton("");
			a5.setBackground(new Color(210, 105, 30));
			a5.setBounds(new Rectangle(0, 0, 50, 50));
			a5.setBounds(50, 200, 50, 50);
		}
		return a5;
	}
	private JButton getB5() {
		if (b5 == null) {
			b5 = new JButton("");
			b5.setBackground(Color.WHITE);
			b5.setBounds(100, 200, 50, 50);
		}
		return b5;
	}
	private JButton getC5() {
		if (c5 == null) {
			c5 = new JButton("");
			c5.setBackground(new Color(210, 105, 30));
			c5.setBounds(150, 200, 50, 50);
		}
		return c5;
	}
	private JButton getD5() {
		if (d5 == null) {
			d5 = new JButton("");
			d5.setBackground(Color.WHITE);
			d5.setBounds(200, 200, 50, 50);
		}
		return d5;
	}
	private JButton getE5() {
		if (e5 == null) {
			e5 = new JButton("");
			e5.setBackground(new Color(210, 105, 30));
			e5.setBounds(250, 200, 50, 50);
		}
		return e5;
	}
	private JButton getF5() {
		if (f5 == null) {
			f5 = new JButton("");
			f5.setBackground(new Color(255, 255, 255));
			f5.setBounds(300, 200, 50, 50);
		}
		return f5;
	}
	private JButton getG5() {
		if (g5 == null) {
			g5 = new JButton("");
			g5.setBackground(new Color(210, 105, 30));
			g5.setBounds(350, 200, 50, 50);
		}
		return g5;
	}
	private JButton getH5() {
		if (h5 == null) {
			h5 = new JButton("");
			h5.setBackground(new Color(255, 255, 255));
			h5.setBounds(400, 200, 50, 50);
		}
		return h5;
	}
	private JButton getA4() {
		if (a4 == null) {
			a4 = new JButton("");
			a4.setBackground(Color.WHITE);
			a4.setBounds(new Rectangle(0, 0, 50, 50));
			a4.setBounds(50, 250, 50, 50);
		}
		return a4;
	}
	private JButton getB4() {
		if (b4 == null) {
			b4 = new JButton("");
			b4.setBackground(new Color(210, 105, 30));
			b4.setBounds(100, 250, 50, 50);
		}
		return b4;
	}
	private JButton getC4() {
		if (c4 == null) {
			c4 = new JButton("");
			c4.setBackground(new Color(255, 255, 255));
			c4.setBounds(150, 250, 50, 50);
		}
		return c4;
	}
	private JButton getD4() {
		if (d4 == null) {
			d4 = new JButton("");
			d4.setBackground(new Color(210, 105, 30));
			d4.setBounds(200, 250, 50, 50);
		}
		return d4;
	}
	private JButton getE4() {
		if (e4 == null) {
			e4 = new JButton("");
			e4.setBackground(Color.WHITE);
			e4.setBounds(250, 250, 50, 50);
		}
		return e4;
	}
	private JButton getF4() {
		if (f4 == null) {
			f4 = new JButton("");
			f4.setBackground(new Color(210, 105, 30));
			f4.setBounds(300, 250, 50, 50);
		}
		return f4;
	}
	private JButton getG4() {
		if (g4 == null) {
			g4 = new JButton("");
			g4.setBackground(new Color(255, 255, 255));
			g4.setBounds(350, 250, 50, 50);
		}
		return g4;
	}
	private JButton getH4() {
		if (h4 == null) {
			h4 = new JButton("");
			h4.setBackground(new Color(210, 105, 30));
			h4.setBounds(400, 250, 50, 50);
		}
		return h4;
	}
	private JButton getA3() {
		if (a3 == null) {
			a3 = new JButton("");
			a3.setBackground(new Color(210, 105, 30));
			a3.setBounds(new Rectangle(0, 0, 50, 50));
			a3.setBounds(50, 300, 50, 50);
		}
		return a3;
	}
	private JButton getB3() {
		if (b3 == null) {
			b3 = new JButton("");
			b3.setBackground(Color.WHITE);
			b3.setBounds(100, 300, 50, 50);
		}
		return b3;
	}
	private JButton getC3() {
		if (c3 == null) {
			c3 = new JButton("");
			c3.setBackground(new Color(210, 105, 30));
			c3.setBounds(150, 300, 50, 50);
		}
		return c3;
	}
	private JButton getD3() {
		if (d3 == null) {
			d3 = new JButton("");
			d3.setBackground(Color.WHITE);
			d3.setBounds(200, 300, 50, 50);
		}
		return d3;
	}
	private JButton getE3() {
		if (e3 == null) {
			e3 = new JButton("");
			e3.setBackground(new Color(210, 105, 30));
			e3.setBounds(250, 300, 50, 50);
		}
		return e3;
	}
	private JButton getF3() {
		if (f3 == null) {
			f3 = new JButton("");
			f3.setBackground(new Color(255, 255, 255));
			f3.setBounds(300, 300, 50, 50);
		}
		return f3;
	}
	private JButton getG3() {
		if (g3 == null) {
			g3 = new JButton("");
			g3.setBackground(new Color(210, 105, 30));
			g3.setBounds(350, 300, 50, 50);
		}
		return g3;
	}
	private JButton getH3() {
		if (h3 == null) {
			h3 = new JButton("");
			h3.setBackground(new Color(255, 255, 255));
			h3.setBounds(400, 300, 50, 50);
		}
		return h3;
	}
	private JButton getA2() {
		if (a2 == null) {
			a2 = new JButton("");
			a2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a3.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
					a2.setIcon(null);
				}
			});
			a2.setBackground(Color.WHITE);
			a2.setBounds(new Rectangle(0, 0, 50, 50));
			a2.setBounds(50, 350, 50, 50);
		}
		return a2;
	}
	private JButton getB2() {
		if (b2 == null) {
			b2 = new JButton("");
			b2.setBackground(new Color(210, 105, 30));
			b2.setBounds(100, 350, 50, 50);
		}
		return b2;
	}
	private JButton getC2() {
		if (c2 == null) {
			c2 = new JButton("");
			c2.setBackground(new Color(255, 255, 255));
			c2.setBounds(150, 350, 50, 50);
		}
		return c2;
	}
	private JButton getD2() {
		if (d2 == null) {
			d2 = new JButton("");
			d2.setBackground(new Color(210, 105, 30));
			d2.setBounds(200, 350, 50, 50);
		}
		return d2;
	}
	private JButton getE2() {
		if (e2 == null) {
			e2 = new JButton("");
			e2.setBackground(Color.WHITE);
			e2.setBounds(250, 350, 50, 50);
		}
		return e2;
	}
	private JButton getF2() {
		if (f2 == null) {
			f2 = new JButton("");
			f2.setBackground(new Color(210, 105, 30));
			f2.setBounds(300, 350, 50, 50);
		}
		return f2;
	}
	private JButton getG2() {
		if (g2 == null) {
			g2 = new JButton("");
			g2.setBackground(new Color(255, 255, 255));
			g2.setBounds(350, 350, 50, 50);
		}
		return g2;
	}
	private JButton getH2() {
		if (h2 == null) {
			h2 = new JButton("");
			h2.setBackground(new Color(210, 105, 30));
			h2.setBounds(400, 350, 50, 50);
		}
		return h2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("A");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(50, 0, 50, 50);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("7");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(0, 100, 50, 50);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblB() {
		if (lblB == null) {
			lblB = new JLabel("B");
			lblB.setHorizontalAlignment(SwingConstants.CENTER);
			lblB.setBounds(100, 0, 50, 50);
		}
		return lblB;
	}
	private JLabel getLblC() {
		if (lblC == null) {
			lblC = new JLabel("C");
			lblC.setHorizontalAlignment(SwingConstants.CENTER);
			lblC.setBounds(150, 0, 50, 50);
		}
		return lblC;
	}
	private JLabel getLblD() {
		if (lblD == null) {
			lblD = new JLabel("D");
			lblD.setHorizontalAlignment(SwingConstants.CENTER);
			lblD.setBounds(200, 0, 50, 50);
		}
		return lblD;
	}
	private JLabel getLblE() {
		if (lblE == null) {
			lblE = new JLabel("E");
			lblE.setHorizontalAlignment(SwingConstants.CENTER);
			lblE.setBounds(250, 0, 50, 50);
		}
		return lblE;
	}
	private JLabel getLblF() {
		if (lblF == null) {
			lblF = new JLabel("F");
			lblF.setHorizontalAlignment(SwingConstants.CENTER);
			lblF.setBounds(300, 0, 50, 50);
		}
		return lblF;
	}
	private JLabel getLblG() {
		if (lblG == null) {
			lblG = new JLabel("G");
			lblG.setHorizontalAlignment(SwingConstants.CENTER);
			lblG.setBounds(350, 0, 50, 50);
		}
		return lblG;
	}
	private JLabel getLblH() {
		if (lblH == null) {
			lblH = new JLabel("H");
			lblH.setHorizontalAlignment(SwingConstants.CENTER);
			lblH.setBounds(400, 0, 50, 50);
		}
		return lblH;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("6");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(0, 150, 50, 50);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("5");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setBounds(0, 200, 50, 50);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("4");
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setBounds(0, 250, 50, 50);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("3");
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setBounds(0, 300, 50, 50);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("2");
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setBounds(0, 350, 50, 50);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("1");
			label_5.setHorizontalAlignment(SwingConstants.CENTER);
			label_5.setBounds(0, 400, 50, 50);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("A");
			label_6.setHorizontalAlignment(SwingConstants.CENTER);
			label_6.setBounds(50, 445, 50, 50);
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("B");
			label_7.setHorizontalAlignment(SwingConstants.CENTER);
			label_7.setBounds(100, 445, 50, 50);
		}
		return label_7;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("C");
			label_8.setHorizontalAlignment(SwingConstants.CENTER);
			label_8.setBounds(150, 445, 50, 50);
		}
		return label_8;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("D");
			label_9.setHorizontalAlignment(SwingConstants.CENTER);
			label_9.setBounds(200, 445, 50, 50);
		}
		return label_9;
	}
	private JLabel getLabel_10() {
		if (label_10 == null) {
			label_10 = new JLabel("E");
			label_10.setHorizontalAlignment(SwingConstants.CENTER);
			label_10.setBounds(250, 445, 50, 50);
		}
		return label_10;
	}
	private JLabel getLabel_11() {
		if (label_11 == null) {
			label_11 = new JLabel("F");
			label_11.setHorizontalAlignment(SwingConstants.CENTER);
			label_11.setBounds(300, 445, 50, 50);
		}
		return label_11;
	}
	private JLabel getLabel_12() {
		if (label_12 == null) {
			label_12 = new JLabel("G");
			label_12.setHorizontalAlignment(SwingConstants.CENTER);
			label_12.setBounds(350, 445, 50, 50);
		}
		return label_12;
	}
	private JLabel getLabel_13() {
		if (label_13 == null) {
			label_13 = new JLabel("H");
			label_13.setHorizontalAlignment(SwingConstants.CENTER);
			label_13.setBounds(400, 445, 50, 50);
		}
		return label_13;
	}
	private JButton getA1() {
		if (a1 == null) {
			a1 = new JButton("");
			a1.setBounds(new Rectangle(0, 0, 50, 50));
			a1.setBackground(new Color(210, 105, 30));
			a1.setBounds(50, 400, 50, 50);
		}
		return a1;
	}
	private JButton getB1() {
		if (b1 == null) {
			b1 = new JButton("");
			b1.setBackground(Color.WHITE);
			b1.setBounds(100, 400, 50, 50);
		}
		return b1;
	}
	private JButton getC1() {
		if (c1 == null) {
			c1 = new JButton("");
			c1.setBackground(new Color(210, 105, 30));
			c1.setBounds(150, 400, 50, 50);
		}
		return c1;
	}
	private JButton getD1() {
		if (d1 == null) {
			d1 = new JButton("");
			d1.setBackground(Color.WHITE);
			d1.setBounds(200, 400, 50, 50);
		}
		return d1;
	}
	private JButton getE1() {
		if (e1 == null) {
			e1 = new JButton("");
			e1.setBackground(new Color(210, 105, 30));
			e1.setBounds(250, 400, 50, 50);
		}
		return e1;
	}
	private JButton getF1() {
		if (f1 == null) {
			f1 = new JButton("");
			f1.setBackground(Color.WHITE);
			f1.setBounds(300, 400, 50, 50);
		}
		return f1;
	}
	private JButton getG1() {
		if (g1 == null) {
			g1 = new JButton("");
			g1.setBackground(new Color(210, 105, 30));
			g1.setBounds(350, 400, 50, 50);
		}
		return g1;
	}
	private JButton getH1() {
		if (h1 == null) {
			h1 = new JButton("");
			h1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			h1.setBackground(Color.WHITE);
			h1.setBounds(400, 400, 50, 50);
		}
		return h1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("8");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(0, 50, 50, 50);
		}
		return lblNewLabel_2;
	}
	private JLabel getLabel_14() {
		if (label_14 == null) {
			label_14 = new JLabel("1");
			label_14.setHorizontalAlignment(SwingConstants.CENTER);
			label_14.setBounds(450, 400, 50, 50);
		}
		return label_14;
	}
	private JLabel getLabel_15() {
		if (label_15 == null) {
			label_15 = new JLabel("2");
			label_15.setHorizontalAlignment(SwingConstants.CENTER);
			label_15.setBounds(450, 350, 50, 50);
		}
		return label_15;
	}
	private JLabel getLabel_16() {
		if (label_16 == null) {
			label_16 = new JLabel("3");
			label_16.setHorizontalAlignment(SwingConstants.CENTER);
			label_16.setBounds(450, 300, 50, 50);
		}
		return label_16;
	}
	private JLabel getLabel_17() {
		if (label_17 == null) {
			label_17 = new JLabel("4");
			label_17.setHorizontalAlignment(SwingConstants.CENTER);
			label_17.setBounds(450, 250, 50, 50);
		}
		return label_17;
	}
	private JLabel getLabel_18() {
		if (label_18 == null) {
			label_18 = new JLabel("5");
			label_18.setHorizontalAlignment(SwingConstants.CENTER);
			label_18.setBounds(450, 200, 50, 50);
		}
		return label_18;
	}
	private JLabel getLabel_19() {
		if (label_19 == null) {
			label_19 = new JLabel("6");
			label_19.setHorizontalAlignment(SwingConstants.CENTER);
			label_19.setBounds(450, 150, 50, 50);
		}
		return label_19;
	}
	private JLabel getLabel_20() {
		if (label_20 == null) {
			label_20 = new JLabel("7");
			label_20.setHorizontalAlignment(SwingConstants.CENTER);
			label_20.setBounds(450, 100, 50, 50);
		}
		return label_20;
	}
	private JLabel getLabel_21() {
		if (label_21 == null) {
			label_21 = new JLabel("8");
			label_21.setHorizontalAlignment(SwingConstants.CENTER);
			label_21.setBounds(450, 50, 50, 50);
		}
		return label_21;
	}
}
