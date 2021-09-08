/**
 * algorithms for finding factorial, fibonacci number, and checking prime number
 * 
 * modified     20210822
 * date         20210822
 * @filename    Conversion.java
 * @author      Raghav Vasudeva
 * @version     1.0
 * @see         unit 3.3 content
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversion {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversion window = new Conversion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number Systems");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(189, 10, 196, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter a decimal number.");
		lblNewLabel_1.setBounds(10, 77, 157, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter a binary number.");
		lblNewLabel_1_1.setBounds(10, 117, 157, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter a decimal number.");
		lblNewLabel_1_2.setBounds(10, 197, 157, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter a hexadecimal number.");
		lblNewLabel_1_3.setBounds(10, 240, 168, 13);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("Decimal and Binary");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(131, 52, 161, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Decimal and Hexadecimal");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(121, 162, 161, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(177, 74, 57, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(177, 114, 57, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(177, 194, 57, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(177, 237, 57, 19);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("...");
		lblNewLabel_3.setBounds(371, 77, 73, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("...");
		lblNewLabel_3_1.setBounds(371, 117, 73, 13);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("...");
		lblNewLabel_3_2.setBounds(371, 197, 73, 13);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("...");
		lblNewLabel_3_3.setBounds(371, 240, 73, 13);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JButton btnNewButton = new JButton("Dec. to Bin.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int decBin = Integer.parseInt(textField.getText());
				lblNewLabel_3.setText(decbin(decBin));
			}
		});
		btnNewButton.setBounds(251, 73, 110, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBinToDec = new JButton("Bin. to Dec.");
		btnBinToDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String binDec = textField_1.getText();
				lblNewLabel_3_1.setText(String.valueOf(bindec(binDec)));
			}
		});
		btnBinToDec.setBounds(251, 113, 110, 21);
		frame.getContentPane().add(btnBinToDec);
		
		JButton btnDecToHex = new JButton("Dec. to Hex.");
		btnDecToHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int decHex = Integer.parseInt(textField_2.getText());
				lblNewLabel_3_2.setText(dechex(decHex));
			}
		});
		btnDecToHex.setBounds(244, 193, 110, 21);
		frame.getContentPane().add(btnDecToHex);
		
		JButton btnNewButton_1_1 = new JButton("Hex. to Dec.");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hexDec = textField_3.getText();
				lblNewLabel_3_3.setText(String.valueOf(hexDec));
			}
		});
		btnNewButton_1_1.setBounds(244, 236, 110, 21);
		frame.getContentPane().add(btnNewButton_1_1);
	}
	
	public static String decbin(int x) {
		return Integer.toBinaryString(x); // https://www.javatpoint.com/java-decimal-to-binary
	}
	
	public static int bindec(String x) {
		return Integer.parseInt(x, 2); // https://www.javatpoint.com/java-binary-to-decimal
	}
	
	public static String dechex(int x) {
		return Integer.toHexString(x); // https://www.javatpoint.com/java-decimal-to-hex
	}
	
	public static int hexdec(String x) {
		return Integer.parseInt(x, 16); // https://www.javatpoint.com/java-hex-to-decimal
	}
}
