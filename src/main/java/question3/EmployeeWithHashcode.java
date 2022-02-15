package question3;

import java.util.Objects;

public class EmployeeWithHashcode {
	private int id;
	private String firstName;
	private String lastname;

	public EmployeeWithHashcode(int id, String fname, String lname) {
		this.id = id;
		this.firstName = fname;
		this.lastname = lname;
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
	public int hashCode() {
		return Objects.hash(firstName, id, lastname);
	}

	
}
