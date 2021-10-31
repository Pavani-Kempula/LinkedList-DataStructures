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

    }
}
