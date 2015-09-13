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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.guanzhong.bean.Department;


@Repository("departmentDao")
public class DepartmentDaoImpl implements DepartmentDao
{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveOrUpdate(Department department)
	{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(department);
	}



	@Override
	public void delete(Integer id)
	{
		Session session = sessionFactory.getCurrentSession();
		session.createQuery("delete Department where id = :departmentId")
			.setParameter("departmentId", id).executeUpdate();
		
		
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
