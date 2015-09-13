package com.guanzhong.Dao;

import java.util.List;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;

public interface DepartmentDao
{
	void saveOrUpdate(Department department);
	void delete (Integer id);
	List<Department> findAllDepartment();
	public Department getDepartmentById(Integer id);

}
