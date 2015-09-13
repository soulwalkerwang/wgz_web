package com.guanzhong.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="employee")
public class Employee
{
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="employee_age")
	private Integer employeeAge;

	@ManyToOne(targetEntity=com.guanzhong.bean.Department.class,
			  fetch=FetchType.EAGER)
	@JoinColumn(name="department_id")
	private Department employeeDepartment;



	public Integer getId()
	{
		return id;
	}



	public void setId(Integer id)
	{
		this.id = id;
	}



	public String getEmployeeName()
	{
		return employeeName;
	}



	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}



	public Integer getEmployeeAge()
	{
		return employeeAge;
	}



	public void setEmployeeAge(Integer employeeAge)
	{
		this.employeeAge = employeeAge;
	}



	public Department getEmployeeDepartment()
	{
		return employeeDepartment;
	}



	public void setEmployeeDepartment(Department employeeDepartment)
	{
		this.employeeDepartment = employeeDepartment;
	}
	
}
