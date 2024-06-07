package com.demo.service;

public class CircularLinkedList {
	Node head=null;
	Node last=null;
	public class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
			
		}
	}
	
	public void addNodebyposition(int val,int pos)
	{
		Node newnode=new Node(val);
		if(head==null)
		{
			System.out.println("List is Empty!");
			head=newnode;
			last=newnode;
			newnode.next=head;
		}
		else
		{
			if(pos==1)
			{
				System.out.println("pos 1");
				head=newnode;
				last=newnode;
				newnode.next=head;				
			}
			else
			{
				Node temp=head;
				for(int i=0;temp!=last && i<pos-2 ;i++ )
				{
					temp=temp.next;
					System.out.println("in for");
				}
				newnode.next=temp.next;
				temp.next=newnode;
				if(temp==last)
				{
					last=newnode;
					
				}
			}
		}
	}
	
	public void displaydata()
	{
		Node temp=head;
		for( ;temp!=last;temp=temp.next)
		{
			System.out.print(temp.data+",");
		}
		System.out.println(temp.data+",");
		System.out.println();
	}

}
