package dataAccess.concretes.jdbc;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class JdbcUserDao implements UserDao {
	
	List<User> users;
	
	public JdbcUserDao() {
		super();
		this.users = new ArrayList<User>();
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

	@Override
	public void add(User entity) {
		this.users.add(entity);
		
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

}
