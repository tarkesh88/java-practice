package com.example.java_practice.design_pattern;

import com.example.java_practice.stream.Practice;

public class SlidWindowPattern {


    static int maxSum(int[] arr, int k) {
        int n = arr.length;
        if(n<k) {
            return -1;
        }

        int windowSum =0;
        for(int i=0; i<k;i++) {
            windowSum = windowSum+arr[i];
        }
        int maxSum = windowSum;
        for(int i=k;i<n;i++) {
            windowSum = windowSum+(arr[i]-arr[i-k]);
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int k=3;
        int[] arr={16, 12, 9, 19, 11, 8};
        System.out.println("max sum is "+maxSum(arr,k));
    }
}
