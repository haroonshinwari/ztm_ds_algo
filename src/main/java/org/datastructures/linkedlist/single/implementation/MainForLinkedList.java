package org.datastructures.linkedlist.single.implementation;

public class MainForLinkedList {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insert(5);
        linkedList.insert(18);
        linkedList.insert(45);
        linkedList.insert(12);

        linkedList.insertAtStart(25);
        linkedList.insertAt(2,55);

        linkedList.insertAt(0,24);

        linkedList.show();
    }


}
