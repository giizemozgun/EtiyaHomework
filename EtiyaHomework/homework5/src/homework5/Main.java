package homework5;

import homework5.business.concretes.MailVerificationManager;
import homework5.business.concretes.UserCheckManager;
import homework5.business.concretes.UserManager;
import homework5.dataAccess.concretes.HibernateUserDao;
import homework5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("Gizem");
		user.setLastName("Özgün");
		user.setEmail("gizem@hot");
		user.setPassword("1234");
		

		UserManager userManager = new UserManager(new MailVerificationManager(user),new HibernateUserDao(user));
		
		userManager.signIn(user);
	}

}
