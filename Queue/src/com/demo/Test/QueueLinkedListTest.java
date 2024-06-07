package com.demo.Test;

import com.demo.Queue.QueueLinkedList;

public class QueueLinkedListTest {

	public static void main(String[] args) {
		QueueLinkedList que=new QueueLinkedList();
		que.enqueue(5);
		que.enqueue(6);
		que.enqueue(7);
		que.enqueue(8);
		que.display();
//		System.out.println("after deletion=");
//		que.dequeue(5);
		System.out.println("after deletion=");
		que.dequeue(7);
		que.display();
		
		

	}

}
