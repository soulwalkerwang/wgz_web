package com.guanzhong.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name="department")
public class Department
{
	@Id
	@Column(name="department_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="department_name")
	private String department_name;
	
	
	@OneToMany(targetEntity=com.guanzhong.bean.Employee.class, 
			 fetch=FetchType.EAGER, mappedBy="employeeDepartment")
	private Set<Employee> employee = new HashSet<Employee>();

	
	
	

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getDepartment_name()
	{
		return department_name;
	}

	public void setDepartment_name(String department_name)
	{
		this.department_name = department_name;
	}

	public Set<Employee> getEmployee()
	{
		return employee;
	}

	public void setEmployee(Set<Employee> employee)
	{
		this.employee = employee;
	}

	
	
	

	
	

}
