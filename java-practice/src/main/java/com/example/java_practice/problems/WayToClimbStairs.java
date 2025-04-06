package com.example.java_practice.problems;

public class WayToClimbStairs {

    /*
    Zinnia
    * You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps.
    *  In how many distinct ways can you climb to the top?
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
    * */

    /*
    * 5
    * 2,2,1 --> 1,2,2 --> 2,1,2, 2,2,1
    * 2,1,1,1 --
    * 1,1,1,1,1,1
    * */

    private static int calculateSteps(int n) {
        // n=1 approach one
        if(n<0) {
            return 0;
        }else if(n==0){
            return 1;
        } else {
            return calculateSteps(n-1) + calculateSteps(n-2);
        }

        // approach 2

    }

    public static void main(String[] arg) {
        System.out.println("number of ways are : "+calculateSteps(5));
    }
}
