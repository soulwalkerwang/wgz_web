package p1;

public class Number
{
	private Integer integer;
	private Character numberChar;
	
	public void setInteger()
	{
		this.integer=integer;
	}
	
	public Integer getInteger()
	{
		return integer;
	}
	
	public void setNumberchar()
	{
		this.numberChar=numberChar;
	}
	
	public Character getNumberchar()
	{
		return numberChar;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((integer == null) ? 0 :integer.hashCode());
		result = prime * result
				+ ((numberChar == null) ? 0 : numberChar.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		
		
		if (obj == null)
			return false;
		
		
		if (getClass() != obj.getClass())
			return false;
		Number other = (Number) obj;
		if (numberChar == null)
		{
			if (other.numberChar != null)
				return false;
		} else if (!numberChar.equals(other.numberChar))
			return false;
		if (integer == null)
		{
			if (other.integer != null)
				return false;
		} else if (!integer.equals(other.integer))
			return false;
		return true;
	}
	
	
	
	
	
	
}
