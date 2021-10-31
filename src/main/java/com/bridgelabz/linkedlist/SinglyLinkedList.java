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
     * If head is not null means there is node present and new node will get added next,
     * and new node have reference to the old node.
     *
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
}
