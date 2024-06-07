package searching;

import java.util.Scanner;



public class LinearSearch {

	public static void main(String[] args) {
	
		int n,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array=");
		n=sc.nextInt();
		 
		System.out.println("Enter the elemnts=");
		int [] arr=new int[n];
		
		for( i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
		
	System.out.println("Enter the value to find");
		int search=sc.nextInt();
		
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
		{
			System.out.println(arr[i]+" is present ");
		}
		else 
			{
			System.out.println(arr[i]+" is not present !!");
		}
		
		}

	}

}
