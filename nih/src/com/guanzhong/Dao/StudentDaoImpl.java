package com.guanzhong.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.guanzhong.bean.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean save(Student student)
	{
		boolean flag = false;
		Session session = null;
		
		
			session = sessionFactory.getCurrentSession();
		    session.save(student);
			flag = true;
			
			
		
		return flag;
	}

	@Override
	public Student getStudentById(Integer id)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Student student = (Student) session.get(Student.class, id);		
		session.getTransaction().commit();
		session.close();
		
		return student;
	}

}
