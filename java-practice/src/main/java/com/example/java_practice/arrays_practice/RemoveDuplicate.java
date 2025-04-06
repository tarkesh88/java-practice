package com.example.java_practice.arrays_practice;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] arr = {2,2,2,2,2,2};
        System.out.println("size of array is -- "+removeDuplicates(arr));

        int[] arr1 = {1,2,2,3,4,4,5};
        System.out.println("size of array is -- "+removeDuplicates(arr1));

        String[] str = {"tar", "TAR", "kesh","tar"};
        System.out.println("size of array is -- "+removeDuplicatesString(str));

    }

    public static int  removeDuplicates(int[] arr) {
        // Code Here
        return Arrays.stream(arr).distinct().toArray().length;
    }

    public static int  removeDuplicatesString(String[] arr) {
        // Code Here
        return Arrays.stream(arr).distinct().toArray().length;
    }
}
