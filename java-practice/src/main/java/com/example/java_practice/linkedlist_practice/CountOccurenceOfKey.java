package com.example.java_practice.linkedlist_practice;


public class CountOccurenceOfKey {

    static int getOccurrenceCount(SingleLinkListNode node, int key) {
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

        SingleLinkListNode head = new SingleLinkListNode(10);
        head.next = new SingleLinkListNode(20);
        head.next.next = new SingleLinkListNode(10);
        head.next.next.next = new SingleLinkListNode(10);
        head.next.next.next.next = new SingleLinkListNode(50);
        head.next.next.next.next.next = new SingleLinkListNode(60);
        System.out.println("occurrences is -> "+getOccurrenceCount(head, 10));
    }
}
