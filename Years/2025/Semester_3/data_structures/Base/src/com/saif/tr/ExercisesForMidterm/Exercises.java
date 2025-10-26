package com.saif.tr.ExercisesForMidterm;

public class Exercises {
    public static void main(String[] args) {



    }
    // <editor-fold "Ex1">
    //1.Write a recursive function that determines if a string passed is palindrome or not.
    //Some palindromes are Madam, level,radar,refer, ....

    //Iterative way
    static void  palindromeCheckIterative(String input)
    {
        input = input.toLowerCase();
        int leftValue = 0;
        int rightValue = input.length() - 1;
        boolean isPalindrome = true;
        while (leftValue <= rightValue) {
            if(input.charAt(leftValue) != input.charAt(rightValue)) {
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


}
