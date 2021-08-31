package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ScoreCalculatorTypeDao;
import entities.concretes.ScoreCalculatorType;

public class JdbcScoreCalculatorTypeDao implements ScoreCalculatorTypeDao {

		List<ScoreCalculatorType> scoreCalculatorTypes;
	public JdbcScoreCalculatorTypeDao() {
			super();
			this.scoreCalculatorTypes = new ArrayList<ScoreCalculatorType>();
		}

	@Override
	public List<ScoreCalculatorType> getAll() {
		
		return this.scoreCalculatorTypes;
	}

	@Override
	public void add(ScoreCalculatorType entity) {
		this.scoreCalculatorTypes.add(entity);
		
	}

	@Override
	public void update(ScoreCalculatorType entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ScoreCalculatorType entity) {
		// TODO Auto-generated method stub
		
	}

}
