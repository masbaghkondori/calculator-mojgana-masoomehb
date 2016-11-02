import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.lang.Math.*;

public class CalculatorGUI implements ActionListener {
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
	private final JButton btnLog = new JButton("log");
	private final JButton btnRnd = new JButton("RND");
	private final JButton btn0 = new JButton("0");
	private final JButton btn1 = new JButton("1");
	private final JButton btn2 = new JButton("2");
	private final JButton btn3 = new JButton("3");
	private final JButton btn4 = new JButton("4");
	private final JButton btn5 = new JButton("5");
	private final JButton btn6 = new JButton("6");
	private final JButton btn7 = new JButton("7");
	private final JButton btn8 = new JButton("8");
	private final JButton btn9 = new JButton("9");
	private final JButton btnEqual = new JButton("=");
	private final JButton btnCos = new JButton("Cos");
	private final JButton btnSin = new JButton("Sin");

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
		frmCalculator.setBounds(100, 100, 355, 456);
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

		btnSqr.setBounds(262, 182, 40, 25);
		btnPow.setBounds(99, 145, 40, 25);
		btnLog.setBounds(151, 145, 40, 25);
		btnSin.setBounds(262, 146, 40, 25);
		btnCos.setBounds(203, 145, 40, 25);
		btnRnd.setBounds(40, 145, 40, 25);
		btnEqual.setBounds(262, 221, 40, 143);

		btn0.setBounds(40, 339, 40, 25);
		btn1.setBounds(40, 301, 40, 25);
		btn2.setBounds(120, 301, 40, 25);
		btn3.setBounds(203, 301, 40, 25);
		btn4.setBounds(40, 263, 40, 25);
		btn5.setBounds(120, 263, 40, 25);
		btn6.setBounds(203, 263, 40, 25);
		btn7.setBounds(40, 223, 40, 25);
		btn8.setBounds(120, 223, 40, 25);
		btn9.setBounds(203, 223, 40, 25);

		btnSqr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnRnd.setFont(new Font("Tahoma", Font.PLAIN, 14));

		frmCalculator.setVisible(true);
	}

	/**
	 * Addind components to frame.
	 * 
	 * @param none
	 * @return none
	 */
	public void addComponentsToFrame() {
		frmCalculator.getContentPane().add(lblFirstNumber);
		frmCalculator.getContentPane().add(lblSecondNumber);
		frmCalculator.getContentPane().add(lblResult);
		frmCalculator.getContentPane().add(btnAdd);
		frmCalculator.getContentPane().add(btnSubtract);
		frmCalculator.getContentPane().add(btnMultiply);
		frmCalculator.getContentPane().add(btnDivide);
		frmCalculator.getContentPane().add(btnSqr);
		frmCalculator.getContentPane().add(btnPow);
		frmCalculator.getContentPane().add(btnRnd);
		frmCalculator.getContentPane().add(btnLog);
		frmCalculator.getContentPane().add(btnSin);
		frmCalculator.getContentPane().add(btnCos);

		frmCalculator.getContentPane().add(btn0);
		frmCalculator.getContentPane().add(btn1);
		frmCalculator.getContentPane().add(btn2);
		frmCalculator.getContentPane().add(btn3);
		frmCalculator.getContentPane().add(btn4);
		frmCalculator.getContentPane().add(btn5);
		frmCalculator.getContentPane().add(btn6);
		frmCalculator.getContentPane().add(btn7);
		frmCalculator.getContentPane().add(btn8);
		frmCalculator.getContentPane().add(btn9);
		frmCalculator.getContentPane().add(btnEqual);

		btnPow.setMargin(new Insets(0, 0, 0, 0));
		btnLog.setMargin(new Insets(0, 0, 0, 0));
		btnRnd.setMargin(new Insets(0, 0, 0, 0));
		btnSqr.setMargin(new Insets(0, 0, 0, 0));
		btnCos.setMargin(new Insets(0, 0, 0, 0));
		btnSin.setMargin(new Insets(0, 0, 0, 0));

	}

	public void addActionListeners() {
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnDivide.addActionListener(this);
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnPow.addActionListener(this);
		btnLog.addActionListener(this);
		btnRnd.addActionListener(this);
		btnSqr.addActionListener(this);

	}

	/**
	 *
	 * get value from text field
	 * 
	 * @return firstNUmber - Number that is written in the textfield
	 **/
	public double getValueFromTextField1() {
		double firstNumber = 0.0;
		firstNumber = Double.valueOf(txfFirstNumber.getText());
		return firstNumber;
	}

	public double getValueFromTextField2() {
		double secondNumber = 0.0;
		secondNumber = Double.valueOf(txfSecondNumber.getText());
		return secondNumber;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == getValueFromTextField1()||) {
			double result = calculator.add(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}
		
		if (e.getSource() == btnAdd) {
			double result = calculator.add(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}
		
		if (e.getSource() == btnAdd) {
			double result = calculator.add(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnSubtract) {
			double result = calculator.subtract(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnMultiply) {
			double result = calculator.multiply(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}

		if (e.getSource() == btnPow) {
			double result = calculator.pow(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnSin) {
			double result = calculator.sin(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnCos) {
			double result = calculator.cos(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnSqr) {
			double result = calculator.sqr(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnLog) {
			double result = calculator.log(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}
		if (e.getSource() == btnRnd) {
			double result = calculator.rnd(getValueFromTextField1());
			lblResult.setText("Result: " + result);
		}

	}

}
