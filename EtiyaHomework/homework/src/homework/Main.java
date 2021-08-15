package homework;

import homework.Course;
import homework.CourseManager;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course("Programlamaya Giriş için Temel Kurs","Python,c#,java gibi..",0, "Engin Demiroğ");
		Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı","2 ay sürecek..",0, "Engin Demiroğ");
		Course[] course= {course1,course2};
		for(Course courses: course) {
		 System.out.println(courses.getCourseName());
		 System.out.println(courses.getTeacherName());
		 System.out.println(courses.getExplanation());
		 System.out.println(courses.getPrice());
		 System.out.println("***********");
		}
		 
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.remove(course2);

		 
		

	}

}
