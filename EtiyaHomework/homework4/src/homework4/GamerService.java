package homework4;

public class GamerService implements GamerServiceManager {
	
	GamerCheckService gamerCheckService;

	public GamerService(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	public GamerService() {
		// TODO Auto-generated constructor stub
	}

	public void add(Gamer gamer) {
		
		if (GamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Sisteme başarıyla eklendi: "+ gamer.getFirstName());
		}else {
			System.out.println("Hatalı giriş.Ekleme başarısız.");
		}
			
	}
	
	public void update(Gamer gamer) {
		System.out.println("Oyuncunun bilgileri güncellendi:" + gamer.getFirstName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu kaydı silindi : " + gamer.getFirstName());
		
	}
}
