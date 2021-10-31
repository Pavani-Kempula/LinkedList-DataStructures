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

        System.out.println("----------------------------------------------------");

        System.out.println("\n"+ "Adding new node at last position :" + "\n");
        SinglyLinkedList linkedlistAppendAtLast = new SinglyLinkedList();
        linkedlistAppendAtLast.appendAtLast(56);
        linkedlistAppendAtLast.appendAtLast(30);
        linkedlistAppendAtLast.appendAtLast(70);
        //printing append at last linkedlist.
        linkedlistAppendAtLast.printNode();

        System.out.println("-----------------------------------------------------");

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

        System.out.println("------------------------------------------------------");

        System.out.println("\n"+ "Linked List before deleting first node :" + "\n");
        SinglyLinkedList linkedlistDeleteNode = new SinglyLinkedList();
        linkedlistDeleteNode.appendAtLast(56);
        linkedlistDeleteNode.appendAtLast(30);
        linkedlistDeleteNode.appendAtLast(70);
        linkedlistDeleteNode.printNode();
        System.out.println("\n"+ "Linked List after deleteing first node :" + "\n");
        linkedlistDeleteNode.deleteAt(0);//providing index number.
        linkedlistDeleteNode.printNode();

        System.out.println("------------------------------------------------------");

        System.out.println("\n"+ "Linked List before deleting last node :" + "\n");
        SinglyLinkedList linkedlistDeleteLastNode = new SinglyLinkedList();
        linkedlistDeleteLastNode.appendAtLast(56);
        linkedlistDeleteLastNode.appendAtLast(30);
        linkedlistDeleteLastNode.appendAtLast(70);
        linkedlistDeleteLastNode.printNode();
        System.out.println("\n"+ "Linked List after deleteing last node :" + "\n");
        linkedlistDeleteLastNode.deleteAt(2);//providing index number.
        linkedlistDeleteLastNode.printNode();

        System.out.println("------------------------------------------------------");

        System.out.println("\n"+ "Singly linkedlist :" + "\n");
        SinglyLinkedList linkedlistSearchElement = new SinglyLinkedList();
        linkedlistSearchElement.appendAtLast(56);
        linkedlistSearchElement.appendAtLast(30);
        linkedlistSearchElement.appendAtLast(70);
        linkedlistSearchElement.printNode();
        System.out.println("\n"+ "Searching for specific element in linkedlist :" + "\n");
        linkedlistSearchElement.searchElement(30);//providing data

        System.out.println("-----------------------------------------------------");

        System.out.println("\n"+ "Adding new node 40 after 30 :" + "\n");
        System.out.println("Linkedlist before adding new node in between.");
        linkedlistNodeInsertAt.printNode();
        System.out.println("LinkedList after adding new node 40 between 30 and 70");
        //adding new node between 56 and 70.
        linkedlistNodeInsertAt.insertAtLocation(2, 40);
        linkedlistNodeInsertAt.printNode();

        System.out.println("----------------------------------------------------");

        System.out.println("\n"+ "Singly linkedList :" + "\n");
        SinglyLinkedList linkedlistSingly = new SinglyLinkedList();
        linkedlistSingly.appendAtLast(56);
        linkedlistSingly.appendAtLast(30);
        linkedlistSingly.appendAtLast(40);
        linkedlistSingly.appendAtLast(70);
        //printing linkedlist.
        linkedlistSingly.printNode();
        System.out.println("-----------------------------------------------------");
        linkedlistSingly.deleteAt(2);
        linkedlistSingly.printNode();
        System.out.println("After deleting the node curruent linkedlist size is : " + linkedlistSingly.size());

        System.out.println("----------------------------------------------------");

        System.out.println("\n"+ "Singly linkedList :" + "\n");
        SinglyLinkedList linkedlistSort = new SinglyLinkedList();
        linkedlistSort.appendAtLast(56);
        linkedlistSort.appendAtLast(30);
        linkedlistSort.appendAtLast(40);
        linkedlistSort.appendAtLast(70);
        //printing linkedlist.
        System.out.println("Linkedlist before sorting");
        linkedlistSingly.printNode();
        System.out.println("LinkedList after sorting.");
        linkedlistSort.sort();
        linkedlistSort.printNode();
        System.out.println("-----------------------------------------------------");
    }
}
