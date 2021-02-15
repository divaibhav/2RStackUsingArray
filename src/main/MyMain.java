package main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        int maxCapacity = 5;
        MyStack stack = new MyStack(maxCapacity);
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("no of elements in stack = " + stack.size());
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Element at top of stack" + stack.peek());
    }
}
