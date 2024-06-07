package com.demo.Queue;

public class QueueLinkedList {
	Node front =null;
	Node rear=null;
	public class Node
	{
		int data;
		Node next;
		Node(int val)
		{
			this.data=val;
			this.next=null;
		}
	}
	
	private boolean isEmpty()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty");
			return true ;
		}
		return false;
	}
	
	public void enqueue(int val)
	{
		Node newnode=new Node(val);
		if(isEmpty())
		{
			rear=newnode;
			front=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
		System.out.println("Added Successfully");
	}
	
	public int dequeue(int val)
	{
		if(!isEmpty())
		{
			int n=front.data;
			if(rear==null)
			{
				front=null;
				rear=null;
			}
			else
			{
				Node temp=front;
				front=front.next;
				temp.next=null;
				temp=null;
			}
			return n;
		}
		else
		{
			System.out.println("Queue is Emty");
			return -1;
		}
	}
	
	public void display()
	{
		for(Node temp=front;temp!=null;temp=temp.next)
		{
			System.out.println(temp.data);
			
		}
	}

}
