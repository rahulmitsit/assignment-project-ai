package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question5N6 {

	public static void main(String[] args) {
		Question5N6 findSquare=new Question5N6();
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(2);
		numList.add(55);
		numList.add(5);
		String output=findSquare.findNumSquare(numList);
		System.out.println(output);
		
		numList=new ArrayList<Integer>();
		numList.add(2);
		numList.add(55);
		numList.add(3);
		numList.add(6);
		numList.add(8);
		output=findSquare.findEvenNumSquare(numList);
		System.out.println(output);
	}
	public void test() {
		
	}

	public String findNumSquare(List<Integer> numList) {
		String output="";
		List<Integer> squareList=numList.stream().map(num->(num*num)).distinct().collect(Collectors.toList());
		System.out.println("\n----------------Square Of All Numbers----------------");
		
		squareList.forEach(System.out::println);
		
		return squareList.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", output);
	}
	
	public String findEvenNumSquare(List<Integer> numList) {
		String output="";
//		List<Integer> numList=new ArrayList<Integer>();
		numList.add(2);
		numList.add(55);
		numList.add(3);
		numList.add(6);
		numList.add(8);
		List<Integer> squareList=numList.stream().filter(num->num%2==0).map(num->(num*num)).distinct().collect(Collectors.toList());
		System.out.println("\n----------------Square Of Even Numbers----------------");
		squareList.forEach(System.out::println);
		output=squareList.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", output);
		return output;
	}

}
