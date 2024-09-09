package com.example.java_practice.linkedlist_practice;

import java.util.HashSet;
import java.util.Set;

public class CheckLoopInList {


    static boolean detectLoop(Node node) {

        Set<Node> st = new HashSet<>();
        while(node!=null) {
            if(st.contains(node)) {
                return true;
            }
            st.add(node);
            node = node.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
