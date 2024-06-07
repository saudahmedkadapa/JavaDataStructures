package com.demo.linkedlist;

import com.demo.model.Employee;

public class EmployeeLinkedlist {
	public Node head =null;
	class Node{
		Employee data;
		Node next;
		Node(Employee val)
		{
			this.data=val;
			this.next=null;
		}
		
	}
	public void addEmployeebypos(Employee val,int pos)
	{
		if(head==null)
		{
			Node newnode=new Node(val);
			newnode.next=head;
			head=newnode;
		}
		else
		{
			Node newnode=new Node(val);
			if(pos==1)
			{
				newnode.next=head;
				head=newnode;
			}
			else
			{
				Node temp=head;
				for(int i=0;temp!=null && i<pos-2;i++)
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
	
	public void EmployeeDeltebyid(int id)
	{ 
		if(head==null)
		{
			System.out.println("List is Empty!!");
		}
		else
		{
			Node temp=head;
			Node prev=null;
			if(head.data.getEid()==id)
			{
				head=head.next;
				temp.next=null;
				temp=null;
			}
			else {
				while(temp!=null && temp.data.getEid()!=id)
				{
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null)
				{
					prev.next=temp.next;
					temp.next=null;
					temp=null;
				}
			}
			
		}
		
	}
	
	public void Displaybyname(String name)
	{
		if(head==null)
		{
			System.out.println("List is Empty!!");
		}
		else
		{
			for(Node temp=head;temp!=null;temp=temp.next)
				if(temp.data.getEname().equals(name))
				{
					System.out.println(temp.data);
				}
		}
		
		
	}
	
	
	public void Displayall()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			for(Node temp=head;temp!=null;temp=temp.next)
			{
				System.out.println(temp.data);
			}
		}
		
	}
	

}
