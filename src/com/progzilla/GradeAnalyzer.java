package com.progzilla;

import java.util.Arrays;

public class GradeAnalyzer {
    public static void main(String[] args){
        /*
        Generate random grades for a number of students using Math.random().
        Store them in an array.
        Calculate average, highest, and lowest grades.
        Use String.format() to format results.
         */
        int numberOfStudents = 10; //
        double[] gradeArray = new double[numberOfStudents];

        // Generate and populate
        for (int i = 0; i < gradeArray.length; i++){
            gradeArray[i] = Math.round(Math.random() * 100);
        }
        System.out.println("Students Grades: " + Arrays.toString(gradeArray));

        //Average of the grades
        double sumOfGrades = 0;
        double min = gradeArray[0];
        double max = gradeArray[0];

        for (double grade : gradeArray){
            sumOfGrades += grade;
        }
        double average = sumOfGrades / gradeArray.length;
        System.out.println("Average: " + average);

        //Minimum Grades

    }
}
