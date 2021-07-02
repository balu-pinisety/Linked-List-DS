package com.LinkedList;

/**
 * @author BALU
 * To create Simple Linked List
 * To perform different operation on insertion elements
 */
public class LinkedList {

	Node head; //Initializing Head Node
	
	/**
	 * Creating inner class for Node
	 */
	class Node {
		int data; //Value variable
		
		
		/**
		 * Constructor for data
		 * @param data
		 */
		public Node(int data) {
			this.data = data;
		}
	}
	
	/**
	 * Method to insert data into linked list
	 * @param data
	 */
	public void insert(int data) {
		Node newNode = new Node(data);
		head = newNode; //storing data in head
		System.out.print(head.data+" -> ");//printing elements
	}
	
}