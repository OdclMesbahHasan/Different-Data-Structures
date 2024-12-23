package com.mesbah;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node current;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            current = head;
            return;
        }
        current.next = newNode;
        current = current.next;
        //printList();
    }

    public void reararngeList(Node node1, Node node2) {
            if(node1 == null || node2 == null) {
                System.out.println("Invalid Nodes");
                return;
            }
            current = head;
            Node previousNodeOfNode1 = null;
            Node previousNodeOfNode2 = null;
            while (current.next != null) {
                if (current.next == node1) {
                    previousNodeOfNode1 = current;
                }
                if (current.next == node2) {
                    previousNodeOfNode2 = current;
                }
                current = current.next;
            }
            previousNodeOfNode1.next = node2;
            previousNodeOfNode2.next = node1;
        System.out.println("\nIn Middle:");
        printList();
            Node temp = node1.next;//3
        System.out.println("\n node1 next data:" + node1.next.data + "\n");
        System.out.println("\n node2 next data:" + node2.next.data + "\n");
            node1.next = node2.next;//5
            node2.next = temp;

    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;

        }
    }
}
