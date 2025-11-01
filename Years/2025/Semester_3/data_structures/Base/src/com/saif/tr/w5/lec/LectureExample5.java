package com.saif.tr.w5.lec;

public class LectureExample5 {
    public static void main(String[] args) {
        LectureExample5 example = new LectureExample5();
        IntLL linkedList = example.new IntLL();

        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addLast(17);

        System.out.print("Original list: ");
        linkedList.display();

        linkedList.head = linkedList.revRecursively(linkedList.head, null);
        System.out.print("Reversed list:");
        linkedList.display();

        linkedList.head = linkedList.revRecursively(linkedList.head,null);
        System.out.print("Reversed list again <original list>: ");
        linkedList.display();

        String contain = containRecursively(linkedList.head, 18) ? "Yes" : "No";

        System.out.println("Does the list contain 18? " + contain);

        doubleList(linkedList.head);
        System.out.print("List after its doubled: ");
        linkedList.display();

        indexofRec(linkedList.head, 5);
    }

    class IntLL{
        IntNode head;

        IntLL(){
            head = null;
        }

        void addFirst(int data){
            IntNode node = new IntNode(data);
            node.next = head;
            head = node;
        }
        void addLast(int data){

            IntNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new IntNode(data);
        }

        //get length Recursively

        int getLengthRecursively(IntNode node)
        {
            if (node == null)
                return 0;
            return 1 + getLengthRecursively(node.next);
        }
        int getLength(){
            return getLengthRecursively(head);
        }

        //reverse the list Recursively
        IntNode revRecursively(IntNode next, IntNode prev) {
            if (next == null)
                return prev;

            IntNode after = next.next;
            next.next = prev;
            return revRecursively(after, next);
        }



        //display Iteratively
        void display()
        {
            IntNode current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }


    }
    //double linked list values Recursively
    static void doubleList (IntNode node){
        if(node == null)
        {
            return;
        }
        node.data = node.data *2;
        doubleList(node.next);
    }

        //stoped here in the lecture
    static int indexofRec(IntNode node, int target)
    {
        return indexofRec(node,target);
    }


    //check if this element is on the certain list
    static boolean containRecursively(IntNode node, int target)
    {
        if(node == null)
            return false;
        if(node.data == target)
            return true;
        return containRecursively(node.next, target);
    }

    class IntNode
    {
        int data;
        IntNode next;
        IntNode (int data)
        {
            this.data = data;
            next = null;
        }
    }

}
