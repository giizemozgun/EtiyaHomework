package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;



public class JpaCategoryDao implements CategoryDao{

	List<Category> categories;
	
	public JpaCategoryDao() {
		super();
		this.categories = new ArrayList<Category>();
		
	}
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return this.categories;
	}
	@Override
	public void add(Category entity) {
		this.categories.add(entity);
		
	}

}
