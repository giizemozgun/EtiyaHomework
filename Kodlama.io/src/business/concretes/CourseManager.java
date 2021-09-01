package business.concretes;


import java.util.List;

import business.abstracts.CourseService;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class CourseManager implements CourseService {

	CourseDao courseDao;
	
	public CourseManager(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	@Override
	public List<Course> getAll() {
		
		return this.courseDao.getAll();
	}

	@Override
	public void add(Course course) {
		this.courseDao.add(course);
		
	}

	@Override
	public void getByFilter(String filterText) {
		for (Course course : this.courseDao.getAll()) {
			if (course.getName().contains(filterText) || course.getInstructor().getFirstName().contains(filterText) || 
					course.getCategory().getName().contains(filterText) ) {
				System.out.println(course.getName());
			}
		}
		
	}

}
