package com.example.java_practice.linkedlist_practice;

public class MergeTwoSortedLinkedList {


    static Node mergeLists(Node a, Node b) {
        if(a ==null) return b;
        if (b==null) return a;
        // Head and Tail of the merged list
        Node head = null;
        Node tail = null;

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
        Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(8);
        a.next.next.next = new Node(9);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);
        Node res = mergeLists(a, b);
        System.out.println("Merged Linked List is:");
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        }
    }
}
