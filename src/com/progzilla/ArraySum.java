package com.progzilla;

public class ArraySum {
    public static void main(String[] args){
        /* Write a program that calculates the sum of all elements
        in an array using an enhanced for loop.
         */

        // declare and initialise an array
        int[] arraySum = {3,4,5,2,7,6};
        int total_array = 0;

        // standard for loop
        for (int i=0; i < arraySum.length; i++){
            // calculate
            total_array += arraySum[i]; // total_array = total_array + arraySum[i]
        }
        // use of enhanced for loop
        for (int arrayNumber : arraySum) {
            total_array += arrayNumber;
        }
        System.out.println("Total Sum of Array is: " + total_array);
    }
}
