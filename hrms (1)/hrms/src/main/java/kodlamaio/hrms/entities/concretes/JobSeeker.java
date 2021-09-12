package kodlamaio.hrms.entities.concretes;



import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_seekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int Id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "national_identity")
	private String nationalIdentity;
	
	@Column(name = "birth_date")
	private Date birthDate;
	
	@OneToOne()
	@JoinColumn(name="id")
	private User user;
	
	
	@OneToMany(mappedBy="jobSeeker")
	@JsonIgnore
    private List<Resume> resumes;
	
	
	
}