package shopping;

import java.awt.EventQueue;
import shopping.Debit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Bill {

	JFrame Checkout;
	private JButton btncash;
	private JButton btndebit;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill window = new Bill();
					window.Checkout.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Checkout = new JFrame();
		Checkout.setTitle("Checkout");
	Checkout.getContentPane().setBackground(UIManager.getColor("Button.shadow"));
		Checkout.getContentPane().setLayout(null);
		Checkout.setBounds(100,100,700,450);
		
		JLabel lblNewLabel_1 = new JLabel("Payment Method");
		lblNewLabel_1.setBackground(UIManager.getColor("Button.foreground"));
		lblNewLabel_1.setForeground(UIManager.getColor("CheckBox.foreground"));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBounds(46, 90, 223, 36);
		Checkout.getContentPane().add(lblNewLabel_1);
		
		btncash = new JButton("Cash on delivery");
		btncash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Thanks for shopping!!");
				System.exit(0);
				Checkout.dispose();
			}
		});
		btncash.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btncash.setForeground(new Color(255, 240, 245));
		btncash.setBackground(new Color(25, 25, 112));
		btncash.setBounds(236, 166, 176, 36);
		Checkout.getContentPane().add(btncash);
		
		btndebit = new JButton("Via debit card");
		btndebit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Debit d=new Debit();
			d.NewScreen();
			Checkout.dispose();
			}
		});
		btndebit.setForeground(new Color(255, 240, 245));
		btndebit.setBackground(new Color(25, 25, 112));
		btndebit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btndebit.setBounds(236, 241, 176, 36);
		Checkout.getContentPane().add(btndebit);
		
		Checkout.setBounds(100, 100, 654, 435);
		Checkout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
