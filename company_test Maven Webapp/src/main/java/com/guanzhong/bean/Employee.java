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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	private String employee_name;
	
	@ManyToOne(targetEntity=com.guanzhong.bean.Department.class,
			cascade={CascadeType.ALL},  fetch=FetchType.EAGER)
	@JoinColumn(name="department_id")
	private Department department;
	
	
	@ManyToMany(targetEntity=com.guanzhong.bean.Project.class,
			cascade={CascadeType.ALL}, fetch=FetchType.EAGER )
	@JoinTable(name="join_employee_project",
	           joinColumns={@JoinColumn(name="employee_id")},
	           inverseJoinColumns={@JoinColumn(name="project_id")}
	           )
	private Set<Project> project = new HashSet<Project>();
	
	
	
	
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
	public Set<Project> getProject()
	{
		return project;
	}
	public void setProject(Set<Project> project)
	{
		this.project = project;
	}
	public Department getDepartment()
	{
		return department;
	}
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
