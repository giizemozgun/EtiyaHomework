package dataAccess.concretes.jdbc;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class JdbcGameDao implements GameDao{
	
	List<Game> games;
	
	public JdbcGameDao() {
		super();
		this.games = new ArrayList<Game>();
	}

	@Override
	public List<Game> getAll() {
		// TODO Auto-generated method stub
		return this.games;
	}

	@Override
	public void add(Game entity) {
		this.games.add(entity);
		
	}

	@Override
	public void update(Game entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Game entity) {
		// TODO Auto-generated method stub
		
	}
	
	
}
