package com.brigelabz;

public class ArrayOddPosition {
    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 4, 5, 6};
        System.out.println("Array Elements on even position:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1)
                System.out.println(arr[i]);
        }
    }
}
