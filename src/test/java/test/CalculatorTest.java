package test;

import static org.junit.Assert.*;

import org.junit.Test;

import mypack.Calculator;

public class CalculatorTest {

	@Test
	public void test() {
	
		Calculator calculator=new Calculator();
		assertEquals(6, calculator.addition("1+2+3"));
	}

}
