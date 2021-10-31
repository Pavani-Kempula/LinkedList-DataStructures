package com.bridgelabz.linkedlist;

/*
 * @author Pavani
 *
 * Creating Singly-LinkedList
 */

public class SinglyLinkedList {
    //Initially head is tail.
    Node head = null;

    /**
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
     *
     * Modification : First commit 02-July-2021
     */
    public void addNode(int data)
    {
        Node newNode = new Node(data); //empty node

        if(head == null)
        {
            head = newNode;
            newNode.nextNode = null;
        }
        else
        {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    /**
     * Name : appendAtLast
     *
     * Description : Appending newly node at the last.
     *
     * @param data
     *
     * Algorithm : Traversing the linkedlist using while loop.
     * when the nextNode is null comes appending the newly created node to it
     * which becomes the last node of linkedlist.
     *
     * Modification : First commit 02-July-2021
     */
    public void appendAtLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node tempNode ;
            tempNode = head;
            while(tempNode.nextNode != null)
            {
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = newNode;
        }
    }

    /**
     * Name : printNode
     *
     * Description : Printing LinkedList
     *
     * Algorithm : Creating tempNode that will traverse till the last node in while loop
     * until it comes to nextNode which is null.
     * Printing the current node as tempNode moves forward.
     *
     * Modification : First commit 02-July-2021
     */
    public void printNode()
    {
        Node tempNode;
        tempNode = head;

        if(head == null)
        {
            System.out.println("LinkedList is empty !");
        }
        else
        {
            while(tempNode.nextNode != null)
            {
                System.out.print(tempNode.data + " --> ");
                tempNode = tempNode.nextNode;
            }
            System.out.print(tempNode.data + "\n");
        }
    }
}