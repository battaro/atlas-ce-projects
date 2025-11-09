package com.saif.tr.w6.lab;

public class LabExample6 {
    public static void main(String[] args) {

        //Tree building
        IntNode root = new IntNode(25);
        IntNode n10 = new IntNode(10);
        IntNode n35 = new IntNode(35);
        IntNode n5  = new IntNode(5);
        IntNode n15 = new IntNode(15);
        IntNode n30 = new IntNode(30);
        IntNode n40 = new IntNode(40);

        root.left = n10;
        root.right = n35;
        n10.left = n5;
        n10.right = n15;
        n35.left = n30;
        n35.right = n40;


        //Printing in Orders
        System.out.print("PreOrder: ");
        printPreOrder(root);
        System.out.println();

        System.out.print("InOrder: ");
        printInOrder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        printPostOrder(root);
    }

    static void printPreOrder(IntNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    static void printInOrder(IntNode root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }


    static void printPostOrder(IntNode root) {
        if (root == null)
            return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }
}

class IntNode {
    int data;
    IntNode left, right;

    IntNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
