package homework5.business.concretes;

import java.util.ArrayList;
import java.util.List;

import homework5.business.abstracts.VerificationService;
import homework5.entities.concretes.User;

public class MailVerificationManager implements VerificationService{


	UserCheckManager userCheckManager;

	List<String> verificatedEmails = new ArrayList<String>();
	public MailVerificationManager(User user) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendToVerifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email + " doğrulandı");	
		
		
	}

	@Override
	public void verifyMail(String email) {
		System.out.println(email + "  doğrulama maili gönderildi.");
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;
		
	}

}
