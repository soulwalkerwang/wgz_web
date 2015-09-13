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

import org.codehaus.jackson.annotate.JsonIgnore;


@Entity
@Table(name="employee")
public class Employee
{
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="employee_name")
	private String employee_name;
	
	
	@JsonIgnore
	@ManyToOne(targetEntity=com.guanzhong.bean.Department.class,
			cascade={CascadeType.ALL},  fetch=FetchType.EAGER)
	@JoinColumn(name="department_id")
	private Department department;
	
	
	
	
	
	
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getEmployee_name()
	{
		return employee_name;
	}
	public void setEmployee_name(String employee_name)
	{
		this.employee_name = employee_name;
	}
	
	@JsonIgnore
	public Department getDepartment()
	{
		return department;
	}
	@JsonIgnore
	public void setDepartment(Department department)
	{
		this.department = department;
	}
	@Override
	public String toString()
	{
		return this.employee_name;
	}
}
