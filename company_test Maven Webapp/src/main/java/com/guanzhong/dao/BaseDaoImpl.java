package com.guanzhong.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.guanzhong.util.HibernateUtil;

public abstract class BaseDaoImpl<T> implements BaseDao<T>
{
	
	abstract public boolean deleteById(Integer id);
	
	protected Class<T> clazz;

	public BaseDaoImpl()
	{
		clazz = (Class<T>)((ParameterizedType)getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	protected Class<T> getClazz()
	{
		return clazz;
	}
	
	public List<T> findAll(Class<T> entityClass)
	{
		Session session = null;
		Transaction tx = null;
		List<T> list = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
            
		    tx = session.beginTransaction();
			             
			String HQL = "From "+entityClass.getSimpleName();
			list = session.createQuery(HQL).list();
			
			tx.commit();
			
			
		} catch (Exception e)
		{
		   tx.rollback();
		   e.printStackTrace();
			
		} finally
		{
			session.close();
		}
		
		return list;
		
		
	}
	
	
	public T getByID(Integer id)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    
	    
	    T t = (T)session.get(clazz, id);
	    
	    session.getTransaction().commit();	
	    session.close();
		return t;
		
	             
	
		
	}
	
	public boolean delete(Object o)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
            
		    tx = session.beginTransaction();
			             
		    session.delete(o);
		    
		    flag = true;
			
			tx.commit();
			
			
		} catch (Exception e)
		{
		   tx.rollback();
		   e.printStackTrace();
			
		} finally
		{
			session.close();
		}
		
		return flag;
		
	}
	
	
	public boolean save(Object o)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
            
		    tx = session.beginTransaction();
			             
		    session.save(o);
		    
		    flag = true;
			
			tx.commit();
			
			
		} catch (Exception e)
		{
		   tx.rollback();
		   e.printStackTrace();
			
		} finally
		{
			session.close();
		}
		
		return flag;
		
		
	}
	
	public boolean saveOrUpdate(Object o)
	{
		
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
            
		    tx = session.beginTransaction();
			             
		    session.saveOrUpdate(o);
		    
		    flag = true;
			
			tx.commit();
			
			
		} catch (Exception e)
		{
		   tx.rollback();
		   e.printStackTrace();
			
		} finally
		{
			session.close();
		}
		
		return flag;
		
	}
	
	public boolean update(Object o)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
            
		    tx = session.beginTransaction();
			             
		    session.update(o);
		    
		    flag = true;
			
			tx.commit();
			
			
		} catch (Exception e)
		{
		   tx.rollback();
		   e.printStackTrace();
			
		} finally
		{
			session.close();
		}
		
		return flag;
		
	}
	
	
	
	
	

}
