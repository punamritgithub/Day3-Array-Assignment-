package com.brigelabz;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = new int[]{ 5, 7,2, 8, 6};
        int max= arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number in array:" + max);
    }

}

