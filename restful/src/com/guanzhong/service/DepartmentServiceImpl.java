package com.guanzhong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guanzhong.Dao.DepartmentDao;
import com.guanzhong.Dao.EmployeeDao;
import com.guanzhong.bean.Department;


@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService
{
	@Autowired
	DepartmentDao departmentDao;

	@Override
	public boolean save(Department department)
	{
		return this.departmentDao.save(department);
		
	}

	@Override
	public boolean update(Department department)
	{
		
		return this.departmentDao.update(department);
	}

	@Override
	public boolean delete(Integer id)
	{
		return this.departmentDao.delete(id);
	}

	@Override
    @Transactional
	public List<Department> findAllDepartment()
	{
		return this.departmentDao.findAllDepartment();
	}

	@Override
	public Department getDepartmentById(Integer id)
	{
		return this.departmentDao.getDepartmentById(id);
	}

}
