package com.sujata.demo;

import java.util.Scanner;

public class MainBinarySearchTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		while(true) {
			System.out.println("1. Add Element");
			System.out.println("2. Inorder Traversal");
			System.out.println("3. Delete Element");
			System.out.println("4. Exit");
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Element : ");
				int element=sc.nextInt();
				binarySearchTree.insert(element);
				break;
			case 2:
				binarySearchTree.inorder();
				break;
			case 3:
				System.out.println("Enter element you want to delete : ");
				int ele=sc.nextInt();
				binarySearchTree.delete(ele);
				break;
			case 4:
				System.out.println("Thanks for creating Binary Search Tree");
				System.exit(0);
			}
		}

	}

}
