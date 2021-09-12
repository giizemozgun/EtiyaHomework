package kodlamaio.hrms.business.abstracts;



import java.util.Date;

import kodlamaio.hrms.core.utilities.results.Result;



public interface MernisVerificationService {
	
	Result validate(String nationalIdentity, String firstName, String lastName, Date birthDate);
}

