package p1;

public class Practice1
{
	public static void main(String[] args)
	{
		String s = "ehvsreswfuyvu";

		for (int i1 = 0; i1 < s.length(); i1++)
		{

			for (int x1 = i1 + 1; x1 < s.length(); x1++)
			{
				char c1 = (Character) s.charAt(i1);
				char c2 = (Character) s.charAt(x1);
				Character c3 = c1;
				Character c4 = c2;

				if (c3.toString().equals(c4.toString()))
				{

					String a = c3.toString();
					System.out.println(a);

				} else
				{
					break;
					
				}

			}
		}
	}
}
