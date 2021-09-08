package kodlamaio.hrms.business.concretes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dataAccess.abstracts.EmailVerificationDao;


@Service
public class EmailVerificationManager implements EmailVerificationService {

	EmailVerificationDao emailVerificationDao;
	
	@Autowired
	public EmailVerificationManager(EmailVerificationDao emailVerificationDao) {
		super();
		this.emailVerificationDao = emailVerificationDao;
	}

	@Override
	public Result validate(String email) {
		return new Result(true, email + ": mail doğrulandı.");
	}

	@Override
	public boolean checkEmail(String webAddress, String email) {
		return webAddress.contains(email.split("@")[1]);
	}

}
