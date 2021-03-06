package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="resumes")
@AllArgsConstructor
@NoArgsConstructor
public class Resume {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "image")
	private String image;

	@Column(name = "github_link")
	private String githubLink;

	@Column(name = "linkedin_link")
	private String linkedinLink;
	
	@Column(name = "technology")
	private String technology;
	
	@Column(name = "cover_letter")
	private String coverLetter;
	
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
    private JobSeeker jobSeeker;
	
	@ManyToMany()
    @JoinTable(name = "resume_schools", 
    joinColumns = @JoinColumn(name = "resume_id"), 
    inverseJoinColumns = @JoinColumn(name = "school_id"))
	private List<School> schools;
	   
	@ManyToMany()
    @JoinTable(name = "resume_foreign_languages", 
    joinColumns = @JoinColumn(name = "resume_id"), 
    inverseJoinColumns = @JoinColumn(name = "foreign_language_id"))
	 private List<ForeignLanguage> foreignLanguages;
	
	@ManyToMany()
    @JoinTable(name = "resume_job_experience", 
    joinColumns = @JoinColumn(name = "resume_id"), 
    inverseJoinColumns = @JoinColumn(name = "job_experience_id"))
	private List<JobExperience> jobExperiences;
   
	
	
}
