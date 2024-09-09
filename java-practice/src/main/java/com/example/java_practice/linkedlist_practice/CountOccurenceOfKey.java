package com.example.java_practice.linkedlist_practice;


public class CountOccurenceOfKey {

    static int getOccurrenceCount(Node node, int key) {
        int count = 0;
        while(node!=null) {
            if(node.data==key) {
                count++;
            }
            node = node.next;
        }
        return count;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(10);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        System.out.println("occurrences is -> "+getOccurrenceCount(head, 10));
    }
}
