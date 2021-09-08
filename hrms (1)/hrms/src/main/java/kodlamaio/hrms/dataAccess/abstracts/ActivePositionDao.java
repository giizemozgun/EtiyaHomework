package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ActivePosition;



public interface ActivePositionDao extends JpaRepository<ActivePosition,Integer> {

}
