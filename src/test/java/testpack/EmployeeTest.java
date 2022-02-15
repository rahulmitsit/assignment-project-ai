package testpack;

import static org.junit.Assert.assertSame;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import question3.Employee;
import question3.EmployeeWithEqual;
import question3.EmployeeWithEqualHashcode;
import question3.EmployeeWithHashcode;

public class EmployeeTest {

	@Test
	public void testDuplicateRecords() {
		Set<Employee> empSet = new HashSet<>();

		Employee emp1 = new Employee(1, "rahul", "yadav");
		empSet.add(emp1);

		Employee emp2 = new Employee(2, "xyz", "pqr");
		empSet.add(emp2);

		Employee emp3 = new Employee(2, "xyz", "pqr");
		empSet.add(emp3);

		Employee emp4 = new Employee(4, "xyz", "pqr");
		empSet.add(emp4);

		Employee emp5 = new Employee(5, "saiyyad", "khan");
		empSet.add(emp5);
		int expectedSize = getUniqueListSize(empSet);
//		System.out.println(empSet);
		System.out.println("Original Size="+empSet.size());
		assertSame(expectedSize, empSet.size());
	}
	@Test
	public void testDuplicateRecords2() {
		Set<EmployeeWithEqual> empSet = new HashSet<>();

		EmployeeWithEqual emp1 = new EmployeeWithEqual(1, "rahul", "yadav");
		empSet.add(emp1);

		EmployeeWithEqual emp2 = new EmployeeWithEqual(2, "xyz", "pqr");
		empSet.add(emp2);

		EmployeeWithEqual emp3 = new EmployeeWithEqual(2, "xyz", "pqr");
		empSet.add(emp3);

		EmployeeWithEqual emp4 = new EmployeeWithEqual(4, "xyz", "pqr");
		empSet.add(emp4);

		EmployeeWithEqual emp5 = new EmployeeWithEqual(5, "saiyyad", "khan");
		empSet.add(emp5);
		int expectedSize = getUniqueListSize2(empSet);
//		System.out.println(empSet);
		System.out.println("Original Size="+empSet.size());
		assertSame(expectedSize, empSet.size());
	}
	@Test
	public void testDuplicateRecords3() {
		Set<EmployeeWithHashcode> empSet = new HashSet<>();

		EmployeeWithHashcode emp1 = new EmployeeWithHashcode(1, "rahul", "yadav");
		empSet.add(emp1);

		EmployeeWithHashcode emp2 = new EmployeeWithHashcode(2, "xyz", "pqr");
		empSet.add(emp2);

		EmployeeWithHashcode emp3 = new EmployeeWithHashcode(2, "xyz", "pqr");
		empSet.add(emp3);

		EmployeeWithHashcode emp4 = new EmployeeWithHashcode(4, "xyz", "pqr");
		empSet.add(emp4);

		EmployeeWithHashcode emp5 = new EmployeeWithHashcode(5, "saiyyad", "khan");
		empSet.add(emp5);
		int expectedSize = getUniqueListSize3(empSet);
//		System.out.println(empSet);
		System.out.println("Original Size="+empSet.size());
		assertSame(expectedSize, empSet.size());
	}
	@Test
	public void testDuplicateRecords4() {
		Set<EmployeeWithEqualHashcode> empSet = new HashSet<>();

		EmployeeWithEqualHashcode emp1 = new EmployeeWithEqualHashcode(1, "rahul", "yadav");
		empSet.add(emp1);

		EmployeeWithEqualHashcode emp2 = new EmployeeWithEqualHashcode(2, "xyz", "pqr");
		empSet.add(emp2);

		EmployeeWithEqualHashcode emp3 = new EmployeeWithEqualHashcode(2, "xyz", "pqr");
		empSet.add(emp3);

		EmployeeWithEqualHashcode emp4 = new EmployeeWithEqualHashcode(4, "Mno", "pqr");
		empSet.add(emp4);

		EmployeeWithEqualHashcode emp5 = new EmployeeWithEqualHashcode(5, "saiyyad", "khan");
		empSet.add(emp5);
		int expectedSize = getUniqueListSize4(empSet);
//		System.out.println(empSet);
		System.out.println("Original Size="+empSet.size());
		assertSame(expectedSize, empSet.size());
	}
	public int getUniqueListSize4(Set<EmployeeWithEqualHashcode> empSet) {
		System.out.println("--------------------------------------------");
		int count = 0;
		boolean dupFound = false;
		EmployeeWithEqualHashcode empTemp = null;
		Map<Integer, EmployeeWithEqualHashcode> map = new HashMap<>();
		for (EmployeeWithEqualHashcode emp : empSet) {
			if (!map.containsKey(emp.getId())) {

				for (Integer key : map.keySet()) {
					dupFound = false;
					empTemp = map.get(key);
					if (empTemp.getFirstName().equalsIgnoreCase(emp.getFirstName())
							&& empTemp.getLastname().equalsIgnoreCase(emp.getLastname())) {
						System.out.println("found same details :" + emp.getFirstName() + " " + emp.getLastname());
						dupFound = true;
					}
				}
				if (!dupFound) {
					map.put(emp.getId(), emp);
					count++;
				}

			} else {
				System.out.println("Data already exists for id:" + emp.getId());

			}

		}
		System.out.println("Total Unique Records are :" + count);
		return count;
	}
	public int getUniqueListSize3(Set<EmployeeWithHashcode> empSet) {
		System.out.println("--------------------------------------------");
		int count = 0;
		boolean dupFound = false;
		EmployeeWithHashcode empTemp = null;
		Map<Integer, EmployeeWithHashcode> map = new HashMap<>();
		for (EmployeeWithHashcode emp : empSet) {
			if (!map.containsKey(emp.getId())) {

				for (Integer key : map.keySet()) {
					dupFound = false;
					empTemp = map.get(key);
					if (empTemp.getFirstName().equalsIgnoreCase(emp.getFirstName())
							&& empTemp.getLastname().equalsIgnoreCase(emp.getLastname())) {
						System.out.println("found same details :" + emp.getFirstName() + " " + emp.getLastname());
						dupFound = true;
					}
				}
				if (!dupFound) {
					map.put(emp.getId(), emp);
					count++;
				}

			} else {
				System.out.println("Data already exists for id:" + emp.getId());

			}

		}
		System.out.println("Total Unique Records are :" + count);
		return count;
	}
	
