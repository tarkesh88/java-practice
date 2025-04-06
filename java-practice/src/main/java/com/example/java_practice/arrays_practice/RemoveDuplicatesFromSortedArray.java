package com.example.java_practice.arrays_practice;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

    /******************************************************************************

     Given a sorted array arr[] of size N, the task is to remove the duplicate elements from the array.

     Examples:

     Input: arr[] = {2, 2}
     Output: arr[] = {2,null}
     Explanation: All the elements are 2, So only keep one instance of 2.

     Input: arr[] = {1, 2, 2, 3, 4, 4 }
     Output: arr[] = {1, 2, 3, 4,null,null}

     *******************************************************************************/

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;

        // removeDuplicates() returns new size of array
        removeDuplicates(arr, n);
        //System.out.print( "after removeDuplicates method ");
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    static int removeDuplicates(int arr[], int n){
        HashSet<Integer> maps = new HashSet<>();
        int count =0;
        for(int i=0; i<n; i++) {
            if(maps.contains(Integer.valueOf(arr[i]))) {
                arr[i] = 0;

            } else {
                maps.add(Integer.valueOf(arr[i]));
            }

            if (arr[i] != 0)
                arr[count++] = arr[i];

        }
        while (count < arr.length)
            arr[count++] = 0;
        //System.out.print( "after  loop ");
        return 0;

    }

}
