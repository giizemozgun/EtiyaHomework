package homework4;

public class SaleService implements SaleServiceManager{

	
	@Override
	public void sell(Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() +" kampanya ile satın aldı.");
	}

}
