/**
 * 
 * 
 * 
 * 
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class CalculatorGUI implements ActionListener{
	private JFrame frmCalculator;
	private JTextField txfFirstNumber;
	private JTextField txfSecondNumber;
	private BasicCalculator calculator = new BasicCalculator();
	private JLabel lblResult = new JLabel("Result:");
	
	private JLabel lblFirstNumber = new JLabel("first number");
	private JLabel lblSecondNumber = new JLabel("second number:");
	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("/");
	private final JButton btnPow = new JButton("POW");
	private final JButton btnSqr = new JButton("SQR");
	private final JButton btnMod = new JButton("MOD");
	private final JButton btnLog = new JButton("log");
	private final JButton button_0 = new JButton("0");
	private final JButton button_1 = new JButton("1");
	private final JButton button = new JButton("2");
	private final JButton button_2 = new JButton("3");
	private final JButton button_3 = new JButton("4");
	private final JButton button_4 = new JButton("5");
	private final JButton button_5 = new JButton("6");
	private final JButton button_6 = new JButton("7");
	private final JButton button_7 = new JButton("8");
	private final JButton button_8 = new JButton("9");
	private final JButton btnEqual = new JButton("=");
	private final JButton btnSin = new JButton("Sin");
	private final JButton btnRnd = new JButton("rnd");

	
	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		createAndShowGUI();
		addComponentsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void createAndShowGUI() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(Color.CYAN);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 704, 422);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txfFirstNumber = new JTextField();
		txfFirstNumber.setBounds(116, 27, 108, 20);
		frmCalculator.getContentPane().add(txfFirstNumber);
		txfFirstNumber.setColumns(10);
		
		txfSecondNumber = new JTextField();
		txfSecondNumber.setBounds(116, 58, 108, 20);
		frmCalculator.getContentPane().add(txfSecondNumber);
		txfSecondNumber.setColumns(10);	
		
		lblFirstNumber.setBounds(10, 30, 96, 14);
		lblSecondNumber.setBounds(10, 61, 96, 14);
		lblResult.setBounds(20, 96, 223, 14);

		btnAdd.setBounds(40, 183, 40, 25);
		btnSubtract.setBounds(99, 183, 40, 25);	
		btnMultiply.setBounds(151, 183, 40, 25);	
		btnDivide.setBounds(203, 183, 40, 25);	
		
		frmCalculator.setVisible(true);
	}
	
	/**
	 * Addind components to frame.
	 * @param none
	 * @return none
	 */
	public void addComponentsToFrame(){
		frmCalculator.getContentPane().add(lblFirstNumber);
		frmCalculator.getContentPane().add(lblSecondNumber);
		frmCalculator.getContentPane().add(lblResult);
		frmCalculator.getContentPane().add(btnAdd);
		frmCalculator.getContentPane().add(btnSubtract);
		frmCalculator.getContentPane().add(btnMultiply);
		frmCalculator.getContentPane().add(btnDivide);
		btnPow.setFont(new Font("Symbol MT", Font.PLAIN, 8));
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSqr.setBounds(40, 145, 40, 25);
		frmCalculator.getContentPane().add(btnSqr);
		
		btnPow.setBounds(90, 145, 40, 25);
		frmCalculator.getContentPane().add(btnPow);
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	
		
		btnMod.setBounds(140, 145, 40, 25);		
		frmCalculator.getContentPane().add(btnMod);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnLog.setBounds(262, 145, 40, 25);
		frmCalculator.getContentPane().add(btnLog);
		
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_0.setBounds(40, 339, 40, 25);
		
		frmCalculator.getContentPane().add(button_0);
		button_1.setBounds(40, 301,40, 25);
		
		frmCalculator.getContentPane().add(button_1);
		button.setBounds(120, 301, 40, 25);
		
		frmCalculator.getContentPane().add(button);
		button_2.setBounds(203, 301, 40, 25);
		
		frmCalculator.getContentPane().add(button_2);
		button_3.setBounds(40, 263, 40, 25);
		
		frmCalculator.getContentPane().add(button_3);
		button_4.setBounds(120, 263, 40, 25);
		
		frmCalculator.getContentPane().add(button_4);
		button_5.setBounds(203, 263, 40, 25);
		
		frmCalculator.getContentPane().add(button_5);
		button_6.setBounds(40, 223, 40, 25);
		
		frmCalculator.getContentPane().add(button_6);
		button_7.setBounds(120, 223, 40, 25);
		
		frmCalculator.getContentPane().add(button_7);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setBounds(203, 223, 40, 25);
		
		frmCalculator.getContentPane().add(button_8);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnEqual.setBounds(262, 221, 40, 143);
		
		frmCalculator.getContentPane().add(btnEqual);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnSin.setBounds(262, 185, 40, 25);
		
		frmCalculator.getContentPane().add(btnSin);
		btnRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRnd.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnRnd.setBounds(203, 145, 40, 25);
		
		frmCalculator.getContentPane().add(btnRnd);
	}
		
	
	public void addActionListeners(){
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
	}

	
	/**
	 *
	 * get value from text field
	 * 
	 * @return firstNUmber - Number that is written in the textfield
	 **/
	public double getValueFromTextField1(){		
		double firstNumber = 0.0;						
		firstNumber = Double.valueOf(txfFirstNumber.getText());		
		return firstNumber;		
	}
	
	public double getValueFromTextField2(){		
		double secondNumber = 0.0;						
		secondNumber = Double.valueOf(txfSecondNumber.getText());		
		return secondNumber;		
	}	
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd){
			double result = calculator.add(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}		
		
		if (e.getSource() == btnSubtract){
			double result = calculator.subtract(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}
		
		if (e.getSource() == btnMultiply){
			double result = calculator.multiply(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}
		
		if (e.getSource() == btnDivide){
			double result = calculator.divide(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);		
		}		
		
	}	
	
}
