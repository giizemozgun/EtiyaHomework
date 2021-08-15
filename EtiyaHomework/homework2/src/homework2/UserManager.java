package homework2;

public class UserManager {
public void add(User user) {
	System.out.println("Öğrenci sisteme kayıt oldu: " + user.getFirstName());
}
public void Add(Instructor instructor) {
	System.out.println("Öğretmen sisteme eklendi:" + instructor.getFirstName());
}
}
