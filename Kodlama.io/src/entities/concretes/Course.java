package entities.concretes;


import entities.abstracts.Entity;

public class Course implements Entity{
	
	private int id;
	private String name;
	private String instructorName;
	private double completionRate;
	private String imagePath;
	private String instructorİmagePath;
	private Instructor instructor;
	private Category category;
	
	
	public Course() {
		super();
	}
	public Course(int id, String name, String instructorName, double completionRate, String imagePath,
			String instructorİmagePath, Instructor instructor,Category category) {
		super();
		this.id = id;
		this.name = name;
		this.instructorName = instructorName;
		this.completionRate = completionRate;
		this.imagePath = imagePath;
		this.instructorİmagePath = instructorİmagePath;
		this.instructor = instructor;
		this.category= category;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}



	
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public double getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(double completionRate) {
		this.completionRate = completionRate;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getInstructorİmagePath() {
		return instructorİmagePath;
	}

	public void setInstructorİmagePath(String instructorİmagePath) {
		this.instructorİmagePath = instructorİmagePath;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", instructorName=");
		builder.append(instructorName);
		builder.append(", completionRate=");
		builder.append(completionRate);
		builder.append(", imagePath=");
		builder.append(imagePath);
		builder.append(", instructorİmagePath=");
		builder.append(instructorİmagePath);
		builder.append(", instructor=");
		builder.append(instructor);
		builder.append(", category=");
		builder.append(category);
		builder.append("]");
		return builder.toString();
	}
	
	
}
