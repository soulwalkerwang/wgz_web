package com.guanzhong.dao;

import java.util.List;

public interface BaseDao<T>
{
	public boolean save(Object o);
	public boolean delete(Object o);
	public boolean deleteById(Integer id);
	public boolean update(Object o);
	public boolean saveOrUpdate(Object o);
	
	public T getByID(Integer id);
	public List<T> findAll(Class<T> entityClass);
	
	
	

}
