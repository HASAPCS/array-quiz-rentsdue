package com.example;

public class ArrayOperations {
    
    public static int findMaximumValue(int[] array) {
        int max= array[0];
        for (int num: array) {
            if (max<num) {
                max=num;
            }
        }
        return max; 
    }

    // Exercise 2: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        int sum=0;
        for (int num: array) {
            sum +=num;
        }
        return sum/array.length;
    }

    // Exercise 3: Reverse an Array
    public static int[] reverseArray(int[] array) {
        for (int i=0; i<array.length/2; i++) {
            int j=array.length-i-1;
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        return array; 
    }
}
