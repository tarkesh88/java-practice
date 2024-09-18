package com.example.java_practice.arrays_practice;

import java.util.HashMap;
import java.util.Map;

public class BalancedArray {

     /*
     * Check if the given integer array is balanced or not.
Input is an array with +ve and -ve numbers. 
For every positive number there should be a corresponding matching negative number. 
Zeroes can be ignored. 
There can be duplicate numbers in the array.
Examples:
 
Balanced Array :- {1, 0, -3, 0,-1, 3, 0}
Balanced Array :- {5, 0, 1,-1, 3, -5, -3, 0}
Not Balanced Array :- {1,-1, 3, 7, 0, -7} Explanation : -3 is missing
Not Balanced Array :- {1, 2, -3}
Not Balanced Array :- {1, 1, -1}
Balanced Array :- {1, 1, -1, -1}
     * */
    public static void main(String[] arg) {
        int[] arr = {1, 2, -3};
        System.out.println("arr is balanced -->"+getBalancedArr(arr));

    }
    public static boolean getBalancedArr(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean result =false;
        for (int value: arr) {
            if(value!=0) {
                //System.out.println("value is "+value);
                if (map.containsKey(value)) {
                    int count = map.get(value);
                    count +=1;
                    map.put(value, count);
                    //System.out.println("increasing count "+count + "for value "+value);
                } else {
                    map.put(value, 1);
                    //System.out.println("adding first time in map "+value);
                }
            }
        }
        for(Map.Entry entry :map.entrySet()) {
            Integer key = (Integer) entry.getKey();
            Integer count = (Integer) entry.getValue();
            //System.out.println("positive key  "+key+"  count is "+ count);
            //System.out.println("negative key contains "+map.containsKey(-key));
            //System.out.println(" negative key count "+ map.get(-key));
            if(map.containsKey(-key)) {
                Integer negCount = map.get(-key);
                if(count == negCount) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
