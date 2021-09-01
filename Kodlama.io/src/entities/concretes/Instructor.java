package entities.concretes;



import entities.abstracts.Entity;

public class Instructor implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String authority; //yetkileri
	
	
	public Instructor() {
		super();
		
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", authority="
				+ authority + "]";
	}

	public Instructor(int id, String firstName, String lastName, String authority) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.authority = authority;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	




	
	
	

	
	
	
}
