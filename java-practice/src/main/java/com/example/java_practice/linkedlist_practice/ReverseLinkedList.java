package com.example.java_practice.linkedlist_practice;

public class ReverseLinkedList {

    static SingleLinkListNode reverseList(SingleLinkListNode node) {

        SingleLinkListNode curt = node, prev = null, next;
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
        SingleLinkListNode head = new SingleLinkListNode(10);
        head.next = new SingleLinkListNode(20);
        head.next.next = new SingleLinkListNode(30);
        head.next.next.next = new SingleLinkListNode(40);
        head.next.next.next.next = new SingleLinkListNode(50);
        head.next.next.next.next.next = new SingleLinkListNode(60);

        head = reverseList(head);
        while (head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
    }
}
