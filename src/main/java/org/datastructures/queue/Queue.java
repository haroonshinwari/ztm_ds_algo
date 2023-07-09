package org.datastructures.queue;

public class Queue {

    QueueNode first;
    QueueNode last;

    int length;

    public String peek() {

        if (this.length == 0) {
            return "Empty Queue";
        }
        return this.first.value;
    }

    public void enqueue(String value) {

        QueueNode newNode = new QueueNode();
        newNode.value = value;

        if (this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        }else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
        System.out.println("Enqueue: " + value);
    }

    public void dequeue() {

        if (this.length == 0) {
            System.out.println("Empty Queue");
        }

        String nodeToBeDeque = this.first.value;
        this.first = this.first.next;
        this.length--;
        System.out.println("Deque: " + nodeToBeDeque);
    }

    public void printQueue() {

        if (this.length == 0) {
            System.out.println("emptyQueue");
        }

        QueueNode currentNode = this.first;

        while (currentNode.next != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.value);

    }

}
