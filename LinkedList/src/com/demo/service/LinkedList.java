package com.demo.service;

public class LinkedList {
	
	public class Node
	{
		int data;
		Node next;
		
		public Node()
		{
			data = 0;
			next = null;
		}
		public Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public Node head;
	static int count=0;
	
	public void add(int d) {
		Node n = new Node(d);
		if(head==null)
		{
			head=n;
			count++;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next=n;
			count++;
		}
	}

	public void display() {
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}

	public void addfirst(int d) {
		Node newnode = new Node(d);
		newnode.next = head;
		head = newnode;
		count++;
	}

	public void deletelast() {
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp = temp.next;
			}
			temp.next = null;
			count--;
		}
	}

	public void deletefirst() {
		head = head.next;
		count--;
	}

	public void count() {
		System.out.println("count->"+count);
	}

	public void addatpos(int pos,int d) {
		
		Node newnode = new Node(d);
		int ind=1;
		if(ind==pos)
		{
			newnode.next=head;
			head = newnode;
			count++;
		}
		else
		{
			Node temp = head;
			while(ind!=pos-1)
			{
				ind++;
				
				temp = temp.next;
			}
			newnode.next=temp.next;
			temp.next = newnode;
		}
				
	}

}
