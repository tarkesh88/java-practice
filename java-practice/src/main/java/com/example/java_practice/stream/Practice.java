package com.example.java_practice.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {


    //Find the longest string in a list of strings using Java streams:
    private String getMaxLongestString() {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> longestString = strings
                .stream()
                .max(Comparator.comparingInt(String::length));
        return longestString.get();
    }

    private String getMinLongestString() {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> longestString = strings
                .stream()
                .min(Comparator.comparingInt(String::length));
        return longestString.get();
    }
    //Merge two sorted lists into a single sorted list using Java streams:
    private List<Integer> add2ListInShortedOrder() {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .collect(Collectors.toList());
        return mergedList;
    }

    //Find the kth smallest element in an array using Java streams:
    private int getKthSmallestNumber() {
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element
        int kthSmallest = Arrays.stream(array)
                .sorted()
                .skip(k - 1)
                .findFirst()
                .orElse(-1);
        return kthSmallest;
    }

    private int findMaxElementFromList() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        System.out.println("max length string is =====  "+practice.getMaxLongestString());
        System.out.println("man length string is =====  "+practice.getMinLongestString());
        System.out.println("man length string is =====  "+practice.add2ListInShortedOrder());
        System.out.println("kth element is =====  "+practice.getKthSmallestNumber());
        System.out.println("kth element is =====  "+practice.findMaxElementFromList());
    }

}
