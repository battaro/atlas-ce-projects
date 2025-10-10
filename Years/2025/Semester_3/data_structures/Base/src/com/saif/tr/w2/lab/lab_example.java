package com.saif.tr.w2.lab;

import java.util.LinkedList;
import java.util.Stack;

public class lab_example {
    public static void main(String[] args) {

        /*
        Node node1 = new Node(5);
        Node node2 = new Node(34);
        Node node3 = new Node(58);

        node1.next = node2;
        node2.next = node3;

       System.out.println(node1.getData());
       System.out.println(node1.next.getData());
       System.out.println(node1.next.next.getData());
       */

        /*
        Node head = new Node(10); //every time we have the special data on head when we use linkedlists
        Node last = head;

        //create 5 nodes
        for (int i = 0; i < 5; i++) {
            last.next = new Node(i * 2);
            last = last.next;
        }

        //print nodes' data
        Node temp = head;
        int i = 0;
        while (temp != null) {
            System.out.println(++i + "." + temp.getData());
            temp = temp.next;
        } */

        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Stack<Integer> Intstack = new Stack<>();
        Intstack.push(1);
        Intstack.push(2);

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
        Node<T> tempNode = top;
        top = top.next;
        return tempNode;
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
    Node<T> getAddress() {
        return next;
    }
}

