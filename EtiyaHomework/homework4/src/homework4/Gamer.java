package homework4;

public class Gamer {

	private String firstName;
	private String lastName;
	private int birthOfYear;
	private String nationaltyId;
	
	public Gamer() {
		super();
	}

	public Gamer(String firstName, String lastName, int birthOfYear, String nationaltyId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
		this.nationaltyId= nationaltyId;
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

	public int getbirthOfYear() {
		return birthOfYear;
	}

	public void setAge(int age) {
		this.birthOfYear = age;
	}

	public String getnationaltyId() {
		return nationaltyId;
	}

	public void setnationaltyId(String nationaltyId) {
		this.nationaltyId =nationaltyId;
	}
	
}
