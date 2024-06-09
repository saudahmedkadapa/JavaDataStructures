package com.demo.Test;

import java.util.Scanner;

import com.demo.Service.EmployeeService;
import com.demo.Service.EmployeeServiceImpl;

public class TestLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice ;
		do {
			System.out.println("1.Add new Employee \n 2. Display all \n 3. Display by name");
			choice =sc.nextInt();
			
			switch(choice)
			{
			case 1:
				eservice.addNewEmplyee();
				break;
			case 2:
				eservice.displayall();
				break;
			case 3:
				eservice.displaybyName();
				break;
			}
		}while(choice !=0);

	}

}
