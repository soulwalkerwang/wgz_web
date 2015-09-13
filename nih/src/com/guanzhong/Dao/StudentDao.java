package com.guanzhong.Dao;


import com.guanzhong.bean.Student;

public interface StudentDao
{
	boolean save(Student student);
	public Student getStudentById(Integer id);
	

}
