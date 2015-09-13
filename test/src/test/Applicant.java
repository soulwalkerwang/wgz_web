package test;

public class Applicant implements Comparable<Applicant>
{
	private String firstName;
	private String lastName;
	private Integer averageScore;
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public Integer getAverageScore()
	{
		return averageScore;
	}
	public void setAverageScore(Integer averageScore)
	{
		this.averageScore = averageScore;
	}
	
	@Override
	public int compareTo(Applicant o)
	{
		if(this.getAverageScore() == o.getAverageScore())
		{
			if(this.getLastName().equals(o.getLastName()))
			{
				return this.getFirstName().compareToIgnoreCase(o.getFirstName());
			}else
			{
				return this.getLastName().compareToIgnoreCase(o.getLastName());
			}
		}else
		{
			return this.getAverageScore() - o.getAverageScore();
		}
		
	}

}
