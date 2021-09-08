package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employer_approval")
public class EmployerApproval {
	
	@Id
	@GeneratedValue
	@Column(name = "employer_id")
	private int verificationId;
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "process_result")
	private String processResult;
	
	@Column(name = "personnel_id")
	private int personnelId;
	
	
}