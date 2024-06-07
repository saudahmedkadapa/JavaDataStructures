package com.demo.Test;

import com.demo.Stack.StackLinkedList;

public class StacklinkedListTest {

	public static void main(String[] args) {
		StackLinkedList<Integer> stack=new StackLinkedList<>();
		stack.push(5);
		stack.push(6);
		stack.push(9);
		stack.push(10);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.display();
		
		
		
		

	}

}
