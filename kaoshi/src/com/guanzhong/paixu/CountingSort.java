package com.guanzhong.paixu;

public class CountingSort
{
	public static void main(String[] args) {  

		
		int[] input = {3,3,5,2,0};
		int k = 7;
        System.out.print("输入数组");  
        for (int i = 0; i < input.length; i++) {  
            System.out.print(input[i] + " ");  
        }  
        int[] output = new int[input.length];  
        countsort(input, output, k);  
        System.out.print("输出数组");  
        for (int i = 0; i < output.length; i++) {  
            System.out.print(output[i] + " ");  
        }  
  
    }  
  
    public static void countsort(int[] input, int[] output, int k) {  
        
        int[] c = new int[k]; 
        int len = c.length;  
       
        for (int i = 0; i < len; i++) {  
            c[i] = 0;  
        }  
       
        for (int i = 0; i < input.length; i++) {  
            c[input[i]]++;  
        }  
       
        for (int i = 1; i < len; i++) {  
            c[i] = c[i] + c[i - 1];  
        }  
      
        for (int i = input.length - 1; i >= 0; i--) {
            output[c[input[i]] - 1] = input[i];  
            c[input[i]]--;
        }  
    }  

}
