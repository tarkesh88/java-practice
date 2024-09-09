package com.example.java_practice.linkedlist_practice;


public class FindMiddleOfList {

    static int getLength(Node head) {

        int length =0;
        while(head!= null) {
            length++;
            head = head.next;
        }
        return length;
    }
    static int getMiddle(Node head) {
        int length = getLength(head);
        int middle = length/2;
        while(middle>0) {
            head = head.next;
            middle--;
        }

        return head.data;
    }
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(getMiddle(head));
    }
}
