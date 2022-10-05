package com.brigelabz;

public class ReverseOrderElement {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 30, 40, 50};
        int i = 0;
        int j = arr.length - 1;
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Printing an Array after reverse: ");
        for (j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

}