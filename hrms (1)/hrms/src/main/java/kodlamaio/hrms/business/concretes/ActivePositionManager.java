package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ActivePositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ActivePositionDao;
import kodlamaio.hrms.entities.concretes.ActivePosition;

@Service
public class ActivePositionManager implements ActivePositionService {

	ActivePositionDao activePositionDao;
	
	@Autowired
	public ActivePositionManager(ActivePositionDao activePositionDao) {
		super();
		this.activePositionDao = activePositionDao;
	}

	@Override
	public DataResult<List<ActivePosition>> getAll() {
		return new SuccessDataResult<List<ActivePosition>>(this.activePositionDao.findAll());
	}

	@Override
	public Result add(ActivePosition activePosition) {
		 this.activePositionDao.save(activePosition);
	        return new SuccessResult("Aktif pozisyonlar sisteme eklendi");
	}

}
