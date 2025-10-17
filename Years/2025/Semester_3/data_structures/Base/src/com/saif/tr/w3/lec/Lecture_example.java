package com.saif.tr.w3.lec;

import java.util.Scanner;

public class Lecture_example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("Using iteration: factorial of " + n + " is " + factorialIterationExample(n));
        System.out.println("Using recursion: factorial of " + n + " is " + factorialRecursionExample(n));

        input.close();
    }

    // iteration example (Factorial)
    static int factorialIterationExample(int x) {
        int fac = 1;
        for (int i = x; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }

    // recursion example (Factorial)
    static int factorialRecursionExample(int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorialRecursionExample(x - 1);
    }
}
