package com.guanzhong.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.guanzhong.Dao.DepartmentDao;
import com.guanzhong.Dao.EmployeeDao;
import com.guanzhong.bean.Department;
import com.guanzhong.bean.Employee;

@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService
{
	@Autowired
	DepartmentDao departmentDao;

	@Override
	public void saveOrUpdate(Department department)
	{
		this.departmentDao.saveOrUpdate(department);
	}


	@Override
	public void delete(Integer id)
	{
		this.departmentDao.delete(id);
	}

	@Override
    @Transactional("transactionManager")
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
