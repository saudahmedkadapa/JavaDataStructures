package com.demo.service;

import java.util.Scanner;

public class SortService {

	public static void acceptdata(int[] arr, int size) {
		
		System.out.println("Enter elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
	}

	public static void displaydata(int[] arr, int size) {
		System.out.println("elements are");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

	public static void bubblesort(int[] arr, int size) {
		for(int i=0; i<size; i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nbubble sort");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

	public static void SelectionSort(int[] arr, int size) {
		System.out.println("-----------------Selection Sort-----------");
		for(int i=0;i<size ;i++)
		{
			int min=findminimum(arr,size,i);
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	private static int findminimum(int []arr,int size,int start) {
		int min=arr[start];
		int mindx=start;
		for(int i=start;i<size;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				mindx=i;
				
			}
			
		}
		return mindx;
		
		
	}

	public static void insertionsort(int[] arr, int size) {
		System.out.println("\ninsertion sort");
		for(int i=1;i<size;i++)
		{
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}		
	}

	public static void MergeSort(int[] arr, int start, int end) {
		int mid = start+(end-start)/2;
		if(start>=end)
		{
			return;
		}
		MergeSort(arr,start,mid);
		MergeSort(arr, mid+1, end);
		conquer(arr, start, mid, end);
		
	}
	public static void conquer(int arr[], int start, int mid, int end)
	{
		int merge[] = new int[end-start+1];
		int idx1=start, idx2=mid+1, x=0;
		
		while(idx1<=mid && idx2<=end)
		{
			if(arr[idx1] <= arr[idx2])
			{
				merge[x] = arr[idx1];
				x++; idx1++;
			}else
			{
				merge[x] = arr[idx2];
				x++; idx2++;
			}
		}
		while(idx1<=mid)
		{
			merge[x] = arr[idx1];
			x++; idx1++;
		}
		while(idx2<=end)
		{
			merge[x] = arr[idx2];
			x++; idx2++;
		}
		
		for(int i=0,j=start;i<merge.length;i++,j++)
		{
			arr[j] = merge[i];
		}
		
	}

	public static void HeapSort(int[] arr) {
		int n=arr.length-1;
		for(int i=n/2-1;i>0;i++)
		{
			heapify(arr,n,i);
		}
		for(int i=n-1;i>0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr,i,0);
		}
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest=i;
		int right=2*i+1;
		int left=2*i+1;
		
		if(left<n && arr[left]>arr[largest])
			largest=left;
		if(right<n && arr[right]>arr[largest])
		{
			largest=right;
			
		}
		if(largest!=i)
		{
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
			
		}
		
		
	}


}
