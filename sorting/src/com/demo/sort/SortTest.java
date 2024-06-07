package com.demo.sort;

import java.util.Scanner;

import com.demo.service.SortService;

public class SortTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		SortService.acceptdata(arr,size);
		SortService.displaydata(arr,size);
//		SortService.bubblesort(arr,size);
//		SortService.MergeSort(arr, 0, size-1);
//		System.out.println("merge sort");
//		SortService.displaydata(arr, size);
//		SortService.SelectionSort(arr,size);
//		SortService.insertionsort(arr,size);
//		SortService.MergeSort(arr,size);
		SortService.HeapSort(arr);
		SortService.displaydata(arr, size);

	}

}
