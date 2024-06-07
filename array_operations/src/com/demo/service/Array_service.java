package com.demo.service;

import java.util.Scanner;

public class Array_service {

	public static void acceptdata(int s, int[] arr) {
		System.out.println("Enter the elements: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<s;i++)
		{
			arr[i] = sc.nextInt();
		}
	}

	public static void displaydata(int s, int[] arr) {
		System.out.println("array elements are: ");
		for(int i=0;i<s;i++)
		{
			System.out.println(i+" : "+arr[i]);
		}		
	}

	public static int maxelement(int s, int[] arr) {
		
		int max = arr[0];
		for(int i=0;i<s;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}

	public static int evenmax(int s, int[] arr) {
		
		int max=0;
		for(int i=0;i<s;i++)
		{
			if(arr[i]%2==0)
			{
				max=arr[i];
				break;
			}
		}
		for(int i=0;i<s;i++)
		{
			if(arr[i]%2==0 && arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void sumofdigits(int s, int[] arr) {
		for(int i=0;i<s;i++)
		{
			int newnum=0,temp=arr[i];
			while(temp!=0)
			{
				int rem = temp%10;
				newnum += rem;
				temp/=10;
			}
			System.out.println(arr[i]+" : "+newnum);
		}
		
	}

	public static int[] duplicate(int s, int[] arr) {
		int a[] = new int[s/2];
		int index=0;
		
		for(int i=0;i<s;i++)
		{
			for(int j=i;j<s-1;j++)
			{
				if(arr[j]==arr[j+1])
				{
					if(check(a,arr[j]))
					{
						a[index]=arr[j];
						index++;
					}
				}
			}
		}
		
		return a;
	}

	private static boolean check(int[] a, int num) {
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				return false;
			}
		}
		return true;
	}

	public static void displaydata2(int[] arr1) {
		System.out.println("\nduplicate elements are");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}
}
