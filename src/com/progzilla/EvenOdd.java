package com.progzilla;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        /*
        Write a program that takes an integer
        as input and prints whether it is even or odd.
         */

        // accept input
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is an Even Number");
        } else {
            System.out.println(number + " is an Odd Number");
        }

        // define even or odd

        // check input

        // print
    }
}
