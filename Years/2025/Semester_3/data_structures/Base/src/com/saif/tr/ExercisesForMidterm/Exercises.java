package com.saif.tr.ExercisesForMidterm;

import com.saif.tr.w4.lab.LabExample4;
import org.w3c.dom.Node;

public class Exercises {
    public static void main(String[] args) {
        Exercises ex = new Exercises();
        IntLL linkedList = ex.new IntLL();

        linkedList.addFirst(2);
        linkedList.addLast(4);
        linkedList.addLast(7);
        linkedList.addLast(7);
        linkedList.addLast(4);
        linkedList.display();
        boolean found = containRecursive(linkedList.head,2);
        String txt = found ? "Yes" : "No";
        System.out.println(txt);
    }



    // <editor-fold "Ex1">
    //1.Write a recursive function that determines if a string passed is palindrome or not.
    //Some palindromes are Madam, level,radar,refer, ....

    //Iterative way
    static void palindromeCheckIterative(String input) {
        input = input.toLowerCase();
        int leftValue = 0;
        int rightValue = input.length() - 1;
        boolean isPalindrome = true;
        while (leftValue <= rightValue) {
            if (input.charAt(leftValue) != input.charAt(rightValue)) {
                isPalindrome = false;
                break;
            }
            leftValue++;
            rightValue--;
        }
        String txt = isPalindrome ? "Palindrome" : "Not Palindrome";
        System.out.println(txt);
    }

    //Recursive Way
    //Chatgpt used !, using substring function
    static Boolean isPalindromeRecursive(String input) {
        input = input.toLowerCase();
        if (input.length() <= 1)
            return true;

        if (input.charAt(0) != input.charAt(input.length() - 1))
            return false;

        return isPalindromeRecursive(input.substring(1, input.length() - 1));
    }

    static void palindromeCheckRecursive(String input) {
        input = input.toLowerCase();
        Boolean isPalindrome = isPalindromeRecursive(input);
        String txt = isPalindrome ? "Palindrome" : "Not a palindrome";
        System.out.println(txt);
    }
// </editor-fold>

    // <editor-fold "Ex2">

    //2. Write a recursive function that prints the following where the number of stars at the top row is
    //passed as an argument.
    //******
    //*****
    //****
    //***
    //**
    //*


    //Iterative way
    static void starsIterative(char c, int rows) {

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //Recursive way
    static void starsRecursive(char c, int rows, int col) {
        if (rows == 0)
            return;

        if (col < rows) {
            System.out.print(c);
            starsRecursive(c, rows, col + 1);
        } else {
            System.out.println();
            starsRecursive(c, rows - 1, 0);
        }
    }
    //</editor-fold>

    // <editor-fold "Ex3 -> Ex16">"


    class IntLL {
        private IntNode head;

        IntLL() {
            this.head = null;
        }

        IntNode getHead() {
            return this.head;
        }

        void setHead(IntNode newHead) {
            this.head = newHead;
        }

        void addFirst(int data) {
            IntNode newNode = new IntNode(data);
            newNode.next = head;
            head = newNode;
        }

        void addLast(int data) {
            if (isEmpty()) {
                System.out.println("Empty List");
            }
            IntNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new IntNode(data);
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Empty List");
            }
            IntNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            return head == null;
        }


        /* 4. Write a recursive function that inserts an element into a linked list which is ordered, or maintains
        the order. */

        //Iterative way
        void insertIterative (int data){
            addFirst(data);
            IntNode current = head;
            while (current != null && current.data > current.next.data)
            {
               int temp = current.data;
               current.data = current.next.data;
               current.next.data = temp;
               current = current.next;
            }  
        }

        //Recursive way
        IntNode insertRecursive(IntNode node, int data) {

            if (node == null || data < node.data) {
                IntNode newNode = new IntNode(data);
                newNode.next = node;
                return newNode;
            }

            node.next = insertRecursive(node.next, data);
            return node;
        }
        
    }



     /*
        3.Write a recursive function, remove(target, head) where the function removes all the occurrences
        of target from linked list whose first element’s address stored in the head. Remove function should
        return the head of the new list. Use the linked list example we discussed in class.
        An example would be removing 9 from the linked list 9, 4, 2, 8, 9, 4 would return 4, 2, 8, 4.
         */

    //Iterative way
    static IntNode removeIterative(int target, IntNode head) {
        while (head.data == target)
            head = head.next;

        IntNode temp = head;
        while (temp.next != null) {
            if (temp.next.data == target) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    //Recursive way
    static IntNode removeRecursive(int target, IntNode head) {
        if (head == null)
            return null;

        head.next = removeRecursive(target, head.next);

        if (head.data == target)
            return head.next;
        else
            return head;
    }

    /* 5. Check if a linked list contains an element */

    //Iterative way
    static boolean containIterative(IntNode node, int target){

        boolean found = false;
        if (node == null)
            return found;

        IntNode current = node;
        while(current != null){
            if(current.data == target){
                found = true;
                break;
            }
            current = current.next;
        }
        return found;
    }

    static boolean containRecursive(IntNode node, int target){
        if(node == null)
            return false;
        if(node.data == target)
            return true;
        return containRecursive(node.next, target);
    }



    class IntNode {
        int data;
        IntNode next;

        public IntNode(int data) {
            this.data = data;
            next = null;
        }
    }


    //</editor-fold>


}
