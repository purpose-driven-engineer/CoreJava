package com.progzilla;

import java.util.Arrays;

import static java.lang.System.*;

public class ArrayCopier {
    public static void main(String[] args){

        /*
        Copy an array of numbers into empty array
         */

        int[] copyFrom = {1, 2, 3, 4, 5, 6};
        int[] copyTo = new int[copyFrom.length];

        // beginner-level method: for loop
        for (int i = 0; i < copyTo.length; i++)
                copyTo[i] = copyFrom[i];
        System.out.println(Arrays.toString(copyTo));

        // concise method: copyOf
        int[] copyToArray = Arrays.copyOf(copyFrom, 6);
        System.out.println(Arrays.toString(copyToArray));

        // efficient method: arraycopy
        System.arraycopy(copyFrom, 0, copyTo, 0, copyTo.length);
        System.out.println(Arrays.toString(copyTo));
    }
}
