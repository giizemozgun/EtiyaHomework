package business.abstracts;

import java.util.List;

import entities.concretes.Course;


public interface CourseService {

	List<Course> getAll();
	void add(Course course);
	void getByFilter(String filterText);
}
