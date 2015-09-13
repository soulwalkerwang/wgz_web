package com.guanzhong.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student
{
	@Id
	@Column(name="ssn")
	private Integer ssn;
	
	@Column(name="student_name")
	private String studentName;
	
	@OneToMany(
			 fetch=FetchType.EAGER)
	@JoinColumn(name="student_ssn")
	private Set<Application> set = new HashSet<Application>();

	public Integer getSsn()
	{
		return ssn;
	}

	public void setSsn(Integer ssn)
	{
		this.ssn = ssn;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}

	public Set<Application> getSet()
	{
		return set;
	}

	public void setSet(Set<Application> set)
	{
		this.set = set;
	}
	
	
	
	
	
	

}
