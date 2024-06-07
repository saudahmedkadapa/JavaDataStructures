package com.demo.service;

import java.util.Scanner;

import com.demo.linkedlist.EmployeeLinkedlist;
import com.demo.model.Employee;

public class EmployeeService {
	private EmployeeLinkedlist lst;
	
	public EmployeeService()
	{
		lst=new EmployeeLinkedlist();
	}

	public void addnewEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id =");
		int id=sc.nextInt();
		System.out.println("Enter the name of Employee=");
		String name=sc.next();
		System.out.println("Enter the Salary=");
		double sal=sc.nextDouble();
		System.out.println("Enter the position=");
		int pos=sc.nextInt();
		lst.addEmployeebypos(new Employee(id,name,sal),pos);		
		
	}

	public void display() {
		lst.Displayall();
	}

	public void deletebyid(int id) {
		lst.EmployeeDeltebyid(id);
	}

	public void SearchByName(String name) {
		lst.Displaybyname(name);
		
	}

	
	
}
