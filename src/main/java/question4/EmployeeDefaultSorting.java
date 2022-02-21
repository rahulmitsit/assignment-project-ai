package question4;

public class EmployeeDefaultSorting implements Comparable<EmployeeDefaultSorting>{

	private int id;
	private String firstName;
	private String lastname;
	
	EmployeeDefaultSorting(int id,String fname,String lname){
		this.id=id;
		this.firstName=fname;
		this.lastname=lname;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastname() {
		return lastname;
	}
	

	@Override
	public String toString() {
		return "[id=" + id + ",firstName=" + firstName + ",lastname=" + lastname + "]";
	}
	@Override
	public int compareTo(EmployeeDefaultSorting o) {

		return this.firstName.compareTo(o.firstName);
	}
	
	
}
