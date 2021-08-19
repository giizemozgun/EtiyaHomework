package etiyaGames;

import java.util.ArrayList;
import java.util.List;


public class UserService {
	
	ArrayList<User> users = new ArrayList<User>(); 
	
	public void add(User user) {
		if(user.getAge()>=15) {
		System.out.println("Kullanıcı başarıyla kayıt oldu." + user.getFirstName());
		users.add(user);
		}else {
		System.out.println("Yaşınız uygun değil.");
		}
		
	}
		public List<User> getUsers() {
			return users;
			
		}
}