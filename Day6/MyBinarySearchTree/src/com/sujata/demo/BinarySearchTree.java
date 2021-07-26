package com.sujata.demo;

public class BinarySearchTree {
	
	class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data=data;
			left=right=null;
		}
	}
	
	Node root;
	
	private Node insertValue(Node root,int key) {
		Node node=new Node(key);
		if(root==null) {
			root=node;
			return root;
		}
		else if(key<root.data)
			root.left=insertValue(root.left,key);
		else if(key>root.data)
			root.right=insertValue(root.right, key);
		
		return root;
	}
	
	public void insert(int key) {
		root=insertValue(root, key);
	}
	
	private void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}
	
	public void inorder() {
		inorderRec(root);
		
	}

}
