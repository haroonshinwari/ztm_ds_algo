package org.datastructures.queue;

import java.util.Stack;

public class QueueUsingStackSimple {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public QueueUsingStackSimple() {
    }


    public void push(int x) {

        //1) Empty stack1 into stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        //2) Push new value into stack1
        stack1.push(x);

        //3) Empty stack2 back into stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {

        //Simple - just pop from stack1
        return stack1.pop();
    }

    public int peek() {

        //Simple - just peek from stack1
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.empty();
    }


}
