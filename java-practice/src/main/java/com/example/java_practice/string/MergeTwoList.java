package com.example.java_practice.string;

import com.example.java_practice.linkedlist_practice.SingleLinkListNode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {

    public static void main(String[] args) {
        List<String> listA = List.of("A","B","D");
        List<String> listB = List.of("C","E","F");

        List<String> result = Stream.concat(listA.stream(), listB.stream()).sorted().collect(Collectors.toList());
        System.out.println("result is "+result);

    }
}
