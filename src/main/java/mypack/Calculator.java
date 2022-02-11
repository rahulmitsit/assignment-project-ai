package mypack;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator().addition("1+2+3");
		//eclipse
	}

	public int addition(String numbersStr) {

		int sum = 0;
		String[] numArray = numbersStr.split("\\+");
		for (String string : numArray) {
			sum = sum + Integer.parseInt(string);
		}

		System.out.println(sum);
		return sum;
	}

}
