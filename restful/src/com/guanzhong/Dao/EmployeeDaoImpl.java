package com.guanzhong.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;



@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao
{
	 @Autowired
	 private SessionFactory sessionFactory;

	  

	public boolean save(Employee employee)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = sessionFactory.openSession();
            
		    tx = session.beginTransaction();
			             
		    session.save(employee);
		    
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

	public boolean update(Employee employee)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = sessionFactory.openSession();
            
		    tx = session.beginTransaction();
			             
		    session.update(employee);
		    
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
	

	public boolean delete(Integer id)
	{
		boolean flag = false;
		Session session = null;
		Transaction tx = null;
		try
		{
			session = sessionFactory.openSession();
            
		    tx = session.beginTransaction();
			             
		    Employee employee = (Employee) session.get(Employee.class, id);
		    employee.setDepartment(null);
				    
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
	
	public List<Employee> findAllEmployee()
	{
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		return list;
		
		
	}

	public List<Employee> findAllDepartment(Integer id)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Employee where department_id = :id");
		query.setParameter("id", id);
		List<Employee> list = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return list;
		
		
	}

	public Employee findbyEmployeeId(Integer did, Integer eid)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Employee where department.id = :did"+
		                                   " and id = :eid");
		query.setParameter("did", did);
		query.setParameter("eid", eid);
		
		System.out.println(query);
		List<Employee> list = query.list();
		Employee employee = list.get(0);
		
		session.getTransaction().commit();
		session.close();
		
		return employee;
		
		
	}
	
	public Department getDepartmentById(Integer id)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Department department = (Department) session.get(Department.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return department;
		
	}
	
	public Employee getEmployeeById(Integer id)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Employee employee = (Employee) session.get(Employee.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return employee;
		
	}
	
	
	
	

}
