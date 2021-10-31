package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {

        // Displaying Welcome Message
        System.out.println("Welcome to LinkedList Program");

        SinglyLinkedList linkedlistAtStartObject = new SinglyLinkedList();
        //Creating linkedlist node and passing int type data in it.
        System.out.println("Adding new node at start position :"+"\n");
        linkedlistAtStartObject.addNode(56);
        linkedlistAtStartObject.addNode(30);
        linkedlistAtStartObject.addNode(70);
        //printing linkedList.
        linkedlistAtStartObject.printNode();

        System.out.println("--------------------");

        System.out.println("\n"+ "Adding new node at last position :" + "\n");
        SinglyLinkedList linkedlistAppendAtLast = new SinglyLinkedList();
        linkedlistAppendAtLast.appendAtLast(56);
        linkedlistAppendAtLast.appendAtLast(30);
        linkedlistAppendAtLast.appendAtLast(70);
        //printing append at last linkedlist.
        linkedlistAppendAtLast.printNode();

        System.out.println("--------------------");

        System.out.println("\n"+ "Adding new node at specific position :" + "\n");
        SinglyLinkedList linkedlistNodeInsertAt = new SinglyLinkedList();
        System.out.println("Linkedlist before adding new node in between.");
        linkedlistNodeInsertAt.appendAtLast(56);
        linkedlistNodeInsertAt.appendAtLast(70);
        linkedlistNodeInsertAt.printNode();
        System.out.println("LinkedList after adding new node 30 between 56 and 70");
        //adding new node between 56 and 70.
        linkedlistNodeInsertAt.insertAtLocation(1, 30);
        linkedlistNodeInsertAt.printNode();

    }
}
