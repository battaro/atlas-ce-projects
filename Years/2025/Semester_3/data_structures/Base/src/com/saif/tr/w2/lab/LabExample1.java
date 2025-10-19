package com.saif.tr.w2.lab;

import java.util.Stack;

public class LabExample1 {
    public static void main(String[] args) {
        // Example using built-in Stack
        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        System.out.println("Built-in Stack pop: " + intStack.pop());

        // Example using custom linked list stack
        StackLL<String> customStack = new StackLL<>();
        customStack.push(new Node<>("Hello"));
        customStack.push(new Node<>("Test"));

        System.out.println("Custom Stack first pop: " + customStack.pop().getData());
        System.out.println("Custom Stack second pop: " + customStack.pop().getData());
        System.out.println("Is Custom Stack empty? " + customStack.isEmpty());
    }
}

class StackLL<T> {
    private Node<T> top;

    StackLL() {
        top = null;
    }

    void push(Node<T> newNode) {
        newNode.next = top;
        top = newNode;
    }

    Node<T> pop() {
        /*
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        */
        Node<T> temp = top;
        top = top.next;
        return temp;
    }

    Node<T> top() {
        return top;
    }

    boolean isEmpty() {
        return top == null;
    }
}

class Node<T> {
    private T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    T getData() {
        return data;
    }

    Node<T> getNext() {
        return next;
    }
}