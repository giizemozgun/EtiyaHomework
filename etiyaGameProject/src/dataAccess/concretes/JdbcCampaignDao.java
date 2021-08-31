package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class JdbcCampaignDao implements CampaignDao{

	List<Campaign> campaigns;

	public JdbcCampaignDao() {
		super();
		this.campaigns = new ArrayList<Campaign>();
	}
	@Override
	public List<Campaign> getAll() {
		
		return this.campaigns;
	}

	@Override
	public void add(Campaign entity) {
		this.campaigns.add(entity);
		
	}

	@Override
	public void update(Campaign entity) {
		
		
	}

	@Override
	public void delete(Campaign entity) {
		
		
	}

}
