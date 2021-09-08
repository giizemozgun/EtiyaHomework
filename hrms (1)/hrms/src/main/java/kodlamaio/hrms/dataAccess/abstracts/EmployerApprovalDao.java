package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;



import kodlamaio.hrms.entities.concretes.EmployerApproval;

public interface EmployerApprovalDao extends JpaRepository<EmployerApproval,Integer> {

}
