package com.saif.tr.w2.lec;

import java.util.Stack;

public class lecture_example {
    public static void main(String[] args) {

        IntStack s1 = new IntStack(32); //create new integer stack with size 32
        s1.push(58);
        s1.push(34);
        s1.push(5);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());


    }
}

class IntStack {

    private int numbers[]; //Array to store elements on
    private int topIndex;  //Index to track the top Element


    //Constructor creates stack with the given diz
    IntStack(int size) {
        numbers = new int[size];
        topIndex = -1; //stack means empty here
    }


    // Removes and returns the top element from the stack.
    int pop() {

        //avoid errors in removing from empty stack
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return numbers[topIndex--]; // return top element, then decrease topIndex
    }

    //Return the top element
    int top() {
        return numbers[topIndex];
    }

    //Adds new element to the top of the stack
    void push(int data) {
        numbers[++topIndex] = data;
    }

    //Checks if the stack is empty or not
    boolean isEmpty() {
        if (topIndex == -1) {
            return true;
        } else {
            return false;
        }

    }
}

class StringStack {

}
