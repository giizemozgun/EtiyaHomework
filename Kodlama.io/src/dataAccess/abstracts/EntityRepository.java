package dataAccess.abstracts;

import java.util.List;

public interface EntityRepository<T>{

	void add(T entity);
	List<T> getAll();
}
