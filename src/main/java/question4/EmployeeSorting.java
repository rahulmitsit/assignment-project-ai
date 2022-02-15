package question4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import question3.Employee;


public class EmployeeSorting {

	public static void main(String[] args) {
		EmployeeSorting employeeSorting=new EmployeeSorting();
		System.out.println("--------------custom sorting impl------------");
		employeeSorting.customPojoSort();
		System.out.println("--------------default sorting impl------------");
		employeeSorting.defaultSortPojo();
		
		
		
	}

	public void defaultSortPojo() {
		Set<EmployeeDefaultSorting> empTreeset=new TreeSet<EmployeeDefaultSorting>();
		EmployeeDefaultSorting emp=new EmployeeDefaultSorting(1,"vijay","vishwakarma");
		empTreeset.add(emp);
		EmployeeDefaultSorting emp1=new EmployeeDefaultSorting(2,"manish","prajapati");
		empTreeset.add(emp1);
		
		EmployeeDefaultSorting emp2=new EmployeeDefaultSorting(3,"ajay","yadav");
		empTreeset.add(emp2);
		
		EmployeeDefaultSorting emp3=new EmployeeDefaultSorting(4,"rahul","yadav");
		empTreeset.add(emp3);
		
		
		System.out.println(empTreeset.toString());
	}
	public void customPojoSort() {
		Set<Employee> empTreeset2=new TreeSet<Employee>(new firstNameComparator());
		Employee emp=new Employee(1,"abc","shah");
		empTreeset2.add(emp);
		Employee emp1=new Employee(2,"xyz","sharma");
		empTreeset2.add(emp1);
		Employee emp2=new Employee(44,"pooja","singh");
		empTreeset2.add(emp2);
		Employee emp3=new Employee(3,"danish","khan");
		empTreeset2.add(emp3);
		
		System.out.println(empTreeset2.toString());
	}
	
	
}

class firstNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}
