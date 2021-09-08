package kodlamaio.hrms.business.concretes;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.MernisVerificationService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.MernisVerificationDao;
@Service
public class MernisVerificationManager implements MernisVerificationService {

	MernisVerificationDao mernisVerificationDao;
	
	@Autowired
	public MernisVerificationManager(MernisVerificationDao mernisVerificationDao) {
		super();
		this.mernisVerificationDao = mernisVerificationDao;
	}

	@Override
	public Result validate(String nationalId, String firstName, String lastName, Date birthYear) {
		return new SuccessResult("Kimlik numarasi dogrulandi: " + nationalId);
	}
	
	
}

