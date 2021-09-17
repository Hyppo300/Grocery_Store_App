package shopping;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Debit {

	 JFrame debu;
	
	 

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Debit window = new Debit();
					window.debu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Debit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		debu = new JFrame();
		debu.setTitle("Debit Card payment");
		debu.getContentPane().setBackground(new Color(47, 79, 79));
		debu.setBounds(100, 100, 700, 450);
		debu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		debu.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Debit Card number");
		lblNewLabel.setForeground(new Color(255, 245, 238));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBackground(new Color(47, 79, 79));
		lblNewLabel.setBounds(48, 41, 260, 30);
		debu.getContentPane().add(lblNewLabel);
		
		JTextField no = new javax.swing.JTextField();
		no.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		no.setBounds(379, 45, 177, 28);
		debu.getContentPane().add(no);
		no.setColumns(10);
		no.getText();
		
		JLabel lblNewLabel_1 = new JLabel("Enter your pin");
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBackground(new Color(47, 79, 79));
		lblNewLabel_1.setBounds(48, 134, 210, 30);
		debu.getContentPane().add(lblNewLabel_1);
		
		 JTextField pin = new javax.swing.JPasswordField();
		 pin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pin.setBounds(379, 134, 177, 30);
		debu.getContentPane().add(pin);
		pin.setColumns(10);
		pin.getText();
	
		JButton btnNewButton = new JButton("Click To Finish");
           btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p=pin.getText();
				String n=no.getText();
				if(p.matches("[0-9]+")&&n.matches("[0-9]+")) {
					
				JOptionPane.showMessageDialog(null, "The amount has been deducted from your account!");
						JOptionPane.showMessageDialog(null, "THANKS FOR SHOPPING!");
				System.exit(0);
				}
				else {
				JOptionPane.showMessageDialog(null, "Numbers must be entered", "Error", JOptionPane.ERROR_MESSAGE);
              		
				}
				
			}
			
			
});
			
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setForeground(new Color(255, 250, 240));
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setBounds(163, 247, 289, 54);
		debu.getContentPane().add(btnNewButton);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
