package org.datastructures.linkedlist.doubly.implementation;

public class DoubleLinkedList {


    DLNode head;

    int length;

    public void append(int data) {

        DLNode DLNode = new DLNode();
        DLNode.data = data;

        if (head == null) {
            head = DLNode;
            this.length++;
        }else {
            DLNode currentDLNode = head;

            while(currentDLNode.next!=null) {
                currentDLNode = currentDLNode.next;
            }
            currentDLNode.next = DLNode;
            DLNode.previous = currentDLNode;
            this.length++;

        }
    }

    public void prepend(int data) {
        DLNode newDLNode = new DLNode();
        newDLNode.data = data;
        newDLNode.next = this.head;

        this.head.previous = newDLNode;
        this.head = newDLNode;
        this.length++;
    }

    public void insert(int index, int data) {
        DLNode newNode = new DLNode();
        newNode.data = data;

        //if 0 index is given - special condition
        if (index == 0) {
            prepend(data);
            return;
        }

        if (index >= this.length) {
            append(data);
            return;
        }

        DLNode oneBeforeNode = head;

        for (int i = 0; i < index-1 ; i++) {
            oneBeforeNode = oneBeforeNode.next;
        }

        DLNode oneAheadNode = oneBeforeNode.next;

        oneAheadNode.previous = newNode;
        oneBeforeNode.next = newNode;

        newNode.next = oneAheadNode;
        newNode.previous = oneBeforeNode;

        this.length++;
    }


    public void show() {

        DLNode DLNode = head;
        while (DLNode.next!=null) {
            System.out.println(DLNode.data);
            DLNode = DLNode.next;
        }
        System.out.println(DLNode.data);
        System.out.println("Length: " + this.length);
    }


    public void showDetailed() {

        DLNode DLNode = head;
        while (DLNode.next!=null) {
            System.out.println("Node = " + DLNode.data);
            System.out.println("Node.previous = " + DLNode.previous);
            System.out.println("Node.next = " + DLNode.next);
            System.out.println("===========================================");

            DLNode = DLNode.next;


        }
        System.out.println("Node = " + DLNode.data);
        System.out.println("Node.previous = " + DLNode.previous);
        System.out.println("Node.next = " + DLNode.next);
        System.out.println("===========================================");
    }



}
