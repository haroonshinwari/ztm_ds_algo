package org.datastructures.queue;


//FIFO - First In First Out

public class QueueRunner {

    public static void main(String[] args) {

        Queue queue = new Queue();

        //enqueue
        queue.enqueue("Joy");
        queue.enqueue("Matt");
        queue.enqueue("Pavek");
        queue.enqueue("Samir");

        queue.printQueue();

        queue.dequeue();

        queue.printQueue();




    }



}
