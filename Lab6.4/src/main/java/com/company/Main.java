package com.company;

public class Main {

    public static void main(String[] args) {
	    CircularLinkedList list = new CircularLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(5);
        list.addNode(3);
        list.addNode(5);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(1);

        list.printList();

        System.out.println("Quantity of number 1 was used: " + list.calculateQuantityOfValueUsed(1));
        System.out.println("Quantity of number 1 was used: " + list.calculateQuantityOfValueUsed(5));

        //V-8
        System.out.println();
        list.printList();

        list.rearrangeNodes();

        list.printList();

        list.rearrangeNodes();

        list.printList();

    }
}
