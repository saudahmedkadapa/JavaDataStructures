package com.demo.Stack;

public class StackLinkedList<T> {
	Node top=null;
	class Node{
		T data;
		Node next;
		Node(T val)
		{
			this.data=val;
			this.next=null;
		}
	}
	
	public void push(T val)
	{
		Node newnode=new Node(val);
		if(top==null)
		{
			top=newnode;
			System.out.println("Pushed");
		}
		else
		{
			newnode.next=top;
			top=newnode;
			System.out.println("pushed");
		}
	}
	
	public T pop()
	{
		if(!isEmpty())
		{
		    T n=top.data;
			Node temp=top;
			top=top.next;
			temp=null;
			return n;
		}
		else
		{
			System.out.println("Stack is empty!!");
			return null;
		}
	}
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void display()
	{
		for(Node temp=top;temp!=null;temp=temp.next)
		{
			System.out.println(temp.data);
		}
		System.out.println();
	}
	
	
	
	

}
