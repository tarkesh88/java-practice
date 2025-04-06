package com.example.java_practice.arrays_practice;

public class Count_Inversion {


    /*
    *Given an array of integers. Find the Inversion Count in the array.  Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum.
    * */
    static long inversionCount(long arr[]) {
        // Your Code Here
        int low =0;
        int high =1;
        int length = arr.length-1;
        int count =0;
        for(int i =0; i<length; i++) {
            while(high<=length) {
                if(arr[i]>arr[high] && i<high) {
                    count++;
                }
                high++;
            }
            high = i+1;
        }
        return count;
    }

    public static void main(String[] arg) {
        long[] arr = {2, 4, 1, 3, 5};
        System.out.println("result -> "+inversionCount(arr));
    }
}
