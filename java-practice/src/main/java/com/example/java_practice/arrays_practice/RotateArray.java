package com.example.java_practice.arrays_practice;

public class RotateArray {

    /*
    * problem:- Rotate an array to the left or right direction by count k.

Input :- Array = [1,2,3,4,5,6,7], direction = left, k = 1
Output :- Array = [2,3,4,5,6,7,1]

Input :- Array = [1,2,3,4,5,6,7], direction = left, k = 2
Output :- Array = [3,4,5,6,7,1,2]

Input :- Array = [1,2,3,4,5,6,7], direction = left, k = 8
Output :- Array = [2,3,4,5,6,7,1]

Input :- Array = [1,2,3,4,5,6,7], direction = right, k = 3
Output :- Array = [5,6,7,1,2,3,4]
*

Input :- Array = [1,2,3,4,5,6,7], direction = right, k = 1
Output :- Array = [7,1,2,3,4,5,6]
* */

    public static void main(String[] arg){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 8;
        String direction ="left";
        rotateTheArr(arr, k, direction);

        int[] arr1 = {1,2,3,4,5,6,7};
        int k1 = 3;
        String direction1 ="right";
        rotateTheArr(arr1, k1, direction1);
    }

    public static void rotateTheArr(int[] arr, int k, String direction) {
        System.out.println(" ");
        System.out.print("given array  -> ");
        for(int i : arr) {
            System.out.print(i);
        }
        if(direction.equalsIgnoreCase("left")) {
            leftRotate(arr, k);
        } else if (direction.equalsIgnoreCase("right")) {
            rightRotate(arr, k);
        }
        System.out.println(" ");
        System.out.print("sifted array  -->   ");
        for(int i : arr) {
            System.out.print(i);
        }
    }

    static void leftRotate(int[] arr, int k) {
        int length = arr.length;
        if(k>length) {
            k = k-length;
        }
        int[] temp = new int[length];
        int count =0;
        for(int i =0; i<length; i++) {
            temp[i] = arr[i];
            if(i<k)
            arr[i] = arr[length-k+i];
            else {
                arr[i] = temp[count];
                count+=1;
            }
        }
    }

    static void rightRotate(int[] arr, int k){
        int length = arr.length;
        if(k>length) {
            k = k-length;
        }
        int[] temp = new int[length];
        int count =0;
        for(int i =0; i<length; i++) {
            temp[i] = arr[i];
            //System.out.println("temp[i]  -- "+temp[i]+" value of i is --> "+i);
            if(i<k)
                arr[i] = arr[length-k+i];
            else {
                arr[i] = temp[count];
                // System.out.println("temp[count]  -- "+temp[count]+" value of count is --> "+count);
                count+=1;
            }
        }
    }


}
