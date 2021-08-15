package homework5.business.concretes;

import homework5.business.abstracts.UserCheckService;
import homework5.business.abstracts.UserService;
import homework5.business.abstracts.VerificationService;
import homework5.dataAccess.abstracts.UserDao;
import homework5.dataAccess.concretes.HibernateUserDao;
import homework5.entities.concretes.User;

public class UserManager implements UserService {
	
	UserCheckService customerCheckService;
	VerificationService mailVerificationService;
	UserDao userDao;
	
	public UserManager(MailVerificationManager mailVerificationManager, HibernateUserDao hibernateUserDao) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void signIn(User user) {
		if (userDao.getEmail(user.getEmail()) && userDao.getPassword(user.getPassword())
				&& mailVerificationService.checkVerifyAccount(user.getEmail()) == true) {
			System.out.println("Kullanıcı girişi yapıldı.");
		
	}else {
		System.out.println("Kullanıcı bilgileri yanlış.");
	}
		
		if (customerCheckService.isValid(user) == true) {
			System.out.print(user.getFirstName() + " kullanıcısı eklendi.");
			mailVerificationService.sendToVerifyMail(user.getEmail());
			userDao.add(user);
		}	
	
	
	}	
}
