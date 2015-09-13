package com.guanzhong.Dao;

import java.util.List;

import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;

public interface DepartmentDao
{
	boolean save(Department department);
	boolean update (Department department);
	boolean delete (Integer id);
	List<Department> findAllDepartment();
	public Department getDepartmentById(Integer id);

}
