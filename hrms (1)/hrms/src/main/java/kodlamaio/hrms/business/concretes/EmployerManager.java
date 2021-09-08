package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmailVerificationService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, EmailVerificationService emailVerificationService) {
		super();
		this.employerDao = employerDao;
		this.emailVerificationService = emailVerificationService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public Result add(Employer employer) {
		if (employer.getCompanyName() == null || employer.getCompanyName().isBlank() 
				|| employer.getWebSiteAddress() == null
				|| employer.getWebSiteAddress().isBlank() || employer.getEmail() == null 
				||  employer.getEmail().isBlank()
				|| employer.getPassword() == null || employer.getPassword().isBlank()
				|| employer.getPasswordAgain() == null || employer.getPasswordAgain().isBlank()
				|| employer.getPhoneNumber() == null || employer.getPhoneNumber().isBlank())
			return new ErrorResult("Alanlar boş bırakılamaz.");

		if (!emailVerificationService.validate(employer.getEmail()).isSuccess())
			return new ErrorResult("Girilen email hatalı.");

		if (employerDao.existsEmployerByEmail(employer.getEmail()))
			return new ErrorResult("Email sisteme daha önce kaydolmuş");

		if (!emailVerificationService.checkEmail(employer.getWebSiteAddress(), employer.getEmail()))
			return new ErrorResult("Email ile web adresi uyumlu değil.");

		if (!emailVerificationService.validate(employer.getEmail()).isSuccess())
			return new ErrorResult("Mail doğrulaması başarısız.");

		this.employerDao.save(employer);
		return new SuccessResult("İş veren sisteme başarıyla kaydedildi.");
	       
	}

}
