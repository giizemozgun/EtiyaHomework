package homework5.business.concretes;

import java.util.ArrayList;
import java.util.List;

import java.util.regex.Pattern;

import homework5.business.abstracts.UserCheckService;
import homework5.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	
	List<String> listOfEmail = new ArrayList<String>();
	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().isEmpty()) {
			System.out.println("İsim alanı boş bırakılamaz.");
			return false;
		} else {
			if (user.getFirstName().length() < 3) {
				System.out.println("İsim 2 karakterden daha küçük olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		
		if (user.getLastName().isEmpty()) {
			System.out.println("Soyisim alanı boş bırakılamaz.");
			return false;
		} else {
			if (user.getLastName().length() < 3) {
				System.out.println("Soyisim 2 karakterden daha küçük olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (user.getEmail().isEmpty()) {
			System.out.println("Email alanı boş bırakılamaz.");
			return false;
		} else {
			if (pattern.matcher(user.getEmail()).find() == false) {
				System.out.println("Girilen email adresi email formatında değil.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().isEmpty()) {
			System.out.println("Parola alanı boş bırakılamaz.");
			return false;
		} else {
			if (user.getPassword().length() < 6) {
				System.out.println("Parola 6 karakterden daha küçük olamaz.");
				return false;
			}
		}
		return true;
		
	}

	@Override
	public boolean uniqueEmail(User user) {
		boolean result=true;
		if (listOfEmail.contains(user.getEmail())) {
			System.out.println("Bu mail adresi kullanımda.");
			result=false;
		}else{
			result=true;
			listOfEmail.add(user.getEmail());
		}		
		return result;
		
	}

	@Override
	public boolean isValid(User user) {
		if (checkFirstName(user) && checkLastName(user) && checkEmail(user) && checkPassword(user)
				&& uniqueEmail(user) == true) {
			return true;
		}
		return false;
		
	}

}
