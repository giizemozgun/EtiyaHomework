package business.abstracts;

import java.util.List;


import entities.concretes.Instructor;


public interface InstructorService {
	
	List<Instructor> getAll();
	void add(Instructor instructor);
	
}
