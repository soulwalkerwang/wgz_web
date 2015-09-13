package test;

public class AnagramImpl implements AnagramFinder
{

	@Override
	public boolean areAnagrams(String s1, String s2)
	{
		if(s1 == null || s2 == null)
		{
			return false;
		}
		
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceAll(" ", "");
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length() != s1.length())
		{ 
			return false; 
		} 
		char[] s1CharArray = s1.toCharArray(); 
		for(char c : s1CharArray)
		{ 
			int index = s2.indexOf(c); 
			if(index != -1)
			{ 
				s2 = s2.substring(0,index) + s2.substring(index +1, s2.length()); 	    
			}else
			{ 
				return false; 
			} 
		} 
		return s2.isEmpty();

		
	}

}
