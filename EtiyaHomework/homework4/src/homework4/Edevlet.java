package homework4;

public class Edevlet implements GamerCheckService{

	public boolean CheckIfRealPerson(Gamer gamer) {
		System.out.println("E devlet bilgileri doğru:" + gamer.getFirstName());
		return true;
	}

}
