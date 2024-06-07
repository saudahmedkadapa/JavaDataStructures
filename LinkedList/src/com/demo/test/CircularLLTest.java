package com.demo.test;

import com.demo.service.CircularLinkedList;

public class CircularLLTest {

	public static void main(String[] args) {
		CircularLinkedList list=new CircularLinkedList();
		list.addNodebyposition(8, 1);
		list.addNodebyposition(17, 5);
		list.addNodebyposition(20, 2);
		list.addNodebyposition(18, 4);
		list.displaydata();
		

	}

}
