package com.progzilla;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args){
        /*
        Write a program that searches a database (array)
        for a specific number and prints whether that number exists or not.
         */

        // mimic a database with an array
        int[] arraysOfNumbers =
                {10, 35, 24, 101,
                28, 14, 201, 91};

        boolean searchValidator = false; // initialise a search validator
        int i;

        // accept input from user
        System.out.print("What number are you searching for? ");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();

        // iterate through the array and validate number's index
        for (i = 0; i < arraysOfNumbers.length; i++) {
            if (searchNumber == arraysOfNumbers[i]) {
                searchValidator = true; // validate the search
                break; // jump out loop once found
            }
        }

        // print out a confirmation
        if (searchValidator) {
            System.out.println("Number " + searchNumber + " was found at index " + i);
        } else {
            System.out.println("Number " + searchNumber + " could not be found!");
        }
    }
}
