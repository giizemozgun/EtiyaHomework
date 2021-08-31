package dataAccess.concretes.jdbc;

import java.util.ArrayList;
import java.util.List;


import dataAccess.abstracts.GamePlayedDao;
import entities.concretes.GamePlayed;

public class JdbcGamePlayedDao implements GamePlayedDao {
	
	List<GamePlayed> gamePlayeds;
	
	public JdbcGamePlayedDao() {
		super();
		this.gamePlayeds = new ArrayList<GamePlayed>();
		
	}
	@Override
	public List<GamePlayed> getAll() {
		
		return this.gamePlayeds;
	}

	@Override
	public void add(GamePlayed entity) {
		this.gamePlayeds.add(entity);
		
	}

	@Override
	public void update(GamePlayed entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GamePlayed entity) {
		// TODO Auto-generated method stub
		
	}

}
