package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Resume;

public interface ResumeService {
	
	DataResult<List<Resume>> getAll();
	
	DataResult<Resume> getById(int id);
	
	Result add(Resume resume);
	
	DataResult<Resume> getByIdOrderByGraduationYearDesc(int id);
}	
