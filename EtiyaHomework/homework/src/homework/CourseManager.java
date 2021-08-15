package homework;

import homework.Course;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs başarıyla eklendi: " + course.getCourseName());
	}
	
	public void remove(Course course) {
		System.out.println("Kurs silindi: " + course.getCourseName());
	}
public Course[] getAll() {
		
		Course course1 = new Course();
		course1.setCourseName("Programlamaya Giriş için Temel Kurs");
		course1.setExplanation("Python,c#,java gibi..");
		course1.setPrice(0);
		course1.setTeacherName("Engin Demiroğ");
		
		Course course2 = new Course();
		course1.setCourseName("Yazılım Geliştirici Yetiştirme Kampı");
		course1.setExplanation("2 ay sürecek..");
		course1.setPrice(0);
		course1.setTeacherName("Engin Demiroğ");
		
		Course[] courses = {course1,course2};
		return courses;
		
		
	}
}
