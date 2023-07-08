package org.datastructures.stacks;

public class Stack {

    StackNode top;
    StackNode bottom;
    int length;

    public String peek() {

        if (this.length == 0 ) {
            return "Can't peek as stack is empty";
        }
        return top.value;

    }

    public void push(String value) {

        StackNode newStackNode = new StackNode();
        newStackNode.value = value;

        if (this.length == 0) {
            this.top = newStackNode;
            this.bottom = newStackNode;
            this.length++;
        }
        else {
            newStackNode.next = this.top;
            this.top = newStackNode;
            this.length++;
        }

    }

    public String pop() {

        if (this.length == 0) {
            return "Empty Stack - nothing to pop";
        }

        if (this.top == this.bottom) {
            this.bottom = null;
        }



        String currentTop = top.value;

        this.top = top.next;
        this.length--;
        return currentTop;
    }

    public void printStack() {

        if (this.length == 0) {
            System.out.println("Print Stack: Empty Stack");
            return;
        }

        System.out.println("=======================");

        StackNode currentNode = this.top;
        while (currentNode.next != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }

        System.out.println(currentNode.value);
        System.out.println("=======================");


    }






}
