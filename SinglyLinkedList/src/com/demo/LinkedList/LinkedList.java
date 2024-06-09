package com.demo.LinkedList;

import com.demo.model.Employee;

public class LinkedList {
	public Node head=null;
	public class Node
	{
		Employee data;
		Node next;
		public Node(Employee ob)
		{
			this.data=ob;
			this.next=null;
		}
	}
	
	public void addNewEmployee(Employee ob,int pos)
	{
		if(head==null)
		{
			Node newnode=new Node(ob);
			System.out.println("list is empty!!");
			head=newnode;
		}
		else
		{
			Node newnode=new Node(ob);
			if(pos==1)
			{
				newnode.next=head;
				head=newnode;
			}
			else
			{
				Node temp=head;
				for(int i=0;temp!=null && i<pos-2 ;i++)
				{
					temp=temp.next;
				}
				if(temp!=null)
				{
					newnode.next=temp.next;
					temp.next=newnode;
				}
				
			}
		}
	}
	public void displayAll()
	{
		if(head==null)
		{
			System.out.println("list is Empty!!");
		}
		for(Node temp=head;temp!=null;temp=temp.next)
		{
			System.out.println(temp.data);
		}
	}
	public void searchbyName(String name) {
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			for(Node temp =head;temp!=null;temp=temp.next)
			{
				if(temp.data.getEname().equals(name))
				{
					System.out.println(temp.data);
				}
			}
		}
		
		
	}
	

}
