package shopping;

import java.awt.EventQueue;
import javax.swing.JButton;
import shopping.Cart;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.UIManager;

public class kkstore implements ActionListener{
	String ktotal;
	double[] itemcost= new double[14];

	 JFrame frmItemss;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kkstore window = new kkstore();
					window.frmItemss.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kkstore() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmItemss = new JFrame();
		frmItemss.setTitle("Itemss");
		frmItemss.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
			
			}
		});
		frmItemss.setBounds(100, 100, 700, 450);
		frmItemss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmItemss.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frmItemss.getContentPane().add(panel);
		panel.setLayout(new GridLayout(12, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Items available in the store");
		lblNewLabel.setForeground(UIManager.getColor("Button.foreground"));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JButton btnCucumber = new JButton("Cucumber $2 per lbs");
		btnCucumber.setForeground(UIManager.getColor("Button.foreground"));
		btnCucumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCucumber.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(btnCucumber);
		
		JButton btnCapsicum = new JButton("Capsicum $1.8 per lbs");
		btnCapsicum.setForeground(UIManager.getColor("Button.foreground"));
		btnCapsicum.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCapsicum.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(btnCapsicum);
		
		JButton btnMushrooms = new JButton("Mushrooms $3.8 per lbs");
		btnMushrooms.setForeground(UIManager.getColor("Button.foreground"));
		btnMushrooms.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMushrooms.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(btnMushrooms);
		
		JButton btnWine = new JButton("Chocolate $0.7 per bar");
		btnWine.setForeground(UIManager.getColor("Button.foreground"));
		btnWine.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnWine.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(btnWine);
		
		JButton btnBanana = new JButton("Banana $1.1 per dozen");
		btnBanana.setForeground(UIManager.getColor("Button.foreground"));
		btnBanana.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBanana.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(btnBanana);
		
		JButton btnBlueBerry = new JButton("Blue berry $1.2 per lbs");
		btnBlueBerry.setForeground(UIManager.getColor("Button.foreground"));
		btnBlueBerry.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBlueBerry.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(btnBlueBerry);
		
		JButton btnMozrellaCheese = new JButton("Cheese $3.4 a package");
		btnMozrellaCheese.setForeground(UIManager.getColor("Button.foreground"));
		btnMozrellaCheese.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMozrellaCheese.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(btnMozrellaCheese);
		
		JButton btnNewButton = new JButton("Strawberry $1.4 per lbs");
		btnNewButton.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		JButton btnApple = new JButton("Apple $1.94 per lbs");
		btnApple.setForeground(UIManager.getColor("Button.foreground"));
		
		
			
		btnApple.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnApple.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(btnApple);
		
		JButton btnPasta = new JButton("Pasta $4.1 per lbs");
		btnPasta.setForeground(UIManager.getColor("Button.foreground"));
		btnPasta.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPasta.setBackground(UIManager.getColor("Button.shadow"));
		panel.add(btnPasta);
		
		JButton btnNewButton_1 = new JButton("Click to add items into your cart");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Cart s=new Cart();
				s.NewScreen();
				frmItemss.dispose();
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		panel.add(btnNewButton_1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
