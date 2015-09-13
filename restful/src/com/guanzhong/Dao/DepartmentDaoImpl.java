package com.guanzhong.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.guanzhong.bean.Department;


@Repository("departmentDao")
public class DepartmentDaoImpl implements DepartmentDao
{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean save(Department department)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = sessionFactory.openSession();
            
		    tx = session.beginTransaction();
			             
		    session.save(department);
		    
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

	@Override
	public boolean update(Department department)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = sessionFactory.openSession();
            
		    tx = session.beginTransaction();
			             
		    session.update(department);
		    
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

	@Override
	public boolean delete(Integer id)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = sessionFactory.openSession();
            
		    tx = session.beginTransaction();
			             
		    Department department = (Department) session.get(Department.class, id);
		    department.getEmployee().clear();
				    
		    session.delete(department);
		    
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

	@Override
	
	public List<Department> findAllDepartment()
	{
		Session session = sessionFactory.getCurrentSession();
		
		
		Query query = session.createQuery("from Department");
		
		@SuppressWarnings("unchecked")
		List<Department> list = query.list();
		
		
		return list;
	}

	@Override
	public Department getDepartmentById(Integer id)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Department department = (Department) session.get(Department.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return department;
	}
	
	

}
