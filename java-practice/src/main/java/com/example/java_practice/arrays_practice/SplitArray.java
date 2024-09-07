package com.example.java_practice.arrays_practice;

import com.example.java_practice.stream.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {

    //split the array with given size
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int chunkSize = 3;

        // Split the array into chunks
        List<int[]> chunks = splitArray(array, chunkSize);

        // Print the result
        for (int[] chunk : chunks) {
            System.out.println(Arrays.toString(chunk));
        }
    }

    public static List<int[]> splitArray(int[] array, int chunkSize) {
        List<int[]> chunks = new ArrayList<>();

        // Calculate the number of chunks
        int numberOfChunks = (int) Math.ceil((double) array.length / chunkSize);
        System.out.println("number of chunks ->"+numberOfChunks);
        for (int i = 0; i < numberOfChunks; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, array.length);
            System.out.println("start ->"+start +"   --- end ---> "+end);
            // Create chunk array
            int[] chunk = Arrays.copyOfRange(array, start, end);
            System.out.println("chunk ->"+chunk.toString());
            // Add chunk to the list
            chunks.add(chunk);
        }

        return chunks;
    }
}