	public int getUniqueListSize2(Set<EmployeeWithEqual> empSet) {
		System.out.println("--------------------------------------------");
		int count = 0;
		boolean dupFound = false;
		EmployeeWithEqual empTemp = null;
		Map<Integer, EmployeeWithEqual> map = new HashMap<>();
		for (EmployeeWithEqual emp : empSet) {
			if (!map.containsKey(emp.getId())) {

				for (Integer key : map.keySet()) {
					dupFound = false;
					empTemp = map.get(key);
					if (empTemp.getFirstName().equalsIgnoreCase(emp.getFirstName())
							&& empTemp.getLastname().equalsIgnoreCase(emp.getLastname())) {
						System.out.println("found same details :" + emp.getFirstName() + " " + emp.getLastname());
						dupFound = true;
					}
				}
				if (!dupFound) {
					map.put(emp.getId(), emp);
					count++;
				}

			} else {
				System.out.println("Data already exists for id:" + emp.getId());

			}

		}
		System.out.println("Total Unique Records are :" + count);
		return count;
	}
	
	public int getUniqueListSize(Set<Employee> empSet) {
		System.out.println("--------------------------------------------");
		int count = 0;
		boolean dupFound = false;
		Employee empTemp = null;
		Map<Integer, Employee> map = new HashMap<>();
		for (Employee emp : empSet) {
			if (!map.containsKey(emp.getId())) {

				for (Integer key : map.keySet()) {
					dupFound = false;
					empTemp = map.get(key);
					if (empTemp.getFirstName().equalsIgnoreCase(emp.getFirstName())
							&& empTemp.getLastname().equalsIgnoreCase(emp.getLastname())) {
						System.out.println("found same details :" + emp.getFirstName() + " " + emp.getLastname());
						dupFound = true;
					}
				}
				if (!dupFound) {
					map.put(emp.getId(), emp);
					count++;
				}

			} else {
				System.out.println("Data already exists for id:" + emp.getId());

			}

		}
		System.out.println("Total Unique Records are :" + count);
		return count;
	}
}
