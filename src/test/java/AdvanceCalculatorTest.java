

import static org.junit.Assert.assertEquals;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdvanceCalculatorTest {
	
	AdvanceCalculator ad = new AdvanceCalculator();
	public static final Logger LOG = Logger.getLogger(AdvanceCalculator.class.getName());
	Random random = new Random();


	

	@Test
	public void testSqrt() {
		double firstNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextDouble()*100;
			result = ad.calculatesquart(firstNumber);
			LOG.info("Testing Sqrt method with the value:" + firstNumber);
			System.out.println("result : "+result);
			assertEquals("The result should be: "+ result, ad.calculatesquart(firstNumber),result,0.111);
		
		}
	}
	
	
	
	@Test
	public void testPow() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*100;
			secondNumber= random.nextDouble()*100;
			result = ad.calculatepower(firstNumber, secondNumber);
			LOG.info("Testing the power method with the values:" + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, ad.calculatepower(firstNumber, secondNumber),result,0.111);
		}
		
	}
	@Test
	public void testPowNegative() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*-100;
			secondNumber= random.nextDouble()*-100;
			result = ad.calculatepower(firstNumber, secondNumber);
			LOG.info("Testing the power method with the negative values:" + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be:"+ result, ad.calculatepower(firstNumber, secondNumber),result,0.111);
		}
		
	}
	
	
	@Test
	public void testRoud() {
		double firstNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*100;
			result = ad.CalculateRound(firstNumber);
			LOG.info("Testing the Roud method with the value:" + firstNumber);
			assertEquals("The result should be: "+ result, ad.CalculateRound(firstNumber),result,0.111);
		}
	}
	
	@Test
	public void testRoudNegative() {
		double firstNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*-100;
			result = ad.CalculateRound(firstNumber);
			LOG.info("Testing the Roud method with the negative value:" + firstNumber);
			assertEquals("The result should be: "+ result, ad.CalculateRound(firstNumber),result,0.111);
		}
	}
	
	
	
	@Test
	public void testSin() {
		double firstNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*100;
			result = ad.CalculateSinus(firstNumber);
			LOG.info("Testing the Sinus method with the value:" + firstNumber);
			assertEquals("The result should be: "+ result, ad.CalculateSinus(firstNumber),result,0.111);
		}
	}

	@Test
	public void testSinNegative() {
		double firstNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*-100;
			result = ad.CalculateSinus(firstNumber);
			LOG.info("Testing the Sinus method with the negative value:" + firstNumber);
			assertEquals("The result should be: "+ result, ad.CalculateSinus(firstNumber),result,0.111);
		}
	}

	

	
	
	@Test
	public void testLog() {
		double firstNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*100;
			result = ad.CalculateLog(firstNumber);
			LOG.info("Testing the log method with the value:" + firstNumber);
			assertEquals("The result should be: "+ result, ad.CalculateLog(firstNumber),result,0.111);
		}		
	}
	
	@Test
	public void testLogNegative() {
		double firstNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*-100;
			result = ad.CalculateLog(firstNumber);
			LOG.info("Testing the log method with negative value:" + firstNumber);
			assertEquals("The result should be: "+ result, ad.CalculateLog(firstNumber),result,0.111);
		}		
	}

	@Test
	public void testCos() {
		double firstNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*100;
			result = ad.calculateCos(firstNumber);
			LOG.info("Testing the Cosinus method with the value:" + firstNumber);
			assertEquals("The result should be: "+ result, ad.calculateCos(firstNumber),result,0.111);
		}
	}
	
	
	@Test
	public void testCosNegativ() {
		double firstNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*-100;
			result = ad.calculateCos(firstNumber);
			LOG.info("Testing the Cosinus method with Negative value:" + firstNumber);
			assertEquals("The result should be: "+ result, ad.calculateCos(firstNumber),result,0.111);
		}
	}
	
}
