package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
	
	@Query("From JobAdvertisement where is_active=true ORDER BY application_deadline ASC")
    List<JobAdvertisement> getByAscDate();
	
	@Query("From JobAdvertisement where is_active = true")
	List<JobAdvertisement> getByActiveStatuss();
}
