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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="application")
public class Application
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="application_name")
	private String applicationName;
	
	@ManyToOne(
			cascade={CascadeType.ALL},  fetch=FetchType.EAGER)
	@JoinColumn(name="student_ssn")
	private Student student;
	
	@ManyToMany(
			  fetch=FetchType.EAGER,
			mappedBy="applications")
	private Set<Reviewer> reviewers = new HashSet<Reviewer>();

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getApplicationName()
	{
		return applicationName;
	}

	public void setApplicationName(String applicationName)
	{
		this.applicationName = applicationName;
	}

	public Student getStudent()
	{
		return student;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	public Set<Reviewer> getReviewers()
	{
		return reviewers;
	}

	public void setReviewers(Set<Reviewer> reviewers)
	{
		this.reviewers = reviewers;
	}

	
	
	

}
