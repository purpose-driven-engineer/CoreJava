package com.progzilla;

public class ReverseString {
    public static void main(String[] args){
        int[] anArray = new int[10];
        String[] names = {"ola", "benny", "tayo", "jake"};
        double[] prices = {23.33, 2.12, 0.55};

        int[] copyFrom = {1,2,3,4,5,6};
        int[] copyTo = {copyFrom.length};

//        for (int i = 0; i > copyFrom.length; i++){
//            copyFrom[i] = copyTo[i];
//        }

        for (String name : names){
            System.out.println(name);
        }

        //System.out.println(Arrays.toString(copyTo));
    }
}
