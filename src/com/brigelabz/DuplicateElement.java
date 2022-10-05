package com.brigelabz;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[]=new int[]{3,5,4,3,2,2,1};
        int i=0;
        for( i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    System.out.println(arr[j]+"");
                }
            }
        }
    }
}
