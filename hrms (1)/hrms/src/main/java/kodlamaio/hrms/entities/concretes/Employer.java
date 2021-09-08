package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employers")
public class Employer extends User {
	@Id
	@GeneratedValue
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_site")
	private String webSite;
	
	@Column(name = "web_site_address")
	private String webSiteAddress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	
	public Employer(int employerId, String companyName, String webSite, String webSiteAddress, String phoneNumber,
			int id, String email, String password, String passwordAgain) {
		super(id,email,password,passwordAgain);
		this.employerId = employerId;
		this.companyName = companyName;
		this.webSite = webSite;
		this.webSiteAddress = webSiteAddress;
		this.phoneNumber = phoneNumber;
	}

	
}
