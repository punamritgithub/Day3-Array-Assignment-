package com.brigelabz;

import java.util.Scanner;

public class AscendingElementArray {
    public static void main(String[] args){

        int arr[]=new int[]{3,7,1,7,4};
        int temp=0;
        System.out.println("Elements of Array:");

        for(int i=0;i< arr.length;i++) {
            System.out.println(arr[i]+"");
        }
        for(int i=0;i< arr.length;i++) {
           for(int j=i+1;j< arr.length;j++) {
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }

        }
        System.out.println();
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
}
