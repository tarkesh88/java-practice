package com.example.java_practice.arrays_practice;

public class MergeSortedArray {


    public static void main(String[] arg) {

        int[] arr1 = {1,4,6,9};
        int[] arr2 = {2,3,5,8};
        int[] result = mergeSortedArray(arr1, arr2);
        for(int i =0; i<result.length; i++) {
            System.out.print(" "+result[i]);
        }
    }
    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = arr1.length+arr2.length-1;
        int count =0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[k];
        while (i < n1 && j < n2) {
            // Pick smaller of the two current elements and move ahead in the array of the picked element
            if (arr1[i] < arr2[j])
                result[count++] = arr1[i++];
            else
                result[count++] = arr2[j++];
        }

        // if there are remaining elements of the first array, move them
        while (i < n1 && count<k)
            result[count++] = arr1[i++];

        // Else if there are remaining elements of the second array, move them
        while (j < n2 && count < k)
            result[count++] = arr2[j++];
        return result;
    }

}
