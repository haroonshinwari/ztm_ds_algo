package org.datastructures.linkedlist.single.implementation;


/*

Methods to implement
----------------------
    insert(value)                 //inserts at the end - append
    insertAt(index, value)        //insert in the middle
    insertAtStart(value)          //prepend
    delete(value)
    show()                        //print values in linked list


Important points
----------------------
Start by creating a head node

Head Node --- Tail Node

 */
public class LinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head==null) {
            head = node;
        }else {

            //start with head value and traverse next next until you get to the tail
            Node n = head;
            while (n.next!= null) {
                n = n.next;
            }
            n.next = node;
        }
    }


    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;

        head = node;
    }
    
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;

        //if 0 index is given - special condition
        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node n = head;

        for (int i = 0; i < index-1 ; i++) {
            n = n.next;
        }

        node.next = n.next;
        n.next = node;
    }


    public void show() {

        Node node = head;
        while (node.next!=null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }




}
