package com.example.java_practice.linkedlist_practice;

public class RemoveDuplicateFromSortedLinkedList {

    /*
    * Remove duplicate element from sorted Linked List
    * Input: LinkedList: 2->2->4->5
        Output: 2 4 5
    * */

    private static Node removeDuplicate(Node head) {
        //Node temp = head;
        Node current = head, next=head.next;
        while(next!=null) {
           if(current.data==next.data) {
               current.next = next.next;
           }
           next = next.next;
        }
        return head;
    }

    public static void main(String[] arg) {
    Node node = new Node(2);
    node.next = new Node(2);
    node.next.next = new Node(4);

    node.next.next.next = new Node(5);

    node = removeDuplicate(node);
    while(node != null) {
        System.out.println("value is "+node.data);
        node = node.next;
    }

    }
}
