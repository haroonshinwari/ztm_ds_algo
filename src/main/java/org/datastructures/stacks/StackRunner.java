package org.datastructures.stacks;

public class StackRunner {

    //LIFO - Last In First Out

    public static void main(String[] args) {

        Stack stack = new Stack();


        //push(value)
        stack.push("Discord");
        stack.push("Udemy");
        stack.push("Google");

        stack.printStack();

        //peek
        System.out.println("Peek: " + stack.peek());

        stack.printStack();

        //pop()
        System.out.println("Popped out: " + stack.pop());
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped out: " + stack.pop());
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped out: " + stack.pop());

        System.out.println("Peek: " + stack.peek());

        stack.printStack();
        System.out.println("Popped out: " + stack.pop());



        //




    }
}
