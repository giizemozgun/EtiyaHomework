package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.School;

public interface SchoolService {
	
	DataResult<List<School>> getAll();
	
	DataResult<School> getById(int id);
	
	Result add(School school);
	
	void update(School school);
}
