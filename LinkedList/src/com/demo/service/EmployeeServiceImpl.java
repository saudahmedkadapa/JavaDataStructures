package com.demo.Service;

import java.util.Scanner;

import com.demo.LinkedList.LinkedList;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	Scanner sc=new Scanner(System.in);
	private LinkedList list;
	
	public EmployeeServiceImpl()
	{
		list=new LinkedList();
	}
	@Override
	public void addNewEmplyee() {
		
		System.out.println("Enter the id =");
		int id=sc.nextInt();
		System.out.println("Enter the name=");
		String name=sc.next();
		System.out.println("Enter the Salary=");
		double sal=sc.nextDouble();
		System.out.println("Enter the pos=");
		int pos=sc.nextInt();
		list.addNewEmployee(new Employee(id,name,sal),pos);
	}
	@Override
	public void displayall() {
		list.displayAll();
		
	}
	@Override
	public void displaybyName() {
		System.out.println("Enter the name to search=");
		String name =sc.next();
		list.searchbyName(name);
		
		
	}

}
