package com.guanzhong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.guanzhong.Dao.StudentDao;
import com.guanzhong.bean.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentDao studentDao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean save(Student student)
	{
		return studentDao.save(student);
	}

	@Override
	public Student getStudentById(Integer id)
	{
		return studentDao.getStudentById(id);
	}

}
