package com.example.java_practice.integer_operation;

public class SumOfConsecutiveNumber {

    static long process(long input) {
        long count = 0;
        for (long j = 2; j < input/ 2; j++) {
            long temp = (j * (j + 1)) / 2;
            if (temp > input) {
                break;
            }

            if ((input- temp) % j == 0) {
                System.out.println("temp is =====  "+temp);
                System.out.println("j is =====  "+j);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        long ret = process(15);
        System.out.println("Ans is =====  "+(ret>0 ? ret : 0));

    }
}
