import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	BasicCalculator calculator = new BasicCalculator();
	//AdvanceCalculator advance = new AdvanceCalculator();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
	Random random = new Random();

	@Test
	public void testAdd() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*100;
			secondNumber = random.nextDouble()*100;
			result = firstNumber + secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calculator.add(firstNumber, secondNumber), result, 0.111);
		}
	}

	
	@Test
	public void testAdd2() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*1000;
			secondNumber = random.nextDouble()*1000;
			result = firstNumber + secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calculator.add(firstNumber, secondNumber), result, 0.111);
		}
	}
	
	@Test
	public void testAdd3() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*10000;
			secondNumber = random.nextDouble()*10000;
			result = firstNumber + secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calculator.add(firstNumber, secondNumber), result, 0.111);
		}
	}
	
	@Test
	public void testAdd4() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*10000 *(-1);
			secondNumber = random.nextDouble()*10000*(-1);
			result = firstNumber + secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calculator.add(firstNumber, secondNumber), result, 0.111);
		}
	}

	@Test
	public void testSubtract() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*100;
			secondNumber = random.nextDouble()*100;
			result = firstNumber -secondNumber;
			LOG.info("Testing the subtract method with the values" + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calculator.subtract(firstNumber, secondNumber),result,0.1111);
		}
		
	}

	@Test
	public void testMultiply() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*100;
			secondNumber = random.nextDouble()*100;
			result = firstNumber * secondNumber;
			LOG.info("Testing the multiply method with the values" + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calculator.multiply(firstNumber, secondNumber),result,0.111);
		}
	}

	@Test
	public void testDivide() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*100;
			secondNumber = random.nextDouble()*100;
			result = firstNumber / secondNumber;
			LOG.info("Testing the divide method with the values" + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calculator.divide(firstNumber, secondNumber),result,0.111);
		}
	}


}
