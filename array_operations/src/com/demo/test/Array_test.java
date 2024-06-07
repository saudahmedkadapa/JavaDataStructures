package com.demo.test;

import java.lang.reflect.Array;
import java.util.Scanner;

import com.demo.service.Array_service;

public class Array_test {

	public static void main(String[] args) {
		
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		int arr[] = new int[s];
		
		Array_service.acceptdata(s,arr);
		Array_service.displaydata(s,arr);
		int max = Array_service.maxelement(s,arr);
		System.out.println("max element: "+ max);
		max = Array_service.evenmax(s,arr);
		System.out.println("even max number is: "+ max);
		Array_service.sumofdigits(s,arr);
		
		int arr1[] = Array_service.duplicate(s,arr);
		Array_service.displaydata2(arr1);
		
	}

}
