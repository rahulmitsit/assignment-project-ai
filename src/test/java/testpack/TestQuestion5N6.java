package testpack;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import mypack.Question5N6;

public class TestQuestion5N6 {

	@Test
	public void testNumberSquare() {
//		Question5N6 q56=new Question5N6();
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(2);
		numList.add(55);
		numList.add(5);
		String output="4,3025,25";
		assertEquals(output, new Question5N6().findNumSquare(numList));
	}

	@Test
	public void testEvenNumberSquare() {
//		Question5N6 q56=new Question5N6();
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(2);
		numList.add(55);
		numList.add(3);
		numList.add(6);
		numList.add(8);
		String output="4,36,64";
		assertEquals(output, new Question5N6().findEvenNumSquare(numList));
	}
}
