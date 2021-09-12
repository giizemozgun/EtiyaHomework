package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

	boolean existsJobSeekerByNationalIdentity(String nationalIdentity);
	boolean existsJobSeekerByUser_Email(String email);
}