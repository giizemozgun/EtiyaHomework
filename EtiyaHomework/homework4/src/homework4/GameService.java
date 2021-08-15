package homework4;


public class GameService implements GameServiceManager {

	
	@Override
	public void add(Game game , Gamer gamer , Campaign campaign) {
		System.out.println(gamer.getFirstName() + " "+ game.getGameName()+ " oyununu " + 
	campaign.getCampaignName() +" kampanyası ile %" +campaign.getDiscount()+"  indirimli ekledi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " oyunu güncellendi.");
		
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " oyunu silindi.");
		
		
	}
	
	
}
