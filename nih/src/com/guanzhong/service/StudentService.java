package com.guanzhong.service;

import com.guanzhong.bean.Student;

public interface StudentService
{
	boolean save(Student student);
	public Student getStudentById(Integer id);

}
