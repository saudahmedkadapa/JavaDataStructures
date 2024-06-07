package com.demo.Graph;

import java.util.Scanner;

public class AdjensencyList {
	Node[] head;
	public AdjensencyList(int num)
	{
		head=new Node[num];
	}
	class Node{
		int data;
		Node next;
		Node(int val)
		{
			this.data=val;
			this.next=null;
		}
		
	}
	
	public void addgraph()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<head.length;i++)
			for(int j=0;j<head.length;j++)
			{
				System.out.println("NOde="+i+ "-->"+j+":");
				int num=sc.nextInt();
				if(num==1)
				{
					Node newnode=new Node(j);
					if(head[i]==null) {
  					  head[i]=newnode;
  				  }else {
  					  newnode.next=head[i];
  					  head[i]=newnode;
				}
				}
			}
		
		
	}
	
	public void displaydata()
	{
		for(int i=0;i<head.length;i++)
		{
			System.out.println("Node ="+i+":");
			for(Node temp=head[i];temp!=null;temp=temp.next)
			{
				System.out.print(temp.data+"-->");
			}
			
		}
		System.out.print("null\n");
	}
	
	

}
