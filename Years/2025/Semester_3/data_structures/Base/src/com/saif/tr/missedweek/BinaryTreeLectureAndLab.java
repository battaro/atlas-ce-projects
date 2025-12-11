package com.saif.tr.missedweek;

public class BinaryTreeLectureAndLab {
    public static void main(String[] args) {

    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Queue {
    private Node front;
    private Node rear;

    void add(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
}

class BinaryTreeNode {
    BinaryTreeNode left;
    BinaryTreeNode right;
    int data;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

class BinaryTree {
    BinaryTreeNode root;

    BinaryTree(BinaryTreeNode node) {
        root = node;
    }

    boolean contains(int data) {
        return containsHelper(data, root);
    }

    private boolean containsHelper(int data, BinaryTreeNode node) {
        if (node == null) return false;
        if (node.data == data) return true;

        return containsHelper(data, node.left) ||
                containsHelper(data, node.right);
    }
}
