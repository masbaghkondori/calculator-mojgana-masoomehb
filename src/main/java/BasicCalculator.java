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
			
				result = firstNumber / secondNUmber;
			
			
			
			if (Double.isInfinite(result)){
				return -1111.1111;
			}		
			
			
			return result;
		}

		
}
