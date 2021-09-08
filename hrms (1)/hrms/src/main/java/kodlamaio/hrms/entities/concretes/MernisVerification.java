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
@Table(name = "mernis_verification")
public class MernisVerification {
	
	@Id
	@GeneratedValue
	@Column(name = "mernis_id")
	private int verificationId;
	
	@Column(name = "result")
	private boolean result;
	
	
}
