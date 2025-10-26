package com.progzilla;

import java.util.Arrays;
import java.util.List;

public class GuessingGame {
    public static void main(String[] args){
        /*
        Generate a random number between 1 and 100.
        The user keeps guessing until they find it.
        Use control flow (while/do-while) for repeated guessing.
        Use ternary operator for hints like “Too high” or “Too low.”
         */


        var number = Math.round(Math.random() * 100);
        System.out.println(number);

        int[] numGrades = {2,3,4,5,6,9};
        var grades = List.of(2,3,4,5,6,9);
        System.out.println(grades);
        System.out.println(Arrays.toString(numGrades));

    }
}