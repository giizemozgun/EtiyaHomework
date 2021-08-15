package homework2;

public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engindemirog@");
		instructor1.setPassword("1234");
		instructor1.setLesson("Java"); 
		
		Student student1 = new Student();
		student1.setFirstName("Gizem");
		student1.setLastName("Özgün");
		student1.setEmail("gizem@hot");
		student1.setPassword("1234");
		student1.setLesson("Java");
		
		UserManager userManager = new UserManager();
		userManager.Add(instructor1);		
		userManager.add(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
	}

}
