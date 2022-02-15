package testpack;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import mypack.Calculator;
import question3.Employee;

public class Question1 {

	@Test
	public void test() {
		Calculator calculator=new Calculator();
		assertEquals(6, calculator.addition("1+2+3"));
	}

}
