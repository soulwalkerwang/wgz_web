package com.guanzhong2;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;


public class RandomTest {

	public static void main(String[] args) {
    
		Map map = new TreeMap();
		
             Random random = new Random();
      
   
   for(int i=0; i<50;i++)
      {
	     int number =random.nextInt(41)+10;
	     
	     Integer in = new Integer(number);
	     
	     if (map.get(in)== null)
	     {
	    	 map.put(in, new Integer(1));
	    	 
	     }
	     else
	     {
	    	 int value = ((Integer)map.get(in)).intValue();
	    	 map.put(in, new Integer(value + 1));
	     }
	   
      }
        
   Set set = map.entrySet();
   
   for(Iterator iter = set.iterator(); iter.hasNext();)
   {
	   Map.Entry entry = (Map.Entry)iter.next();
	   
	   Integer key = (Integer)entry.getKey();
	   Integer value = (Integer)entry.getValue();
	   
	   System.out.println(key + " : "+ value);
   }
	   
   
          
   }
}
