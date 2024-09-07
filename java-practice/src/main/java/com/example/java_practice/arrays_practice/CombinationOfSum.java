package com.example.java_practice.arrays_practice;

import com.example.java_practice.design_pattern.BillPughCamelToSnake;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CombinationOfSum {


    public static List<int[]> getCombinationOfSum(Integer[] arr, int k) {
        List<int[]> resultList = new ArrayList<>();
        for(int i=0; i<arr.length;i++) {
            int start =i;
            int end = arr.length-1;
            while(start<end && i!=end) {
                if(arr[i]+arr[end]<=k) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = end;
                    resultList.add(result);
                }
                end--;
            }
        }
        return resultList;
    }
    public static void main(String[] args) {

        Integer[] arr = {2,7,4,11,45,3,8};
        int k = 5;
        for(int[] arr1 : getCombinationOfSum(arr, k)){
            System.out.println("Combination is "+arr1);
        }
    }
}
