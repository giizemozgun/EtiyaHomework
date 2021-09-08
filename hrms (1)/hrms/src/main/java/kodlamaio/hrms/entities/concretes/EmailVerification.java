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
@Table(name = "email_verification")
public class EmailVerification {
	
	@Id
	@GeneratedValue
	@Column(name = "verification_id")
	private int verificationId;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "validation_code")
	private String validationCode;
	
	@Column(name = "result")
	private boolean result;

}

