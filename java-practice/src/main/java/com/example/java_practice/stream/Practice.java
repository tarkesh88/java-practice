package com.example.java_practice.stream;

import java.util.*;
import java.util.function.Function;
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
        List<Integer> list2 = Arrays.asList(2, 4, 6, 7,8, 10);
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
                .sorted().distinct()
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

    private static void findMinElementFromList() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int min =  myList.stream().min(Integer::compare).get();
        System.out.println("min is "+min);
        //return max;
    }

    private static void findMultipleOf5FromList() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> result = myList.stream().filter(i->i%5==0).collect(Collectors.toList());
        System.out.println("multiple of 5 result is "+result);
        //return max;
    }

    static void getFrequencyOfElement(){
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        //List<String> words = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> wordFrequency = words
                .stream().sorted(Collections.reverseOrder())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(Map.Entry<String, Long> entry : wordFrequency.entrySet()) {
            System.out.println("Frequency for "+entry.getKey() +" is "+entry.getValue());
        }
    }

    private static void removeDuplicateFromList() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("old list "+myList);
        List<Integer> resultList =  myList.stream().distinct().collect(Collectors.toList());
        System.out.println("new list "+resultList);
    }

    private static void joinString() {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane");
        String concatenatedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("new list is ---> "+concatenatedNames);
    }

    private static void findSumOfList() {
        List<Integer> list = new ArrayList<Integer>();

        // add elements to the list
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int result = list.stream().filter(l->l>0).mapToInt(i->i).sum();
        System.out.println("new list is ---> "+result);
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        //System.out.println("max length string is =====  "+practice.getMaxLongestString());
        //System.out.println("man length string is =====  "+practice.getMinLongestString());
        //System.out.println("add 2 list into a single list =====  "+practice.add2ListInShortedOrder());
        //System.out.println("kth smallest element is =====  "+practice.getKthSmallestNumber());
        //System.out.println("max element from string is =====  "+practice.findMaxElementFromList());
        //removeDuplicateFromList();
        //getFrequencyOfElement();
        //findMinElementFromList();
        //findMultipleOf5FromList();
        //joinString();
        findSumOfList();
    }

}
