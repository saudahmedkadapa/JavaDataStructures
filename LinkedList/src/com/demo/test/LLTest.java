package com.demo.test;

import com.demo.service.LinkedList;

public class LLTest {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(2);
		ll.add(4);
		ll.add(6);
		ll.addfirst(1);
//		ll.display();
//		ll.count();
//		ll.deletelast();
//		ll.display();
//		ll.count();
//		ll.deletefirst();
//		ll.display();
//		ll.count();
		ll.addatpos(2,10);
//		ll.add(9);
		ll.display();

	}

}
