package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {
    private final int MAX_CAPACITY;
    //to store elements of stack
    private int[] arr;
    // 0 or -1
    private int top;

    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        arr = new int[MAX_CAPACITY];
        top = -1;
    }

    @Override
    public void push(int element) {
        if(size() != MAX_CAPACITY){
            top++;
            arr[top] = element;
            System.out.println("element inserted");
        }
        else{
            System.out.println("Stack OverFlow");
        }
    }

    @Override
    public int pop() {
        int response = 0;
        if(!isEmpty()){
            response = arr[top];
            top--;
        }
        else{
            System.out.println("Stack UnderFlow");
        }
        return response;
    }

    @Override
    public int peek() {
        if(!isEmpty()){
            return arr[top];
        }
        else{
            System.out.println("Stack empty");
            return 0; //considering 0 as invalid
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
