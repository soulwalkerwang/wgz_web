package p1;

public class Demo1practice
{
	public static void main(String[] args)
	{
		String s = "ehvsreswfuyvu";
		String duplicate = " ";

		for (int i1 = 0; i1 < s.length(); i1++)
		{
			Character c3 =' ';
			Character c4 =' ';
			int counter = 0;
			for (int x1 = 0; x1 < duplicate.length(); x1++)
			{
				
				char c1 = (Character) s.charAt(i1);
				char c2 = (Character) duplicate.charAt(x1);
				c3 = c1;
				c4 = c2;

				if (c3.toString().equals(c4.toString()))			
				{
					counter++;
				}
				
			}	
			if(counter == 0)
				duplicate += c3.toString();
		}
		
		System.out.println(duplicate);
	}
}
