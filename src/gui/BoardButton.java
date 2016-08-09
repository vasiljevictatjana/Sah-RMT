package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BoardButton extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_7;
	private JButton button_6;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	private JButton button_19;
	private JButton button_20;
	private JButton button_21;
	private JButton button_22;
	private JButton button_23;
	private JButton button_24;
	private JButton button_25;
	private JButton button_26;
	private JButton button_27;
	private JButton button_28;
	private JButton button_29;
	private JButton button_30;
	private JButton button_31;
	private JButton button_32;
	private JButton button_33;
	private JButton button_34;
	private JButton button_35;
	private JButton button_36;
	private JButton button_37;
	private JButton button_38;
	private JButton button_39;
	private JButton button_40;
	private JButton button_41;
	private JButton button_42;
	private JButton button_43;
	private JButton button_44;
	private JButton button_45;
	private JButton button_46;
	private JButton button_47;
	private JButton button_48;
	private JButton button_49;
	private JButton button_50;
	private JButton button_51;
	private JButton button_52;
	private JButton button_53;
	private JButton button_54;
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
	private JButton button_55;
	private JButton button_56;
	private JButton button_57;
	private JButton button_58;
	private JButton button_59;
	private JButton button_60;
	private JButton button_61;
	private JButton button_62;
	private JLabel lblNewLabel_2;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;

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
		
		
		btnNewButton.setIcon(new ImageIcon("art/pieces/plain/BR.gif"));
		button.setIcon(new ImageIcon("art/pieces/plain/BN.gif"));
		button_1.setIcon(new ImageIcon("art/pieces/plain/BB.gif"));
		button_2.setIcon(new ImageIcon("art/pieces/plain/BQ.gif"));
		button_3.setIcon(new ImageIcon("art/pieces/plain/BK.gif"));
		button_4.setIcon(new ImageIcon("art/pieces/plain/BB.gif"));
		button_5.setIcon(new ImageIcon("art/pieces/plain/BN.gif"));
		button_7.setIcon(new ImageIcon("art/pieces/plain/BR.gif"));
		button_6.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		button_8.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		button_9.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		button_10.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		button_11.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		button_12.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		button_13.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		button_14.setIcon(new ImageIcon("art/pieces/plain/BP.gif"));
		button_55.setIcon(new ImageIcon("art/pieces/plain/WR.gif"));
		button_56.setIcon(new ImageIcon("art/pieces/plain/WN.gif"));
		button_57.setIcon(new ImageIcon("art/pieces/plain/WB.gif"));
		button_58.setIcon(new ImageIcon("art/pieces/plain/WQ.gif"));
		button_59.setIcon(new ImageIcon("art/pieces/plain/WK.gif"));
		button_60.setIcon(new ImageIcon("art/pieces/plain/WB.gif"));
		button_61.setIcon(new ImageIcon("art/pieces/plain/WN.gif"));
		button_62.setIcon(new ImageIcon("art/pieces/plain/WR.gif"));
		button_47.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		button_48.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		button_49.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		button_50.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		button_51.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		button_52.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		button_53.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		button_54.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
		
		
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(new Rectangle(0, 0, 400, 400));
			panel.setLayout(null);
			panel.add(getBtnNewButton());
			panel.add(getButton());
			panel.add(getButton_1());
			panel.add(getButton_2());
			panel.add(getButton_3());
			panel.add(getButton_4());
			panel.add(getButton_5());
			panel.add(getButton_7());
			panel.add(getButton_6());
			panel.add(getButton_8());
			panel.add(getButton_9());
			panel.add(getButton_10());
			panel.add(getButton_11());
			panel.add(getButton_12());
			panel.add(getButton_13());
			panel.add(getButton_14());
			panel.add(getButton_15());
			panel.add(getButton_16());
			panel.add(getButton_17());
			panel.add(getButton_18());
			panel.add(getButton_19());
			panel.add(getButton_20());
			panel.add(getButton_21());
			panel.add(getButton_22());
			panel.add(getButton_23());
			panel.add(getButton_24());
			panel.add(getButton_25());
			panel.add(getButton_26());
			panel.add(getButton_27());
			panel.add(getButton_28());
			panel.add(getButton_29());
			panel.add(getButton_30());
			panel.add(getButton_31());
			panel.add(getButton_32());
			panel.add(getButton_33());
			panel.add(getButton_34());
			panel.add(getButton_35());
			panel.add(getButton_36());
			panel.add(getButton_37());
			panel.add(getButton_38());
			panel.add(getButton_39());
			panel.add(getButton_40());
			panel.add(getButton_41());
			panel.add(getButton_42());
			panel.add(getButton_43());
			panel.add(getButton_44());
			panel.add(getButton_45());
			panel.add(getButton_46());
			panel.add(getButton_47());
			panel.add(getButton_48());
			panel.add(getButton_49());
			panel.add(getButton_50());
			panel.add(getButton_51());
			panel.add(getButton_52());
			panel.add(getButton_53());
			panel.add(getButton_54());
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
			panel.add(getButton_55());
			panel.add(getButton_56());
			panel.add(getButton_57());
			panel.add(getButton_58());
			panel.add(getButton_59());
			panel.add(getButton_60());
			panel.add(getButton_61());
			panel.add(getButton_62());
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
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setBounds(new Rectangle(0, 0, 50, 50));
			btnNewButton.setBounds(50, 50, 50, 50);
		}
		return btnNewButton;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("");
			button.setBackground(new Color(210, 105, 30));
			button.setBounds(100, 50, 50, 50);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("");
			button_1.setBackground(Color.WHITE);
			button_1.setBounds(150, 50, 50, 50);
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("");
			button_2.setBackground(new Color(210, 105, 30));
			button_2.setBounds(200, 50, 50, 50);
		}
		return button_2;
	}
	private JButton getButton_3() {
		if (button_3 == null) {
			button_3 = new JButton("");
			button_3.setBackground(Color.WHITE);
			button_3.setBounds(250, 50, 50, 50);
		}
		return button_3;
	}
	private JButton getButton_4() {
		if (button_4 == null) {
			button_4 = new JButton("");
			button_4.setBackground(new Color(210, 105, 30));
			button_4.setBounds(300, 50, 50, 50);
		}
		return button_4;
	}
	private JButton getButton_5() {
		if (button_5 == null) {
			button_5 = new JButton("");
			button_5.setBackground(Color.WHITE);
			button_5.setBounds(350, 50, 50, 50);
		}
		return button_5;
	}
	private JButton getButton_7() {
		if (button_7 == null) {
			button_7 = new JButton("");
			button_7.setBackground(new Color(210, 105, 30));
			button_7.setBounds(400, 50, 50, 50);
		}
		return button_7;
	}
	private JButton getButton_6() {
		if (button_6 == null) {
			button_6 = new JButton("");
			button_6.setBackground(new Color(210, 105, 30));
			button_6.setBounds(new Rectangle(0, 0, 50, 50));
			button_6.setBounds(50, 100, 50, 50);
		}
		return button_6;
	}
	private JButton getButton_8() {
		if (button_8 == null) {
			button_8 = new JButton("");
			button_8.setBackground(Color.WHITE);
			button_8.setBounds(100, 100, 50, 50);
		}
		return button_8;
	}
	private JButton getButton_9() {
		if (button_9 == null) {
			button_9 = new JButton("");
			button_9.setBackground(new Color(210, 105, 30));
			button_9.setBounds(150, 100, 50, 50);
		}
		return button_9;
	}
	private JButton getButton_10() {
		if (button_10 == null) {
			button_10 = new JButton("");
			button_10.setBackground(Color.WHITE);
			button_10.setBounds(200, 100, 50, 50);
		}
		return button_10;
	}
	private JButton getButton_11() {
		if (button_11 == null) {
			button_11 = new JButton("");
			button_11.setBackground(new Color(210, 105, 30));
			button_11.setBounds(250, 100, 50, 50);
		}
		return button_11;
	}
	private JButton getButton_12() {
		if (button_12 == null) {
			button_12 = new JButton("");
			button_12.setBackground(Color.WHITE);
			button_12.setBounds(300, 100, 50, 50);
		}
		return button_12;
	}
	private JButton getButton_13() {
		if (button_13 == null) {
			button_13 = new JButton("");
			button_13.setBackground(new Color(210, 105, 30));
			button_13.setBounds(350, 100, 50, 50);
		}
		return button_13;
	}
	private JButton getButton_14() {
		if (button_14 == null) {
			button_14 = new JButton("");
			button_14.setBackground(Color.WHITE);
			button_14.setBounds(400, 100, 50, 50);
		}
		return button_14;
	}
	private JButton getButton_15() {
		if (button_15 == null) {
			button_15 = new JButton("");
			button_15.setBackground(Color.WHITE);
			button_15.setBounds(new Rectangle(0, 0, 50, 50));
			button_15.setBounds(50, 150, 50, 50);
		}
		return button_15;
	}
	private JButton getButton_16() {
		if (button_16 == null) {
			button_16 = new JButton("");
			button_16.setBackground(new Color(210, 105, 30));
			button_16.setBounds(100, 150, 50, 50);
		}
		return button_16;
	}
	private JButton getButton_17() {
		if (button_17 == null) {
			button_17 = new JButton("");
			button_17.setBackground(Color.WHITE);
			button_17.setBounds(150, 150, 50, 50);
		}
		return button_17;
	}
	private JButton getButton_18() {
		if (button_18 == null) {
			button_18 = new JButton("");
			button_18.setBackground(new Color(210, 105, 30));
			button_18.setBounds(200, 150, 50, 50);
		}
		return button_18;
	}
	private JButton getButton_19() {
		if (button_19 == null) {
			button_19 = new JButton("");
			button_19.setBackground(Color.WHITE);
			button_19.setBounds(250, 150, 50, 50);
		}
		return button_19;
	}
	private JButton getButton_20() {
		if (button_20 == null) {
			button_20 = new JButton("");
			button_20.setBackground(new Color(210, 105, 30));
			button_20.setBounds(300, 150, 50, 50);
		}
		return button_20;
	}
	private JButton getButton_21() {
		if (button_21 == null) {
			button_21 = new JButton("");
			button_21.setBackground(new Color(255, 255, 255));
			button_21.setBounds(350, 150, 50, 50);
		}
		return button_21;
	}
	private JButton getButton_22() {
		if (button_22 == null) {
			button_22 = new JButton("");
			button_22.setBackground(new Color(210, 105, 30));
			button_22.setBounds(400, 150, 50, 50);
		}
		return button_22;
	}
	private JButton getButton_23() {
		if (button_23 == null) {
			button_23 = new JButton("");
			button_23.setBackground(new Color(210, 105, 30));
			button_23.setBounds(new Rectangle(0, 0, 50, 50));
			button_23.setBounds(50, 200, 50, 50);
		}
		return button_23;
	}
	private JButton getButton_24() {
		if (button_24 == null) {
			button_24 = new JButton("");
			button_24.setBackground(Color.WHITE);
			button_24.setBounds(100, 200, 50, 50);
		}
		return button_24;
	}
	private JButton getButton_25() {
		if (button_25 == null) {
			button_25 = new JButton("");
			button_25.setBackground(new Color(210, 105, 30));
			button_25.setBounds(150, 200, 50, 50);
		}
		return button_25;
	}
	private JButton getButton_26() {
		if (button_26 == null) {
			button_26 = new JButton("");
			button_26.setBackground(Color.WHITE);
			button_26.setBounds(200, 200, 50, 50);
		}
		return button_26;
	}
	private JButton getButton_27() {
		if (button_27 == null) {
			button_27 = new JButton("");
			button_27.setBackground(new Color(210, 105, 30));
			button_27.setBounds(250, 200, 50, 50);
		}
		return button_27;
	}
	private JButton getButton_28() {
		if (button_28 == null) {
			button_28 = new JButton("");
			button_28.setBackground(new Color(255, 255, 255));
			button_28.setBounds(300, 200, 50, 50);
		}
		return button_28;
	}
	private JButton getButton_29() {
		if (button_29 == null) {
			button_29 = new JButton("");
			button_29.setBackground(new Color(210, 105, 30));
			button_29.setBounds(350, 200, 50, 50);
		}
		return button_29;
	}
	private JButton getButton_30() {
		if (button_30 == null) {
			button_30 = new JButton("");
			button_30.setBackground(new Color(255, 255, 255));
			button_30.setBounds(400, 200, 50, 50);
		}
		return button_30;
	}
	private JButton getButton_31() {
		if (button_31 == null) {
			button_31 = new JButton("");
			button_31.setBackground(Color.WHITE);
			button_31.setBounds(new Rectangle(0, 0, 50, 50));
			button_31.setBounds(50, 250, 50, 50);
		}
		return button_31;
	}
	private JButton getButton_32() {
		if (button_32 == null) {
			button_32 = new JButton("");
			button_32.setBackground(new Color(210, 105, 30));
			button_32.setBounds(100, 250, 50, 50);
		}
		return button_32;
	}
	private JButton getButton_33() {
		if (button_33 == null) {
			button_33 = new JButton("");
			button_33.setBackground(new Color(255, 255, 255));
			button_33.setBounds(150, 250, 50, 50);
		}
		return button_33;
	}
	private JButton getButton_34() {
		if (button_34 == null) {
			button_34 = new JButton("");
			button_34.setBackground(new Color(210, 105, 30));
			button_34.setBounds(200, 250, 50, 50);
		}
		return button_34;
	}
	private JButton getButton_35() {
		if (button_35 == null) {
			button_35 = new JButton("");
			button_35.setBackground(Color.WHITE);
			button_35.setBounds(250, 250, 50, 50);
		}
		return button_35;
	}
	private JButton getButton_36() {
		if (button_36 == null) {
			button_36 = new JButton("");
			button_36.setBackground(new Color(210, 105, 30));
			button_36.setBounds(300, 250, 50, 50);
		}
		return button_36;
	}
	private JButton getButton_37() {
		if (button_37 == null) {
			button_37 = new JButton("");
			button_37.setBackground(new Color(255, 255, 255));
			button_37.setBounds(350, 250, 50, 50);
		}
		return button_37;
	}
	private JButton getButton_38() {
		if (button_38 == null) {
			button_38 = new JButton("");
			button_38.setBackground(new Color(210, 105, 30));
			button_38.setBounds(400, 250, 50, 50);
		}
		return button_38;
	}
	private JButton getButton_39() {
		if (button_39 == null) {
			button_39 = new JButton("");
			button_39.setBackground(new Color(210, 105, 30));
			button_39.setBounds(new Rectangle(0, 0, 50, 50));
			button_39.setBounds(50, 300, 50, 50);
		}
		return button_39;
	}
	private JButton getButton_40() {
		if (button_40 == null) {
			button_40 = new JButton("");
			button_40.setBackground(Color.WHITE);
			button_40.setBounds(100, 300, 50, 50);
		}
		return button_40;
	}
	private JButton getButton_41() {
		if (button_41 == null) {
			button_41 = new JButton("");
			button_41.setBackground(new Color(210, 105, 30));
			button_41.setBounds(150, 300, 50, 50);
		}
		return button_41;
	}
	private JButton getButton_42() {
		if (button_42 == null) {
			button_42 = new JButton("");
			button_42.setBackground(Color.WHITE);
			button_42.setBounds(200, 300, 50, 50);
		}
		return button_42;
	}
	private JButton getButton_43() {
		if (button_43 == null) {
			button_43 = new JButton("");
			button_43.setBackground(new Color(210, 105, 30));
			button_43.setBounds(250, 300, 50, 50);
		}
		return button_43;
	}
	private JButton getButton_44() {
		if (button_44 == null) {
			button_44 = new JButton("");
			button_44.setBackground(new Color(255, 255, 255));
			button_44.setBounds(300, 300, 50, 50);
		}
		return button_44;
	}
	private JButton getButton_45() {
		if (button_45 == null) {
			button_45 = new JButton("");
			button_45.setBackground(new Color(210, 105, 30));
			button_45.setBounds(350, 300, 50, 50);
		}
		return button_45;
	}
	private JButton getButton_46() {
		if (button_46 == null) {
			button_46 = new JButton("");
			button_46.setBackground(new Color(255, 255, 255));
			button_46.setBounds(400, 300, 50, 50);
		}
		return button_46;
	}
	private JButton getButton_47() {
		if (button_47 == null) {
			button_47 = new JButton("");
			button_47.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					button_39.setIcon(new ImageIcon("art/pieces/plain/WP.gif"));
					button_47.setIcon(null);
				}
			});
			button_47.setBackground(Color.WHITE);
			button_47.setBounds(new Rectangle(0, 0, 50, 50));
			button_47.setBounds(50, 350, 50, 50);
		}
		return button_47;
	}
	private JButton getButton_48() {
		if (button_48 == null) {
			button_48 = new JButton("");
			button_48.setBackground(new Color(210, 105, 30));
			button_48.setBounds(100, 350, 50, 50);
		}
		return button_48;
	}
	private JButton getButton_49() {
		if (button_49 == null) {
			button_49 = new JButton("");
			button_49.setBackground(new Color(255, 255, 255));
			button_49.setBounds(150, 350, 50, 50);
		}
		return button_49;
	}
	private JButton getButton_50() {
		if (button_50 == null) {
			button_50 = new JButton("");
			button_50.setBackground(new Color(210, 105, 30));
			button_50.setBounds(200, 350, 50, 50);
		}
		return button_50;
	}
	private JButton getButton_51() {
		if (button_51 == null) {
			button_51 = new JButton("");
			button_51.setBackground(Color.WHITE);
			button_51.setBounds(250, 350, 50, 50);
		}
		return button_51;
	}
	private JButton getButton_52() {
		if (button_52 == null) {
			button_52 = new JButton("");
			button_52.setBackground(new Color(210, 105, 30));
			button_52.setBounds(300, 350, 50, 50);
		}
		return button_52;
	}
	private JButton getButton_53() {
		if (button_53 == null) {
			button_53 = new JButton("");
			button_53.setBackground(new Color(255, 255, 255));
			button_53.setBounds(350, 350, 50, 50);
		}
		return button_53;
	}
	private JButton getButton_54() {
		if (button_54 == null) {
			button_54 = new JButton("");
			button_54.setBackground(new Color(210, 105, 30));
			button_54.setBounds(400, 350, 50, 50);
		}
		return button_54;
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
	private JButton getButton_55() {
		if (button_55 == null) {
			button_55 = new JButton("");
			button_55.setBounds(new Rectangle(0, 0, 50, 50));
			button_55.setBackground(new Color(210, 105, 30));
			button_55.setBounds(50, 400, 50, 50);
		}
		return button_55;
	}
	private JButton getButton_56() {
		if (button_56 == null) {
			button_56 = new JButton("");
			button_56.setBackground(Color.WHITE);
			button_56.setBounds(100, 400, 50, 50);
		}
		return button_56;
	}
	private JButton getButton_57() {
		if (button_57 == null) {
			button_57 = new JButton("");
			button_57.setBackground(new Color(210, 105, 30));
			button_57.setBounds(150, 400, 50, 50);
		}
		return button_57;
	}
	private JButton getButton_58() {
		if (button_58 == null) {
			button_58 = new JButton("");
			button_58.setBackground(Color.WHITE);
			button_58.setBounds(200, 400, 50, 50);
		}
		return button_58;
	}
	private JButton getButton_59() {
		if (button_59 == null) {
			button_59 = new JButton("");
			button_59.setBackground(new Color(210, 105, 30));
			button_59.setBounds(250, 400, 50, 50);
		}
		return button_59;
	}
	private JButton getButton_60() {
		if (button_60 == null) {
			button_60 = new JButton("");
			button_60.setBackground(Color.WHITE);
			button_60.setBounds(300, 400, 50, 50);
		}
		return button_60;
	}
	private JButton getButton_61() {
		if (button_61 == null) {
			button_61 = new JButton("");
			button_61.setBackground(new Color(210, 105, 30));
			button_61.setBounds(350, 400, 50, 50);
		}
		return button_61;
	}
	private JButton getButton_62() {
		if (button_62 == null) {
			button_62 = new JButton("");
			button_62.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_62.setBackground(Color.WHITE);
			button_62.setBounds(400, 400, 50, 50);
		}
		return button_62;
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
