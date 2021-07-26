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
	
	public void delete(int key) {
		root=deleteValue(root,key);
	}
	
	private Node deleteValue(Node root,int key) {
		//if tree is empty
		if(root==null)
			return root;
		
		if(key<root.data)
			root.left=deleteValue(root.left, key);
		else if(key>root.data)
			root.right=deleteValue(root.right, key);
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			root.data=minValue(root.right);
			
			root.right=deleteValue(root.right, root.data);
		}
		return root;
	}
	
	private int minValue(Node root) {
		int minVal=root.data;
		while(root.left!=null) {
			minVal=root.left.data;
			root=root.left;
		}
		return minVal;
	}

}
