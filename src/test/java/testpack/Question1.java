package testpack;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mypack.Calculator;

public class Question1 {

	@Test
	public void test() {
		Calculator calculator=new Calculator();
		assertEquals(6, calculator.addition("1+2+3"));
	}

}
