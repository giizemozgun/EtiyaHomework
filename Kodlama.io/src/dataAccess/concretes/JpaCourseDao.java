package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;


public class JpaCourseDao implements CourseDao{

	List<Course> courses;
	
	public JpaCourseDao() {
		super();
		this.courses= new ArrayList<Course>();
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return this.courses;
	}

	@Override
	public void add(Course entity) {
	this.courses.add(entity);
		
	}

}
