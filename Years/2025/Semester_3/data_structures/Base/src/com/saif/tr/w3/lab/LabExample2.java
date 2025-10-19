package com.saif.tr.w3.lab;

public class LabExample2 {
    public static void main(String[] args) {

        int numbers[] = {1,2,3,4,5};
        int sumRecursively = recursiveSummtion(numbers,0,numbers.length);
        int sumIteratively= itertiveSummtion(numbers);

        System.out.println("Recursive solutions sum: "+ sumRecursively);
        System.out.println("Recursive solutions sum: "+ sumIteratively);

    }
    static int recursiveSummtion(int[] numbers,int i,int size) {
        //Second Example
        if (i == size) {
            return 0;
        }
        return numbers[i] + recursiveSummtion(numbers, i + 1, size);
    }
    static int itertiveSummtion(int[] numbers)
    {
        //First Example
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[i] + sum;
        }
        return sum;
    }
}
