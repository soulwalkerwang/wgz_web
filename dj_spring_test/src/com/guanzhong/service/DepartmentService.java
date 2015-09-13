package com.guanzhong.service;

import java.util.List;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;

public interface DepartmentService
{
	void saveOrUpdate(Department department);
	void delete (Integer id);
	List<Department> findAllDepartment();
	public Department getDepartmentById(Integer id);

}
