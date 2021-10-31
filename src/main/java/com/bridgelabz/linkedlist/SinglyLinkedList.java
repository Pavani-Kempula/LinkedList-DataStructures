package com.bridgelabz.linkedlist;

/*
 * @author Pavani
 *
 * Creating Singly-LinkedList
 */

public class SinglyLinkedList {
    //Initially head is tail.
    Node head = null;

    /*
     * Name : addNode
     *
     * Description : Create or add New-Node.
     *
     * @param data
     *
     * Algorithm : Creating object of a Node class that will be the new node.
     * which accepts int type of data.
     * If head is null means there is no node present.
     * If head is not null means there is node present and new node will get added at first position,
     * and new node have reference to the old node.
     */
    public void addNode(int data) {
        Node newNode = new Node(data); //empty node

        if(head == null) {
            head = newNode;
            newNode.nextNode = null;
        }
        else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    /*
     * Name : appendAtLast
     *
     * Description : Appending newly node at the last.
     *
     * @param data
     *
     * Algorithm : Traversing the linkedlist using while loop.
     * when the nextNode is null comes appending the newly created node to it
     * which becomes the last node of linkedlist.
     */
    public void appendAtLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        else {
            Node tempNode ;
            tempNode = head;
            while(tempNode.nextNode != null) {
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = newNode;
        }
    }

    /*
     * Name : insertAtLocation
     *
     * Description : Inserting new node at specific position.
     *
     * @param index
     * @param data
     *
     * Algorithm : Method takes input as index which holds at what index position
     * new node to be added along with the data.
     * If index is null calling addNode() method that will create new node.
     * else new node will get inserted at the specific index position.
     */
    public void insertAtLocation(int index, int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.nextNode = null;

		/*if index is 0 then calling insertAtStart() function
		that will insert element at 0'th position.*/
        if(index == 0) {
            addNode(data);
        }
        else {
            Node tempNode = head;
            for(int i=0; i<index-1; i++) {
                tempNode = tempNode.nextNode;
            }
            newNode.nextNode = tempNode.nextNode;
            tempNode.nextNode = newNode;
        }
    }

    /*
     * Name : deleteAt
     *
     * Description : Deleting node as per index number provided.
     *
     * @param index
     *
     * Algorithm : method takes index number as input checks if it is 0 then it will delete the first node
     * or else it will traverse till that index number and it will break the link between the consecutive node.
     */
    public void deleteAt(int index) {
        //if index value is 0 then deleting first element.
        if(index == 0) {
            head = head.nextNode;
        }
        // if index value is not 0 something else.
        else {
            Node tempNode = head;
            Node tempNodeTwo = null;

            for(int i=0; i<index-1; i++) {
                tempNode = tempNode.nextNode;
            }
            tempNodeTwo = tempNode.nextNode;
            tempNode.nextNode = tempNodeTwo.nextNode;
            System.out.println("Element we are deleting is : " + tempNodeTwo.data);
        }
    }

    /*
     * Name : searchElement
     *
     * Description : Searching for a specified element in linkedlist.
     *
     * @param data
     *
     * Algorithm : This method accept data which we want to find in linkedlist.
     * will traverse from the start of the link list to the end at the same time keeping count
     * of how many iteration  it did and keep on checking node data with the given data to method.
     * if found printing the appropriate message aloung with the itteratio count that is nothig but
     * index number of that node where we found the data ( element ).
     */
    public void searchElement(int data) {
        Node tempNode = new Node(data);
        tempNode = head;
        int indexAt = 0;
        while(tempNode.data != data) {
            tempNode = tempNode.nextNode;
            indexAt ++;
        }
        System.out.println("Element " + data + " found at index position : " + indexAt);
    }

    /*
     * Name : printNode
     *
     * Description : Printing LinkedList
     *
     * Algorithm : Creating tempNode that will traverse till the last node in while loop
     * until it comes to nextNode which is null.
     * Printing the current node as tempNode moves forward.
     */
    public void printNode() {
        Node tempNode;
        tempNode = head;

        if(head == null) {
            System.out.println("LinkedList is empty !");
        }
        else {
            while(tempNode.nextNode != null) {
                System.out.print(tempNode.data + " --> ");
                tempNode = tempNode.nextNode;
            }
            System.out.print(tempNode.data + "\n");
        }
    }
}