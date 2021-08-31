package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.SalesDao;
import entities.concretes.Sales;

public class JdbcSalesDao implements SalesDao {
	
	List<Sales> sales;
	
	public JdbcSalesDao() {
		super();
		this.sales = new ArrayList<Sales>();
	}

	@Override
	public List<Sales> getAll() {
		
		return this.sales;
	}

	@Override
	public void add(Sales entity) {
		this.sales.add(entity);
		
	}

	@Override
	public void update(Sales entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Sales entity) {
		// TODO Auto-generated method stub
		
	}

}
