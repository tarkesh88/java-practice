package com.example.java_practice.arrays_practice;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumber {

    static void getSumOfTwoNumber( int[] nums, int target){
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0;i<nums.length; i++){

            if (map.containsKey(target - nums[i]))
            {
                System.out.println("Pair found (%d, %d)"+nums[map.get(target - nums[i])]+","+ nums[i]);
                //return;
            }

            // store index of the current element in the map
            map.put(nums[i], i);
        }
    }

    public static void main(String[] args) {
        int[] arr =  { 8, 7, 2, 5, 3, 1 };
        int target = 10;
        getSumOfTwoNumber(arr, target);
    }

}
