package org.datastructures.queue;

import java.util.Stack;

public class QueueUsingStackEfficient {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();


    public QueueUsingStackEfficient() {
    }


    public void push(int x) {

        input.push(x);
    }

    public int pop() {
        //1) if output stack is empty then simply output.pop()

        //2) else empty input stack into output stack and return output.pop()

        if (output.isEmpty()) {
            return output.pop();
        }else {

            while (!input.isEmpty()) {
                output.push(input.pop());
            }
            return output.pop();
        }
    }

    public int peek() {

        //1) if output stack is empty then simply output.peek()

        //2) else empty input stack into output stack and return output.peek()

        if (output.isEmpty()) {
            return output.peek();
        }else {

            while (!output.isEmpty()) {
                output.push(input.pop());
            }
            return output.peek();
        }
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }


}
