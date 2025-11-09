package com.saif.tr.w5.lab;

public class LabExample5 {
    public static void main(String[] args) {
        IntQueue queue = new IntQueue();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.printQueue();

        System.out.println(queue.top());
        System.out.println(queue.remove());

        queue.printQueue();


    }
}

class IntNode
{
    int data;
    IntNode next;
    IntNode(int data)
    {
        this.data = data;
        next = null;
    }
}
class IntQueue {
    IntNode head;
    IntNode tail;
    void add(int value) {
        boolean done = offer(value);
        if (!done)
        {
            throw new IllegalStateException("Queue is full");
        }
    }
    boolean offer(int value) {
        IntNode newNode = new IntNode(value);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        return true;
    }

    boolean isEmpty() {
        return head == null;
    }
    int remove()
    {
        if(head == null)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = head.data;
        head = head.next;
        if (head == null) tail = null;
        return value;
    }

    int top() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        return head.data;
    }
    int pull()  {
        if (isEmpty())
            return -1;
        int value = head.data;
        head = head.next;
        if (head == null) tail = null;
        return value;
    }
    int element()
    {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        return head.data;
    }
    void printQueue()  {
        IntNode temp = head;
        System.out.println("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}

