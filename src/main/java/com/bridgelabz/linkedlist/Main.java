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

    }
}
