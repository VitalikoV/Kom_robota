package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.addElement(1);
        linkedList.addElement(2);
        linkedList.addElement(3);
        linkedList.addElement(3);
        linkedList.addElement(2);

        linkedList.printList();

//        linkedList.deleteElement(2);
//
//        linkedList.printList();
//
//        linkedList.deleteElementRecursively(3);

        linkedList.deleteNextElementRecursively(2);

        linkedList.printList();
    }
}
