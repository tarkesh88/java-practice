package com.example.java_practice.linkedlist_practice;

import com.example.java_practice.stream.Practice;

public class MergeTwoSortedLinkedList {


    static SingleLinkListNode mergeLists(SingleLinkListNode a, SingleLinkListNode b) {
        if(a ==null) return b;
        if (b==null) return a;
        // Head and Tail of the merged list
        SingleLinkListNode head = null;
        SingleLinkListNode tail = null;

        // Initialize the head and tail pointers
        if (a.data <= b.data) {
            head = tail = a;
            a = a.next;
        } else {
            head = tail = b;
            b = b.next;
        }

        // Merge the remaining nodes
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        SingleLinkListNode a = new SingleLinkListNode(2);
        a.next = new SingleLinkListNode(4);
        a.next.next = new SingleLinkListNode(8);
        a.next.next.next = new SingleLinkListNode(9);

        SingleLinkListNode b = new SingleLinkListNode(1);
        b.next = new SingleLinkListNode(3);
        b.next.next = new SingleLinkListNode(8);
        b.next.next.next = new SingleLinkListNode(10);
        SingleLinkListNode res = mergeLists(a, b);
        System.out.println("Merged Linked List is:");
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        }
    }
}
