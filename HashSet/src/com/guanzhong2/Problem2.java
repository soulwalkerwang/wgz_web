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
	        int [][] mins=new int [n][2];//���ڱ��漯��U��V-U֮�����С�ߺ�����ֵ��mins[i][0]ֵ��ʾ���ýڵ�i�ߵ���ʼ�ڵ�  
	                                     //ֵΪ-1��ʾû�е�������ʼ�㣬mins[i][1]ֵ��ʾ���ñߵ���Сֵ��  
	                                     //mins[i][1]=0��ʾ�ýڵ��ѽ��ڼ���U��  
	        for(int i=0;i<n;i++){//init mins  
	          
	            if(i==start){  
	                mins[i][0]=-1;  
	                mins[i][1]=0;  
	            }else if( graph[start][i]!=-1){//have edge of ��start��i�� 
	                mins[i][0]=start;  
	                mins[i][1]= graph[start][i];  
	            }else{  
	                mins[i][0]=-1;  
	                mins[i][1]=Integer.MAX_VALUE;  
	            }  

	        }  
	        for(int i=0;i<n-1;i++){  
	            int minV=-1,minW=Integer.MAX_VALUE;  
	            for(int j=0;j<n;j++){//find min value in mins��
	                  
	                if(mins[j][1]!=0&&minW>mins[j][1]){  
	                    minW=mins[j][1];  
	                    minV=j;  
	                }  
	            }  

	            mins[minV][1]=0;  
	            System.out.println("��С�������ĵ�"+( i + 1)+"����С��=<"+(mins[minV][0]+1)+","+(minV+1)+">��Ȩ��="+minW);  
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