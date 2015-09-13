package com.guanzhong2;

import java.util.ArrayList;
import java.util.Random;



public class Problem2
{
	public static void main(String[] args)
	{
		
		
		ArrayList<Point> arrayList = new ArrayList<Point>();
		
		
		 for(int i = 0; i<20; i++)
		    {
		    	arrayList.add(new Point());
		    }
		 
		int[][] a = new int[arrayList.size()][arrayList.size()];
		
		
		
		for(int i = 0 ; i < arrayList.size(); i++)
		{
			for(int j = 0; j < arrayList.size(); j++)
			{
				a[i][j] = calculateDistance(arrayList.get(i), arrayList.get(j));
				
			}
			
		}
		 
		PRIM(a, 0, arrayList.size());
		
		
		
	}


	
	 public static int calculateDistance(Point base1, Point current)
		{
			int distance = (int)Math.sqrt((base1.getX() - current.getX())*(base1.getX() - current.getX())
					+(base1.getY() - current.getY())*(base1.getY() - current.getY()));
			
			
			if(distance == 0)
			{
				return -1;
			}
			
			
			return distance;
			
			
			
		}
	 
	 
	 public static void PRIM(int [][] graph,int start,int n){  
	        int [][] mins=new int [n][2];//用于保存集合U到V-U之间的最小边和它的值，mins[i][0]值表示到该节点i边的起始节点  
	                                     //值为-1表示没有到它的起始点，mins[i][1]值表示到该边的最小值，  
	                                     //mins[i][1]=0表示该节点已将在集合U中  
	        for(int i=0;i<n;i++){//init mins  
	          
	            if(i==start){  
	                mins[i][0]=-1;  
	                mins[i][1]=0;  
	            }else if( graph[start][i]!=-1){//have edge of （start，i） 
	                mins[i][0]=start;  
	                mins[i][1]= graph[start][i];  
	            }else{  
	                mins[i][0]=-1;  
	                mins[i][1]=Integer.MAX_VALUE;  
	            }  

	        }  
	        for(int i=0;i<n-1;i++){  
	            int minV=-1,minW=Integer.MAX_VALUE;  
	            for(int j=0;j<n;j++){//find min value in mins，
	                  
	                if(mins[j][1]!=0&&minW>mins[j][1]){  
	                    minW=mins[j][1];  
	                    minV=j;  
	                }  
	            }  

	            mins[minV][1]=0;  
	            System.out.println("最小生成树的第"+( i + 1)+"条最小边=<"+(mins[minV][0]+1)+","+(minV+1)+">，权重="+minW);  
	            for(int j=0;j<n;j++){
	                if(mins[j][1]!=0){  
	              
	                    if( graph[minV][j]!=-1&& graph[minV][j]<mins[j][1]){  
	                        mins[j][0]=minV;  
	                        mins[j][1]= graph[minV][j];  
	                    }  
	                }  
	            }  
	        }  
	    }  
}



class Point
{
	private int x;
	private int y;
	
	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}



	Point()
	{
		this.x = new Random().nextInt(50);
		this.y = new Random().nextInt(50);
		
	}
	
	
	
}