package com.progzilla;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args){

        /*
        Copy an array of numbers into empty array
         */
        //... still in progress

        int[] copyFrom = {1,2,3,4,5,6};
        int[] copyTo = {copyFrom.length};

        for (int i = 0; i > copyFrom.length; i++){
            copyFrom[i] = copyTo[i];
        }

        // play with enhanced loop
        for (String name : names){
            System.out.println(name);
        }

        System.out.println(Arrays.toString(copyTo));
    }
}
