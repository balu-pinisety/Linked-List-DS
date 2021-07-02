package com.LinkedList;

/**
 * @author BALU
 * Main function for calling of Linked List Class
 * To pass data to Linked list to do different operations
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Program for the Simple Linked List");
		
		LinkedList linkedList = new LinkedList(); //Object
		//Inserting Elements
		linkedList.insert(56);
		linkedList.insert(30);
		linkedList.insert(70);
		linkedList.print();
		linkedList.searchNode(30);
	}

}