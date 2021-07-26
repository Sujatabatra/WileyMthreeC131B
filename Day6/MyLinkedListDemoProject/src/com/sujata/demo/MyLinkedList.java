package com.sujata.demo;

public class MyLinkedList {

	class Node{
		int data;
		Node next;
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
	}
	
	Node head;
	
	public void insert(int data) {
		Node newNode=new Node(data,null);
		//if list is not there, make this node as first node ( by pointing head on newly created node)
		if(this.head==null) {
			this.head=newNode;
		}
		else {
			Node lastNode=this.head;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=newNode;
		}
	
	}
	
	public void traverse() {
		Node currentNode=this.head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
}
