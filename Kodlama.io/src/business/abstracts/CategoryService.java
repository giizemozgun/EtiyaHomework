package business.abstracts;

import java.util.List;

import entities.concretes.Category;


public interface CategoryService {

	List<Category> getAll();
	void add(Category category);
}
