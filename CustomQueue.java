package com.example.mike.fridaytest;

import java.util.Stack;

public class CustomQueue {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> buffer = new Stack<>();

    public void enQueue(int value){

        buffer.removeAllElements();

        buffer.addAll( stack );

        stack.removeAllElements();

        stack.push(value);

        stack.addAll( buffer );
    }

    public int deQueue(){
        return stack.pop();
    }
}
