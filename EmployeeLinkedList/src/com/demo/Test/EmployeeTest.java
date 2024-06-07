package com.demo.Test;

import java.util.Scanner;

import com.demo.service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeService();
		int choice;
		do {
			System.out.println("1. add new employee by position\n2. display All");
			System.out.print("3.Search by name \n4 delete by id");
			System.out.print("\n5. exit\n choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				eservice.addnewEmp();
				break;
			case 2:
				eservice.display();
				break;
			case 3:
				System.out.println("Enter the name =");
				String name=sc.next();
				eservice.SearchByName(name);
				break;
				
			case 4:
				System.out.println("Enter the id=");
				int id=sc.nextInt();
				eservice.deletebyid(id);
				break;
			case 5:
				System.out.println("Thank you !! exit ");
				break;
			}
			
		}while(choice!=0);
		
		

	}

}
