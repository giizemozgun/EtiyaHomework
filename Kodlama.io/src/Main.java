
import business.abstracts.CategoryService;
import business.abstracts.CourseService;
import business.abstracts.InstructorService;
import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import dataAccess.concretes.JpaCategoryDao;
import dataAccess.concretes.JpaCourseDao;
import dataAccess.concretes.JpaInstructorDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Instructor;



public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "MCT,PMP,ITIL");
		InstructorService instructorService = new InstructorManager(new JpaInstructorDao());
		instructorService.add(instructor1);
		for (Instructor instructor : instructorService.getAll()) {
			System.out.println(instructor);
		}
		
		Category category1 = new Category(1,"Programlama");
				CategoryService categoryService = new CategoryManager(new JpaCategoryDao());
		categoryService.add(category1);
		
		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı(C#+Angular)", "Engin Demiroğ",
				25, "img1", "img2",instructor1,category1);
		Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı(Java+React)", "Engin Demiroğ",
				75, "img1", "img2",instructor1,category1);
		Course course3 = new Course(3, "Programlamaya Giriş için Temel Kurs", "Engin Demiroğ",
				100, "img1", "img2",instructor1,category1);
		
		CourseService courseService = new CourseManager(new JpaCourseDao());
		courseService.add(course1);
		courseService.add(course2);
		courseService.add(course3);
		for (Course course : courseService.getAll()) {
			System.out.println(course);
		}
		
		for (Category category : categoryService.getAll()) {
			System.out.println(category);
		}
		
		
		//courseService.getByFilter("Kamp");
		//courseService.getByFilter("Engin");
		courseService.getByFilter("Programlama");
		
		
		
		
		

	}

}
