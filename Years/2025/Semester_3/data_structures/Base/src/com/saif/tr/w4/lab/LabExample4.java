package com.saif.tr.w4.lab;
public class LabExample4 {

    public static void main(String[] args) {
        LabExample4 example = new LabExample4();
        IntLL myLL = example.new IntLL();

        myLL.addFirst(45);
        myLL.addFirst(34);
        myLL.addLast(58);
        myLL.display2();
        System.out.println("This size is: "+myLL.getSize());
        System.out.println("The sum of the list: "+myLL.getSum());

    }

    class IntLL {
        private IntNode head;

        IntLL() {
            head = null;
        }

        void addFirst(int data) {
            IntNode newNode = new IntNode(data);
            newNode.next = head;
            head = newNode;
        }

        void addLast(int data) {
            IntNode newNode = new IntNode(data);
            if (head == null) {
                head = newNode;
                return;
            }
            IntNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }


        //normal display
        void display() {
            IntNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("null");
        }


        //recursive display
        private void recursiveDisplay(IntNode node) {
            if (node == null) {
                System.out.println("null");
                return;
            }
            System.out.print(node.data + " ");
            recursiveDisplay(node.next);
        }
        void display2()
        {
            recursiveDisplay(head);
        }




        //Get size recursively
        private int sizeRecursive(IntNode node) {

            if (node == null) {
                return 0;
            }
            return 1 + sizeRecursive(node.next);
        }
        int getSize()
        {
            return sizeRecursive(head);
        }

        //Get Sum recursively
        private int sumRecursive(IntNode node) {
            if (node == null) {
                return 0;
            }
            return node.data + sumRecursive(node.next);
        }
        int getSum()
        {
            return sumRecursive(head);
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

    static void recursiveCase(int n) {
        if (n == 0)
            System.out.println("Bomm!");
        else {
            System.out.println(n);
            recursiveCase(n - 1);
        }
    }
}
