package com.example.java_practice.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramsChallenge {

    static boolean isAnagram2(String a, String b) {
        // Complete the functionn
        char[] achar = a.toLowerCase().toCharArray();
        char[] bchar = b.toLowerCase().toCharArray();
        Arrays.sort(achar);
        Arrays.sort(bchar);
        return Arrays.equals(achar, bchar);
    }


    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean status = false;
        if (a.length() == b.length()) {
            Map<String, Integer> aMap = getFreq(a.toLowerCase().toCharArray());
            Map<String, Integer> bMap = getFreq(b.toLowerCase().toCharArray());
            status = true;
            for (Map.Entry<String, Integer> entry : aMap.entrySet()) {
                if (!(bMap.containsKey(entry.getKey()) && bMap.get(entry.getKey()) == entry.getValue())) {
                    status = false;
                    break;
                }
            }
        } else
            return false;

        return status;
    }

    static Map getFreq(char[] A) {
        Map aMap = new HashMap();
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = i; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            aMap.put(A[i], count);
        }
        return aMap;
    }

    public static void main(String[] args) {
        boolean ret = isAnagram2("listen", "silent");
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
