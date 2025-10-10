package com.saif.tr.w2.lec;
import java.util.LinkedList;
public class Array_example {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        // Accessing elements directly
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 3: " + numbers[3]);

        // Modifying an element
        numbers[2] = 99;
System.out.println("Modified element at index 2: " + numbers[2]);

        // Traversing the array
        System.out.println("All elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
