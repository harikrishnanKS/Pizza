package com.pizza.ifaces;

import java.util.List;

public interface GenericDao<T> {
	public T add(T t);
	public long update (T t);
	public long delete(T t);
	public T findById(long key);
	public List<T> findAll();

}
