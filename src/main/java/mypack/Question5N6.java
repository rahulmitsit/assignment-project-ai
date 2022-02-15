package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question5N6 {

	public static void main(String[] args) {
		Question5N6 findSquare=new Question5N6();
		findSquare.findNumSquare();
		findSquare.findEvenNumSquare();
	}
	public void test() {
		
	}
public void test(int a) {
		
	}
	public void findNumSquare() {
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(2);
		numList.add(55);
		numList.add(5);
		List<String> squareList=numList.stream().map(num->("Square of "+num+" is : "+num*num)).distinct().collect(Collectors.toList());
		System.out.println("\n----------------Square Of All Numbers----------------");
		squareList.forEach(System.out::println);
	}
	
	public void findEvenNumSquare() {
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(2);
		numList.add(55);
		numList.add(3);
		numList.add(6);
		numList.add(8);
		List<String> squareList=numList.stream().filter(num->num%2==0).map(num->("Square of "+num+" is : "+num*num)).distinct().collect(Collectors.toList());
		System.out.println("\n----------------Square Of Even Numbers----------------");
		squareList.forEach(System.out::println);
	}

}
