package com.demo.Test;

import java.util.Scanner;

import com.demo.Stack.StackArray;

public class StackArrayTest {

	public static void main(String[] args) {
		
		StackArray stack =new StackArray(5);
		
		stack.push(5);
		stack.push(6);
		stack.push(2);
		stack.push(3);
		stack.push(1);
		
		stack.pop(1);

		
		stack.display();
		
		

	}

}
