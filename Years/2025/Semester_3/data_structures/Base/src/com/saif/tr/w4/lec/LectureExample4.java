package com.saif.tr.w4.lec;

import javax.naming.NamingEnumeration;

public class LectureExample4 {
    public static void main(String[] args) {
        LectureExample4 example = new LectureExample4();
        IntLL myLL = example.new IntLL();

        myLL.addFirst(45);
        myLL.addFirst(34);
        myLL.addLast(58);
        myLL.display();
    }

    class IntLL {
        private IntNode head;

        IntLL() {
            this.head = null;
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
            IntNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new IntNode(data);

        }

        void display() {
            if (isEmpty()) {
                System.out.println("Empty List");
            }

            IntNode current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("null");
        }

        boolean isEmpty() {
            return head == null;
        }
    }

    class IntNode {
        int data;
        IntNode next;

        IntNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
