package sample.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditcardDisplayTest {

	@Test
	public void test() {
		// setup
		String ccNum = "1111222244445678";
		// execute
		String result = CreditcardDisplay.mask(ccNum);
		
		// assert
		String expected = "xxxxxxxxxxxx5678";
		assertEquals(expected, result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_nulls() {
		// setup
		String ccNum = null;
		
		// execute
		String result = CreditcardDisplay.mask(ccNum);
	}
	

}
