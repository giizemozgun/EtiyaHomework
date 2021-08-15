package homework4;

public class Campaign {
	
	private String campaignName;
	private int discount;
	private String date;
	
	public Campaign() {
		super();
	}

	public Campaign(String campaignName, int discount, String date) {
		super();
		this.campaignName = campaignName;
		this.discount = discount;
		this.date = date;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
