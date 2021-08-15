package homework5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();
	public HibernateUserDao(User user) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getEmail(String email) {
		for (User user : users) {
			if(user.getEmail() == email) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		for (User user : users) {
			if(user.getPassword() ==  password) {
				return true;
			}
		}
		return false;	
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
