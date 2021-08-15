package homework;

public class Course {
	private String courseName;
	private String explanation;
	private int price;
	private String teacherName;
	
	public Course(String courseName, String explanation, int price, String teacherName) {
		super();
		this.courseName = courseName;
		this.explanation = explanation;
		this.price = price;
		this.teacherName = teacherName;
	}
	
	public Course() {

	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
