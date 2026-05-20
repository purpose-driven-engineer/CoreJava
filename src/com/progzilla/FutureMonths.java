package com.progzilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// practicing switch statement

public class FutureMonths {

    int month;
    List<String> futureMonths = new ArrayList<>();

    public FutureMonths() {
        int month = 2;
        int year = 2021;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5: //Jan, Mar and May
            case 7: case 8: case 10: // Jul, Aug and October
            case 12: // Dec
                numDays = 31;
                break;
            case 4: case 6: // Apr and Jun
            case 9: case 11: // Sept and Nov
                numDays = 30;
                break;
            case 2: // Feb...and confirm leap year
                if ((year % 4 ==0) && !(year % 100 == 0) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
    public FutureMonths(int month){
        this.month = month;
        // another switch usage
        switch (month) {
            case 1:
                System.out.println(futureMonths.add("January"));
            case 2: futureMonths.add("February");
            case 3: futureMonths.add("March");
            case 4: futureMonths.add("April");
            case 5: futureMonths.add("May");
            case 6: futureMonths.add("June");
            case 7: futureMonths.add("July");
            case 8: futureMonths.add("August");
            case 9: futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
            break;
            default: break;
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int monthInt = scanner.nextInt();;

        FutureMonths future = new FutureMonths(monthInt);

    }
}
