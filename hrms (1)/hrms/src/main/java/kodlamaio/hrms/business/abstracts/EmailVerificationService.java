package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;

public interface EmailVerificationService {

	
	Result validate(String email);
	boolean checkEmail(String webAddress, String email);
}