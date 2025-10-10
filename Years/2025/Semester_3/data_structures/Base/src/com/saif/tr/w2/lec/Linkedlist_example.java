package com.saif.tr.w2.lec;
import java.util.LinkedList;

public class Linkedlist_example {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Accessing elements (sequentially)
        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Element at index 3: " + numbers.get(3));

        // Modifying an element
        numbers.set(2, 99);

        //Modifying element 5
        numbers.set(4,1);
        System.out.println("Modified element at index 2: " + numbers.get(2));

        // Traversing the list
        System.out.println("All elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
