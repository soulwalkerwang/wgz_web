package com.guanzhong.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.guanzhong.bean.Employee;
import com.guanzhong.util.HibernateUtil;

public class EmployeeDao extends BaseDaoImpl<Employee>
{
	
	@Override
	public List<Employee> findAll(Class<Employee> entityClass)
	{
		return super.findAll(entityClass);
	}
	
	
	@Override
	public Employee getByID(Integer id)
	{
		return super.getByID(id);
	}
	
	@Override
	public boolean deleteById(Integer id)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
            
		    tx = session.beginTransaction();
			             
		    Employee employee = (Employee) session.get(Employee.class, id);
		    employee.setDepartment(null);
			employee.getProject().clear();
				    
		    session.delete(employee);
		    
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
	public boolean save(Object o)
	{
		return super.save(o);
	}
	
	@Override
	public boolean update(Object o)
	{
		
		return super.update(o);
	}
	
	@Override
	public boolean saveOrUpdate(Object o)
	{
		
		return super.saveOrUpdate(o);
	}
	
	@Override
	public boolean delete(Object o)
	{
		return super.delete(o);
		
	}

}
