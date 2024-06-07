package com.demo.Service;

import java.util.Scanner;

public class ArrayService {

	public static void AcceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{   
			System.out.println("Enter the number=");
			arr[i]=sc.nextInt();
		}
		
		
		
	}

	public static void DisplayData(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"->"+arr[i]);
		}
		
		
	}

	public static int findmax(int[] arr) {
		int max=arr[0];
		int pos=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				pos=i;
			}
			
		}
		return max;
		
		
	}

	public static int FindevenMaxnumber(int[] arr) {
		int i=0;
		int max=-1;
		for(;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				max=arr[i];
				break;
			}
			
		}
		for(int j=i+1;i<arr.length;i++)
		{
			if(arr[j]%2==0 && arr[j]>max)
			{
				max=arr[j];
			}
		}
		return 0;
	}
	private static int findsumofDigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			int d=num%10;
			sum=sum+d;
			num=(int)(num/10);
			
		}
		return sum;
	}

	public static void findDigitsSumAll(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int s= findsumofDigit(arr[i]);
			System.out.println(s);
			sum=sum+s;
			
		}
		System.out.println("Total sum="+sum);
		
		
	}

	public static void RotateArray(int[] arr) {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
			arr[i]=temp;
			
			
		}
		System.out.println(temp);
		
		
		
	}

}
