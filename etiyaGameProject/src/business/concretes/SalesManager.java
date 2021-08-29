package business.concretes;

import business.abstracts.SalesService;
import entities.Sales;

public class SalesManager implements SalesService{

	@Override
	public void add(Sales sales) {
		System.out.println(
				"Oyun adı : " + sales.getGame().getName() + 
				"- Oyunun ücreti : " + sales.getGame().getUnitPrice()+
				" - Oyuncunun adı : " + sales.getGamer().getFirstName() + 
				" - Kampanya adı : " + sales.getCampaign().getName() +
				"- Kampanyalı Fiyat : " + this.calculateCampaignPrice(sales) + 
				" - Satış işlemi gerçekleşti"
						);
		
	}

	@Override
	public void getAll() {
		System.out.println("Listelendi");
		
	}

	@Override
	public void update(Sales sales) {
		System.out.println("Kampanya adı : " + sales.getCampaign().getName() + " Oyuncunun adı : "
				+ sales.getGamer().getFirstName() + " Güncellendi");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Kampanya adı : " + sales.getCampaign().getName() + " Müşteri adı : "
				+ sales.getGamer().getFirstName() + " Silindi");

		
	}
	
	public double calculateCampaignPrice(Sales sales) {
		double campaignPrice = sales.getGame().getUnitPrice()*(100- sales.getCampaign().getDiscountRate())/100;
		return campaignPrice;
	}

}
