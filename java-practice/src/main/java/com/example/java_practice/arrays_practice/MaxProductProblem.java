package com.example.java_practice.arrays_practice;

import java.util.Arrays;
import java.util.List;

public class MaxProductProblem {

    public static void main(String[] args) {
        int[] array = {1, -10, 2, -3, 5, -2};
        int maxProduct = 0;
        int[] result = new int[2];

        // Print the result
        for (int i=0; i<array.length; i++) {
            //System.out.println("a[i] is "+array[i] );
            int right = array.length-1;
            while (i<right){
                int product = array[i]*array[right];
                if(product>0 && maxProduct<product) {
                    maxProduct = product;
                    result[0] = array[i];
                    result[1] = array[right];
                    right--;
                } else {
                    right--;
                }
            }
        }
        System.out.println("pair is "+result[0] +", "+result[1]);
    }
}
