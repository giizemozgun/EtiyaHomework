package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmailVerificationService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.business.abstracts.MernisVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	private MernisVerificationService mernisVerificationService;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, MernisVerificationService mernisVerificationService,
			EmailVerificationService emailVerificationService ) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.mernisVerificationService = mernisVerificationService;
		this.emailVerificationService = emailVerificationService;
		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
	}
	
	

	@Override
	public Result add(JobSeeker jobSeeker) {
		if (jobSeeker.getEmail() == null || jobSeeker.getEmail().isBlank() || jobSeeker.getFirstName() == null
				|| jobSeeker.getFirstName().isBlank() || jobSeeker.getLastName() == null
				|| jobSeeker.getLastName().isBlank() || jobSeeker.getNationalIdentity() == null
				|| jobSeeker.getNationalIdentity().isBlank() || jobSeeker.getPassword() == null
				|| jobSeeker.getPassword().isBlank() || jobSeeker.getPasswordAgain() == null
				|| jobSeeker.getPasswordAgain().isBlank())
			return new ErrorResult("Kayıt için eksik değer girildi, kontrol edip tekrar deneyin.");

		if (!mernisVerificationService.validate(jobSeeker.getNationalIdentity(), jobSeeker.getFirstName(),
				jobSeeker.getLastName(), jobSeeker.getBirthDate()).isSuccess())
			return new ErrorResult("Kullanıcı kimliği doğrulanamadı.");

		if (jobSeekerDao.existsJobSeekerByEmail(jobSeeker.getEmail()))
			return new ErrorResult("Email bu sisteme kayıtlı.");

		if (jobSeekerDao.existsJobSeekerByIdentityNumber(jobSeeker.getNationalIdentity()))
			return new ErrorResult("Kimlik numaranız sistemde kayıtlıdır.");

		if (!emailVerificationService.validate(jobSeeker.getEmail()).isSuccess())
			return new ErrorResult("Mail doğrulaması başarısız.");

		jobSeekerDao.save(jobSeeker);
		return new SuccessResult(jobSeeker.getEmail() + " : Sisteme kaydoldu.");
	}
	
}
