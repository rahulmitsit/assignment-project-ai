package question3;

import java.util.Objects;

public class Employee {

	private int id;
	private String firstName;
	private String lastname;

	public Employee(int id, String fname, String lname) {
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
	public String toString() {
		return "[id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastname, other.lastname);
	}

}
