package com.demo.Tree;

import com.demo.Test.BinarySearchTree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insertkey(45);
		tree.insertkey(5);
		tree.insertkey(3);
		tree.insertkey(8);
		tree.insertkey(9);
		tree.insertkey(10);
		tree.insertkey(6);
		System.out.println("-----------/n INorder=");
		tree.inorder();
		System.out.println("-----------\n post order=");
		tree.postorder();
		System.out.println("-----------\n preOrder= ");
		tree.preorder();

	}

}
