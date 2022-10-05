package com.brigelabz;

public class SecondLargestNumber {

    static int SecondLargest(int[] arr) {

        int firstNumber = 0;
        int SecondNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstNumber) {
                SecondNumber = firstNumber;
                firstNumber = arr[i];
            } else if (arr[i] > SecondNumber && arr[i] != firstNumber) {
                SecondNumber = arr[i];
            }
        }
        return SecondNumber;
    }

        public static void main(String args[]){
            int[]a = {12, 22, 34, 89, 50};
            int n=a.length;
            int answer = SecondLargest(a);
            System.out.println(""+answer);

        }
    }











