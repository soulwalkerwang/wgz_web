package com.guanzhong.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="reviewer")
public class Reviewer
{
	@Id
	@Column(name="ssn")
	private Integer ssn;
	
	@Column(name="reviewer_name")
	private String reviewerName;
	
	@ManyToMany(
			cascade={CascadeType.ALL}, fetch=FetchType.EAGER )
	@JoinTable(name="join_employee_project",
	           joinColumns={@JoinColumn(name="student_ssn")},
	           inverseJoinColumns={@JoinColumn(name="aplication_id")}
	           )
	private Set<Application> applications = new HashSet<Application>();

	public Integer getSsn()
	{
		return ssn;
	}

	public void setSsn(Integer ssn)
	{
		this.ssn = ssn;
	}

	public String getReviewerName()
	{
		return reviewerName;
	}

	public void setReviewerName(String reviewerName)
	{
		this.reviewerName = reviewerName;
	}

	public Set<Application> getApplications()
	{
		return applications;
	}

	public void setApplications(Set<Application> applications)
	{
		this.applications = applications;
	}

	
	
	

	
	
	

}
