package dataAccess.concretes.jdbc;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class JdbcGamerDao implements GamerDao {
	
	List<Gamer> gamers;
	
	public JdbcGamerDao() {
		super();
		this.gamers = new ArrayList<Gamer>();
	}

	@Override
	public List<Gamer> getAll() {
		
		return this.gamers;
	}

	@Override
	public void add(Gamer entity) {
		this.gamers.add(entity);
		
	}

	@Override
	public void update(Gamer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer entity) {
		// TODO Auto-generated method stub
		
	}

}
