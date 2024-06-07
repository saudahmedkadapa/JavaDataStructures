
package com.demo.Test;

import com.demo.Service.ArrayService;

public class ArrayTest {

	public static void main(String[] args) {
		int []arr =new int [5];
		ArrayService.AcceptData(arr);
		ArrayService.DisplayData(arr);
		int num=ArrayService.findmax(arr);
		System.out.println("Maximum num="+num);
		num=ArrayService.FindevenMaxnumber(arr);
		if(num!=-1)
		{
			System.out.println("maximum even number="+num);
		}
		else
		{
			System.out.println("No Even number is present!!");
		}
		ArrayService.findDigitsSumAll(arr);
		System.out.println("Rotate Array=");
		
		ArrayService.RotateArray(arr);
		
		
		

	}

}
