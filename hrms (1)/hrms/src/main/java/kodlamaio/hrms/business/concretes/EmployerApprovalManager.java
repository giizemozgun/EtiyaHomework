package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerApprovalService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerApprovalDao;
import kodlamaio.hrms.entities.concretes.EmployerApproval;
@Service
public class EmployerApprovalManager implements EmployerApprovalService{

	EmployerApprovalDao employerApprovalDao;
	
	@Autowired
	public EmployerApprovalManager(EmployerApprovalDao employerApprovalDao) {
		super();
		this.employerApprovalDao = employerApprovalDao;
	}

	@Override
	public DataResult<List<EmployerApproval>> getAll() {
		return new SuccessDataResult<List<EmployerApproval>>(this.employerApprovalDao.findAll());
	}
	

}
