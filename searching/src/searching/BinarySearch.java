package searching;

import java.util.Scanner;

import com.demo.Service.BinaryService;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the size of array=");
		int n=sc.nextInt();
		int [] arr=new int[n];
		int low = 0, high = n, x = 0 ,i=0;
		BinaryService.AcceptData(arr);
		System.out.println("binary search: ");
		x= sc.nextInt();
		int ind = BinaryService.BinarySearch(arr,high,low,x);
		System.out.println("index is: "+ind);

		BinaryService.SearchByNumber(arr,high,low,x,i);
		
		

	}

}
