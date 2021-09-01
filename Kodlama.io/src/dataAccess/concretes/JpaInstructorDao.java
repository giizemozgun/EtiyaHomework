package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.InstructorDao;
import entities.concretes.Instructor;

public class JpaInstructorDao implements InstructorDao{

	List<Instructor> instructors;
	
	public JpaInstructorDao() {
		super();
		this.instructors = new ArrayList<Instructor>();
	}

	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return this.instructors;
	}

	@Override
	public void add(Instructor entity) {
		this.instructors.add(entity);
		
	}

}
