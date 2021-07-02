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
		Node next;//Node for next
		
		/**
		 * Constructor for data
		 * @param data
		 */
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	/**
	 * Method to insert data into linked list
	 * To check if head is null then add data to it
	 * If not then checks for other nodes for null to add data
	 * @param data
	 */
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head==null) {
			head = newNode; //storing data in head
		} else {
			Node temp = head; //Initializing temp
			while (temp.next!=null) {
				temp=temp.next; //Traversing temp to next
			}
			temp.next = newNode;
		}
	}
	
	/**
	 * Method to insert data between two elements
	 * To  insert, it checks for list have min. of two elements or not
	 * Inserts element b/n two given elements only if they found in consequent position
	 * @param prevData, insertData, nextData
	 */
	public void inMiddle(int prevData, int insertData, int nextData) {
		int bool=0;
		//Creating Objectives for the data
		Node prevNode = new Node(prevData);
		Node insertNode = new Node(insertData);
		Node nextNode = new Node(nextData);
		if (head==null || head.next==null) { //checks for min. of 2 elements
			System.out.println("List have min. of two elements to insert the elemnt in middle");
		} else {
			Node temp = head; //Initializing temp
			while (temp.next!=null) {
				if(temp.data==prevNode.data&&temp.next.data==nextNode.data) { //checks for prev data and next data
					Node flag = temp.next;
					temp.next = insertNode;
					insertNode.next=flag;
					bool=1;
					break;
				} else {
					temp=temp.next; //Traversing temp to next
				}
			}
			if (bool==1) System.out.println("After inserting element "+insertData+" b/n elements "+prevData+" and "+nextData);
			else System.out.println("Elements "+prevData+" and "+nextData+" are not found in list consequentially");
		}
	}
	
	/**
	 * Method to delete element of given position in the sequence
	 * @param position
	 */
	public void pop(int position) {
		int bool=0;
		if (position == 1) {
			head = head.next; //Traversing head to next	
		} else {
			Node temp=head;
			for(int i=0; i<position;i++) {
				if (temp.next!=null) {
					temp = temp.next; //Traversing temp to next			
				} else {
					System.out.println("Given position '"+position+"' is Out of Bound");
					bool=1;
					break;
				}
			}
			if(bool==0) {
				Node flag = temp.next;
				temp.next=flag.next;
			}
		}
		if(bool==0) System.out.println("After removing element of position '"+position+"'");
	}
	
	/**
	 * Printing the Node value by traversing 
	 */
	public void print() {
		System.out.print("The sequence is : ");
		Node temp = head; //Initializing temp
		while (temp!=null) {
			System.out.print(temp.data+" -> "); //Printing data
			temp=temp.next;//Traversing temp to next
		}
		System.out.println("\n");
	}
}