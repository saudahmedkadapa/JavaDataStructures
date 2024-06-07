package com.demo.Service;

import java.util.Scanner;

public class BinaryService {

	public static void AcceptData(int[] arr) {
		System.out.println("Enter the Elemnets=");
		Scanner sc= new Scanner (System.in);
		 for( int i=0 ;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		
	}

	public static int  BinarySearch(int[] arr, int high, int low, int x) {
	
		int mid = 0;
		while(low<=high)
		{
			mid=(low+(high-low))/2;
			
			if(arr[mid]==x)
			{
				return mid;
			}
			if(arr[mid]<x)
			{
				low=mid+1;
				
			}
			if(arr[mid]>x) {
				high =mid-1;
				
			}
		}
		return -1;
	}

	public static void SearchByNumber(int[] arr, int high, int low, int x,int i) {
		System.out.println("ENter the number to search=");
		Scanner sc=new Scanner(System.in);
		int result=sc.nextInt();
		
		 result=BinarySearch( arr,  high,  low,  x);
		if(result==arr[i])
		{
			System.out.println("element is present ");
		
		}
		else 
		{
			System.out.println("Element is not present!!!");
		}
		
		
	}

		
}
		
	



