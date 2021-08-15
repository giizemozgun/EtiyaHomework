package homework4;

public interface GamerCheckService {

	static boolean CheckIfRealPerson(Gamer gamer) {
		if (gamer.getbirthOfYear() == 1998 && gamer.getFirstName() == "Gizem" && 
				gamer.getLastName() == "Özgün"
				&& gamer.getnationaltyId() == "1000") {
			return true;
		} else {
			return false;
		}
		
	}
}
