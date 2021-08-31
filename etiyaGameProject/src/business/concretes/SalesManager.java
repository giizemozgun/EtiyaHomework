package business.concretes;

import java.util.List;

import business.abstracts.SalesService;
import dataAccess.abstracts.SalesDao;
import entities.concretes.Sales;

public class SalesManager implements SalesService{

	SalesDao salesDao;
	
	

	public SalesManager(SalesDao salesDao) {
		super();
		this.salesDao = salesDao;
	}

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
		this.salesDao.add(sales);
		
	}

	@Override
	public List<Sales> getAll() {
		System.out.println("Listelendi");
		return this.salesDao.getAll();
		
	}

	@Override
	public void update(Sales sales) {
		System.out.println("Kampanya adı : " + sales.getCampaign().getName() + " Oyuncunun adı : "
				+ sales.getGamer().getFirstName() + " Güncellendi");
		this.salesDao.update(sales);
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Kampanya adı : " + sales.getCampaign().getName() + " Müşteri adı : "
				+ sales.getGamer().getFirstName() + " Silindi");
		this.salesDao.delete(sales);

		
	}
	
	public double calculateCampaignPrice(Sales sales) {
		double campaignPrice = sales.getGame().getUnitPrice()*(100- sales.getCampaign().getDiscountRate())/100;
		return campaignPrice;
	}

}
