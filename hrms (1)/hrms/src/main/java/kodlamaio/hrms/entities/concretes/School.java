package kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="schools")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes"})

public class School {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@NotBlank
	@NotNull
    private int id;
	
	@Column(name="school_name")
	@NotBlank
	@NotNull
    private String schoolName;
	
	@Column(name="department")
	@NotBlank
	@NotNull
    private String department;
	
	@Column(name="school_start_year")
	@NotBlank
	@NotNull
    private Date schoolStartYear;
	
	
	@Column(name="graduation_year")
    private Date graduationYear;
	
	@Column(name="status")
    private String status;
	
	@JsonIgnore
	@ManyToMany(mappedBy="schools")	
	private List<Resume> resumes;
	
	
	
		
}
