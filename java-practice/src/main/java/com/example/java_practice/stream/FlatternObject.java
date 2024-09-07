package com.example.java_practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatternObject {

    public static void main(String[] args) {
        Object[] array = {1, 6, new Object[]{3, 4, new Object[]{5}, 2, 7}};
        Object[] array1 = {9,4, 5, new Object[]{3, 1, new Object[]{8}, 6, 7}};

        List<Object> flattenedList = flatten(array);
        //flattenedList.stream().sorted().collect(Collectors.toList());
        System.out.println("using stream api -> "+flattenedList.stream().sorted().collect(Collectors.toList()));

        List<Object> flattenedList1 = flattenWithOutStream(array1);
        System.out.println("without using stream api ->"+flattenedList1.stream().sorted().collect(Collectors.toList()));
    }

    //flatten object using stream api
    public static List<Object> flatten(Object[] array) {

        return Arrays.stream(array).flatMap(element -> {
                    if (element instanceof Object[]) {
                        // Recursively flatten sub-array
                        return flatten((Object[]) element).stream();
                    } else {
                        // Wrap non-array element in a stream
                        return Stream.of(element);
                    }
                })
                .collect(Collectors.toList());
    }

    public static List<Object> flattenWithOutStream(Object[] array) {
        List<Object> result = new ArrayList<>();
        for(Object element : array) {
            if(element instanceof Object[]) {
                result.addAll(flattenWithOutStream((Object[] )element));
            } else {
                result.add(element);
            }
        }
        return result;
    }

}
