package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;


//Author: Frank Wang
//Date: 12/15/2014
//Email:frankwang1924@gmail.com
class GuessNumber
{
	public static void main(String[] args) throws Exception
    {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String readString = new String();
		 boolean flag = true;
		 while (!readString.equals("ready"))
		 {
		 	System.out.println("Enter ready to begin:");	
		 	readString = br.readLine();
		 	
		 }
		 System.out.println("Please enter the range of the numbder");
		 if (readString.equals("ready")){
			int min = 0;
			int max = 0;
			int temp = 0;
			while (flag)
			{
			 	System.out.println("The minimum number you wish is:");	
			 	readString = br.readLine();
			 	if(isNumeric(readString))
			 	{
			 		min = Integer.parseInt(readString);
			 		flag = false;
			 	}else
			 	{
			 		System.out.println("You input is invalid, please input again");
			 	}
			}
			flag = true;
			while (flag)
			{
			 	System.out.println("The maximum number you wish is:");	
			 	readString = br.readLine();
			 	if(isNumeric(readString))
			 	{
			 		max = Integer.parseInt(readString);
			 		if(max <= min)
			 		{
			 			System.out.println("You input is invalid, please input again");
			 			continue;
			 		}
			 		flag = false;
			 	}else
			 	{
			 		System.out.println("You input is invalid, please input again");
			 	}
			}
		 	temp = (min+max)/2;
		 	while (!readString.equals("end") && !readString.equals("yes") )
		 	{
		 		
		 		System.out.println("Is the number " + temp +"?");
		 		readString = br.readLine();
		 		if (readString.equals("lower")){
		 			max = temp;
		 			temp = min/2 + max/2;
		 		}else if (readString.equals("higher")){
		 			min = temp;
		 			temp = min/2 + max/2;
		 		}else if(!readString.equals("yes"))
		 		{
		 			System.out.println("You input is invalid, please input again");
		 		}
		 	}
		 	if (readString.equals("yes")){
		 		System.out.println("Bingo! The number in your mind is " + temp +"!");
		 	} else{
		 		System.out.println("Game Over! bye!");
		 	}
		 }
    }
	public static boolean isNumeric(String str)
	{
		for (int i = str.length();--i>=0;)
		{   
		   if (!Character.isDigit(str.charAt(i)))
		   {
		    return false;
		   }
		}
		  return true;
	}
}

