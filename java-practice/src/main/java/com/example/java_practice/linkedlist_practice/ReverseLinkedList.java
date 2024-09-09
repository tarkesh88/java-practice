package com.example.java_practice.linkedlist_practice;

public class ReverseLinkedList {

    static Node reverseList(Node node) {

        Node curt = node, prev = null, next;
        while(curt!= null) {
            next = curt.next;
            curt.next = prev;
            prev = curt;
            curt = next;
        }
        return prev;
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

        head = reverseList(head);
        while (head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
    }
}
