import javax.swing.JOptionPane;

import CalculatorInterface.CalculatorBasicOperationsInterface;

public class BasicCalculator implements CalculatorBasicOperationsInterface  {
		
		public double add(double firstNumber, double secondNUmber){
			return  firstNumber + secondNUmber;
		}

		public double subtract(double firstNumber, double secondNUmber){
			return  firstNumber - secondNUmber;
		}
		
		public double multiply(double firstNumber, double secondNUmber){
			return  firstNumber * secondNUmber;
		}
		
		public double divide(double firstNumber, double secondNUmber){
			double result=0.0;
			//try{
				
				result = firstNumber / secondNUmber;
			
			/*} catch (ArithmeticException e) { // 
				  System.out.println("Division by zero." +e);
				  return -1111.1111;
				}*/
			
			if (Double.isInfinite(result)){
			//JOptionPane.showMessageDialog(null, "division by zero!", "Error message", JOptionPane.ERROR_MESSAGE);			
				return -1111.1111;
			}		
			
			
			return result;
		}

		
}
