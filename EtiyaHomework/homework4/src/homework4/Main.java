package homework4;

public class Main {

	public static void main(String[] args) {
		

		Gamer gamer = new Gamer("Gizem", "Özgün",1998, "1000");
		GamerService gamerService = new GamerService();
		gamerService.add(gamer);
		gamerService.update(gamer);
		gamerService.delete(gamer);

		

		Campaign campaign = new Campaign("Sevgililer günü",50, "14 Şubat");
		CampaignService campaignService = new CampaignService();
		campaignService.add(campaign);
		campaignService.delete(campaign);
		campaignService.update(campaign);
		
		
		Game game = new Game(1, "Lol", 100);
		GameService gameService = new GameService();
		gameService.add(game,gamer,campaign);
		gameService.delete(game);
		gameService.update(game);
		
		SaleService saleService = new SaleService();
		if( GamerCheckService.CheckIfRealPerson(gamer) == true) {
		saleService.sell(gamer,campaign);
		}else {
			System.out.println("Satış gerçekleştirilemedi. Bilgilerinizi kontrol ediniz.");
		}

	}

}
