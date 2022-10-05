package com.brigelabz;

public class SmallestElementArray {

    public static void main(String[] args) {
        int[] arr = new int[]{ 5, 7,2, 8, 6};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest number in array:" + min);
    }

}

