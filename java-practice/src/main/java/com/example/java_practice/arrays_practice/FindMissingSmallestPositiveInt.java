package com.example.java_practice.arrays_practice;

import java.util.Arrays;

public class FindMissingSmallestPositiveInt {

    static int missingNumber(int arr[], int size) {
        // Your code here
        Arrays.sort(arr);
        int lastInput = arr[arr.length-1];
        int sum = lastInput*(lastInput+1)/2;
        int arrSum=0;
        for(int i =0; i<size; i++) {
            if(arr[i]>0) {
                arrSum+= arr[i];
            }
        }
        int diff = sum-arrSum;
        if(diff>0) {
            return diff;
        }
        return ++lastInput;

    }
    public static void main(String[] arg) {
        int[] arr = {-10,-22,3,0,1};
        System.out.println("Missing Number is -> "+missingNumber(arr, 5));
    }
}
