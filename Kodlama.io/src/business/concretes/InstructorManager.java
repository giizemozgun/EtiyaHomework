package business.concretes;


import java.util.List;

import business.abstracts.InstructorService;

import dataAccess.abstracts.InstructorDao;

import entities.concretes.Instructor;

public class InstructorManager implements InstructorService{

	InstructorDao instructorDao;
	
	
	
	public InstructorManager(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
		
	}


	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return this.instructorDao.getAll();
	}

	@Override
	public void add(Instructor instructor) {
		this.instructorDao.add(instructor);
		
	}

	
}
