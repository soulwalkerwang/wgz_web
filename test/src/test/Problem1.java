package test;
import java.util.HashMap;
import java.util.Scanner;
	

	
	public class Problem1 {  
	  
	    public char checkString(String s) {  
	        
	    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();  
	        
	    	
	        int max = 0;  
	        //initialize result with null
	    	char result = '\u0000'; 
	    	
	    	if(s == null)
	    	{
	    		return '\u0000';
	    	}
	    	
	        for (int i = 0; i < s.length(); i++) 
	        {  
	            char temp = s.charAt(i);  
	            if (!map.containsKey(temp)) 
	            {  
	                map.put(temp, 1);  
	            } 
	            else 
	            {  
	                int Times = map.get(temp) + 1;  
	                if(Times > s.length()/2)
	                {  
	                    return temp;  
	                }  
	                map.put(temp, Times);  
	                if (Times > max) 
	                {  
	                    result = temp;  
	                    max = Times;  
	                }  
	            }  
	        }  
	        if (max > s.length() / 2)  
	            return result;  
	        else  
	            return '\u0000';  
	    }  
	
	    public static void main(String[] args) 
	    {  
	        Problem1 problem1 = new Problem1();        
	        String s = new String();        
	        Scanner input = new Scanner(System.in);  
	   
	        System.out.println("Input quit can exit");
	        
	        while (true) 
	        {  
	        	
	            System.out.print("Input:");  
	            s = input.nextLine();  
	            if(s.equals("quit"))
	            {  
	            	System.out.println("exit success"); 
	            	break;  
	            }  
	            char result = problem1.checkString(s); 
	            System.out.print("Output:");  
	            if (result == '\u0000')  
	                System.out.println("null");  
	            else  
	                System.out.println(result);  
	        }  
	          
	         
	        input.close();
	    }  
	      
	  
	}  
