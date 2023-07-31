package _31_07_23_;

import java.util.Scanner;

public class ArrayInsertion_sum {

	public static void main(String[] args) 
	{
		 	Scanner obj = new Scanner(System.in);
	        System.out.println("Enter the size of Array ");
	        long size = obj.nextLong();
	        long arr[] = new long[(int) size];
	        long sum=0;
	        System.out.println("Enter the Elements of array");
	        for(int i=0;i<size;i++)
	        {
	            arr[i]=obj.nextLong();
	            sum=sum+arr[i];
	        }

	        System.out.println(sum);
	}

}
