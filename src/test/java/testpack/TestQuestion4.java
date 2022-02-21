package testpack;

import static org.junit.Assert.*;

import org.junit.Test;

import question4.EmployeeSorting;

public class TestQuestion4 {

	@Test
	public void testDefaultSorting() {
		String output="[[id=3,firstName=ajay,lastname=yadav], [id=2,firstName=manish,lastname=prajapati], [id=4,firstName=rahul,lastname=yadav], [id=1,firstName=vijay,lastname=vishwakarma]]";
		
		assertEquals(output, new EmployeeSorting().defaultSortPojo());
	}
	
	@Test
	public void testCustomSorting() {
		String output="[[id=1, firstName=abc, lastname=shah], [id=3, firstName=danish, lastname=khan], [id=44, firstName=pooja, lastname=singh], [id=2, firstName=xyz, lastname=sharma]]";
		
		assertEquals(output, new EmployeeSorting().customPojoSort());
	}

}
