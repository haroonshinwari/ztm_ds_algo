package org.datastructures.linkedlist.doubly.implementation;

public class RunnerDLL {

    public static void main(String[] args) {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.append(5);
        doubleLinkedList.append(10);
        doubleLinkedList.append(2);
        doubleLinkedList.prepend(24);
        doubleLinkedList.insert(10,55);

        doubleLinkedList.show();
        doubleLinkedList.showDetailed();
    }

}
