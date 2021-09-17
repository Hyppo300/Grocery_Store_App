package shopping;

import java.awt.EventQueue;
import shopping.Bill;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import java.awt.SystemColor;
import javax.swing.SpinnerNumberModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DropMode;

public class Cart  {
  
	 JFrame Cart;
	String jsubtotal;
    String by;
    double[] itemcost=new double[20];
	String[] h= {"1.Cucumber= $2 per lbs","2.Capsicum= $1.8 per lbs","3.Mushrooms=$3.8 lbs per lbs","4.Chocolate= $0.7 per bar","5.Banana= $1.1 per dozen","6.Blueberry=$1.2 per lbs","7.Cheese=$3.4 per package","8.Strawberry= $1.4 per lbs","9.Apple= $1.94 per lbs","10.Pasta= $4.1 per lbs"};
    double Cucumber=2;
   double Capsicum=1.8;
   double Mushrooms=3.8;
   double Chocolate=0.7;
 double Banana=1.1;
 double Blueberry=1.2;
    double Cheese=3.4;
    double Strawberry=1.4;
    double Apple=1.94;
    double Pasta=4.1;
   String jtotal;
   String jtax;
   double subtotal1;
   private JButton check;
  private JTextField txtcuc;
  private JTextField txtcap;
  private JTextField txtmush;
  private JTextField txtchoc;
  private JTextField txtban;
  private JTextField txtblue;
  private JTextField txtches;
  private JTextField txtstraw;
  private JTextField txtapp;
  private JTextField txtpas;
  private JTextField tot;
  private JTextField sub;
  private JTextField taxs;
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart window = new Cart();
					window.Cart.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cart() {
		initialize();
	}
	/**
	 * 
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		Cart = new JFrame();
		Cart.setBounds(100, 100, 831, 488);
		Cart.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
	
		JPanel panel = new JPanel();
		panel.setLayout(null);
		Cart.getContentPane().add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("Enter quantity of slected item");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(0, 4, 270, 40);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_13 = new JLabel("Cucumber");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_13.setBounds(10, 44, 181, 40);
		panel.add(lblNewLabel_13);
		
		txtcuc = new JTextField();
		txtcuc.setText("00");
		txtcuc.setHorizontalAlignment(SwingConstants.CENTER);
		txtcuc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtcuc.setColumns(10);
		txtcuc.setBounds(191, 44, 193, 40);
		panel.add(txtcuc);
		
		JLabel lblcap = new JLabel("Capsicum");
		lblcap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblcap.setBounds(0, 84, 135, 40);
		panel.add(lblcap);
		
		txtcap = new JTextField();
		txtcap.setText("00");
		txtcap.setHorizontalAlignment(SwingConstants.CENTER);
		txtcap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtcap.setColumns(10);
		txtcap.setBounds(191, 84, 193, 40);
		panel.add(txtcap);
		
		JLabel lblNewLabel_5 = new JLabel("Mushrooms");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(0, 124, 135, 40);
		panel.add(lblNewLabel_5);
		
		txtmush = new JTextField();
		txtmush.setText("00");
		txtmush.setHorizontalAlignment(SwingConstants.CENTER);
		txtmush.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtmush.setColumns(10);
		txtmush.setBounds(191, 124, 193, 40);
		panel.add(txtmush);
		
		JLabel btnb = new JLabel("Banana");
		btnb.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnb.setBounds(0, 204, 135, 40);
		panel.add(btnb);
		
		txtchoc = new JTextField();
		txtchoc.setText("00");
		txtchoc.setHorizontalAlignment(SwingConstants.CENTER);
		txtchoc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtchoc.setColumns(10);
		txtchoc.setBounds(191, 164, 193, 40);
		panel.add(txtchoc);
		
		JLabel btnbl = new JLabel("Blue beryy");
		btnbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnbl.setBounds(0, 244, 135, 40);
		panel.add(btnbl);
		
		txtban = new JTextField();
		txtban.setText("00");
		txtban.setHorizontalAlignment(SwingConstants.CENTER);
		txtban.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtban.setColumns(10);
		txtban.setBounds(191, 204, 193, 40);
		panel.add(txtban);
		
		JLabel btnc = new JLabel("Cheese");
		btnc.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnc.setBounds(0, 284, 125, 40);
		panel.add(btnc);
		
		txtblue = new JTextField();
		txtblue.setText("00");
		txtblue.setHorizontalAlignment(SwingConstants.CENTER);
		txtblue.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtblue.setColumns(10);
		txtblue.setBounds(191, 244, 193, 40);
		panel.add(txtblue);
		
		JLabel btnz = new JLabel("Chocolate");
		btnz.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnz.setBounds(0, 164, 135, 40);
		panel.add(btnz);
		
		txtches = new JTextField();
		txtches.setText("00");
		txtches.setHorizontalAlignment(SwingConstants.CENTER);
		txtches.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtches.setColumns(10);
		txtches.setBounds(191, 284, 193, 40);
		panel.add(txtches);
		
		JLabel btns = new JLabel("Strawberry");
		btns.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btns.setBounds(0, 324, 135, 40);
		panel.add(btns);
		
		txtstraw = new JTextField();
		txtstraw.setText("00");
		txtstraw.setHorizontalAlignment(SwingConstants.CENTER);
		txtstraw.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtstraw.setColumns(10);
		txtstraw.setBounds(191, 324, 193, 40);
		panel.add(txtstraw);
		
		JLabel btna = new JLabel("Apple");
		btna.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btna.setBounds(0, 364, 135, 40);
		panel.add(btna);
		
		txtapp = new JTextField();
		txtapp.setText("00");
		txtapp.setHorizontalAlignment(SwingConstants.CENTER);
		txtapp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtapp.setColumns(10);
		txtapp.setBounds(191, 364, 193, 40);
		panel.add(txtapp);
		
		JLabel lblp = new JLabel("Pasta");
		lblp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblp.setBounds(0, 404, 135, 40);
		panel.add(lblp);
		
		txtpas = new JTextField();
		txtpas.setText("00");
		txtpas.setHorizontalAlignment(SwingConstants.CENTER);
		txtpas.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpas.setColumns(10);
		txtpas.setBounds(191, 404, 193, 40);
		panel.add(txtpas);
		
		JPanel counter = new JPanel();
		counter.setLayout(null);
		counter.setBorder(new LineBorder(new Color(0, 0, 0)));
		Cart.getContentPane().add(counter);
		
		tot = new JTextField();
		tot.setText("00");
		tot.setHorizontalAlignment(SwingConstants.CENTER);
		tot.setFont(new Font("Times New Roman", Font.BOLD, 20));
		tot.setEditable(false);
		tot.setColumns(10);
		tot.setBackground(Color.WHITE);
		tot.setBounds(70, 256, 195, 43);
		counter.add(tot);
		
		JButton check_1 = new JButton("Complete checkout");
		check_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
          
				
				if(tot.getText().equals("00")) {
					check_1.setEnabled(true);
				
					JOptionPane.showMessageDialog(Cart, "You have bought nothing!","OOPS!",JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Please click Total.");
					Cart.setVisible(true);
				}
				else if(tot.getText().equals("$0.00")) {
					JOptionPane.showMessageDialog(Cart, "You have bought nothing!","OOPS!",JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Please enter quantity for items you want and then click Total.");
					Cart.setVisible(true);
				}
				else {
					
				
				Bill b =new Bill();
				b.NewScreen();
				Cart.dispose();
				}
			}
		});
		check_1.setVerticalAlignment(SwingConstants.TOP);
		check_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		check_1.setBounds(10, 385, 223, 49);
		counter.add(check_1);
		
		sub = new JTextField();
		sub.setText("00");
		sub.setHorizontalAlignment(SwingConstants.CENTER);
		sub.setFont(new Font("Times New Roman", Font.BOLD, 20));
		sub.setEditable(false);
		sub.setColumns(10);
		sub.setBackground(Color.WHITE);
		sub.setBounds(70, 164, 195, 43);
		counter.add(sub);
		
		JLabel lblNewLabel_1 = new JLabel("Subtotal");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 115, 128, 38);
		counter.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 207, 128, 38);
		counter.add(lblNewLabel_2);
		
		JButton btntotal = new JButton("Total");
		btntotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			itemcost[0]=Double.parseDouble(txtcuc.getText())*Cucumber;
			itemcost[1]=Double.parseDouble(txtcap.getText())*Capsicum;
			itemcost[2]=Double.parseDouble(txtmush.getText())*Mushrooms;
			itemcost[3]=Double.parseDouble(txtchoc.getText())*Chocolate;
			itemcost[4]=Double.parseDouble(txtban.getText())*Banana;
			itemcost[5]=Double.parseDouble(txtblue.getText())*Blueberry;
			itemcost[6]=Double.parseDouble(txtches.getText())*Cheese;
			itemcost[7]=Double.parseDouble(txtstraw.getText())*Strawberry;
			itemcost[8]=Double.parseDouble(txtapp.getText())*Apple;
			
			itemcost[9]=Double.parseDouble(txtpas.getText())*Pasta;
			
			itemcost[10]=itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3]+itemcost[4];
			itemcost[11]=itemcost[5]+itemcost[6]+itemcost[7]+itemcost[8]+itemcost[9];
			itemcost[12]=itemcost[10]+itemcost[11];
			jtax=String.format("$%.2f", itemcost[12]/100);
			jsubtotal=String.format("$%.2f", itemcost[12]);
			jtotal=String.format("$%.2f", itemcost[12]+itemcost[12]/100);
		    sub.setText(jsubtotal);
		    taxs.setText(jtax);
		    tot.setText(jtotal);
			
			}
			
		});
		btntotal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btntotal.setBounds(10, 325, 89, 49);
		counter.add(btntotal);
		
		JLabel lblNewLabel_3 = new JLabel("Tax");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 24, 73, 31);
		counter.add(lblNewLabel_3);
		
		taxs = new JTextField();
		taxs.setBackground(Color.WHITE);
		taxs.setFont(new Font("Times New Roman", Font.BOLD, 20));
		taxs.setHorizontalAlignment(SwingConstants.CENTER);
		taxs.setText("00");
		taxs.setEditable(false);
		taxs.setColumns(10);
		taxs.setBounds(70, 66, 191, 39);
		counter.add(taxs);
	
}
}
