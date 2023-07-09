package org.datastructures.queue;

public class Runner {

    public static void main(String[] args) {


        QueueUsingStackSimple myQueue = new QueueUsingStackSimple();

        /*
            myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek());; // return 1
        System.out.println(myQueue.pop());; // return 1, queue is [2]
        System.out.println(myQueue.empty());; // return false
         */
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);

        myQueue.pop();

        myQueue.push(5);

        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();

        System.out.println();

        QueueUsingStackEfficient myQueueEfficient = new QueueUsingStackEfficient();

    }
}
