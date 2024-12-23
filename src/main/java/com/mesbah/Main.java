package com.mesbah;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        //list.printList();

        LinkedList.Node node1 = list.head.next;
        LinkedList.Node node2 = list.head.next.next.next;
        System.out.println("Printing Before reararngeList: ");
        list.printList();
        list.reararngeList(node1, node2);
        System.out.println("\nPrinting after reararngeList: ");
        list.printList();
    }
}