package com.demo.Test;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree()
	{
		root=null;
	}
	public class Node{
		int data;
		Node right,left;
		Node(int val)
		{
			data=val;
			right=null;
			left=null;
		}
		
	}
	
	public void insertkey(int val) {
		root=insertData(root,val);
	}

	private Node insertData(Node root, int val) {
		Node newNode=new Node(val);
		if(root==null) {
			root=newNode;
			return root;
		}else {
			if(val<root.data) {
				root.left=insertData(root.left,val);
			}else {
				root.right=insertData(root.right,val);
			}
			return root;
		}
	}
	
	public void inorder() {
		inorderTraversal(root);
	}

	private void inorderTraversal(Node root) {
		if(root!=null) {
		   inorderTraversal(root.left);
		   System.out.println(root.data);
		   inorderTraversal(root.right);
		}
		
	}
	public void preorder() {
		preorderTraversal(root);
	}

	private void preorderTraversal(Node root) {
		if(root!=null) {
		   System.out.println(root.data);
		   preorderTraversal(root.left);
		   preorderTraversal(root.right);
		}
		
	}
	
	public void postorder() {
		postorderTraversal(root);
	}

	private void postorderTraversal(Node root) {
		if(root!=null) {
		   postorderTraversal(root.left);
		   postorderTraversal(root.right);
		   System.out.println(root.data);
		}
		
	}
	
	

}
