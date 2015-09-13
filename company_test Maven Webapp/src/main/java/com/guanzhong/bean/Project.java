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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project
{
	@Id
	@Column(name="project_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="project_name")
	private String project_name;
	
	@ManyToMany(targetEntity=com.guanzhong.bean.Employee.class, 
			  fetch=FetchType.EAGER,
			mappedBy="project")
	private Set<Employee> employee = new HashSet<Employee>();
	
	
	
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getProject_name()
	{
		return project_name;
	}
	public void setProject_name(String project_name)
	{
		this.project_name = project_name;
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
