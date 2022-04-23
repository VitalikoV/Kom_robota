package com.company;

import java.util.ArrayList;

public class CustomTwoLinkedList {
    private CustomNode head = null;
    private CustomNode lastElem = null;

    public void addElement(int element) {
        CustomNode node = new CustomNode(element);
        if (head == null) {
            head = node;
            lastElem = node;
        } else {
            lastElem.setNext(node);
            node.setPrev(lastElem);
            lastElem = node;
        }
    }


    public Boolean checkSimilarityOfLists(CustomTwoLinkedList listToCompare) {
        return checkSimilarityOfListsRecursively(listToCompare, head);
    }

    private Boolean checkSimilarityOfListsRecursively(CustomTwoLinkedList listToCompare, CustomNode currentNode) {

        if (listToCompare.head == null && head == null) {
            return true;
        }

        if (listToCompare.head == null || head == null) {
            return false;
        }

        if (currentNode == null) {
            return true;
        }

        CustomNode current = listToCompare.head;
        Boolean isInTheList = false;
        while (current != null) {
            if (currentNode.getValue() == current.getValue()) {
                isInTheList = true;
            }
            current = current.getNext();
        }

        if (isInTheList) {
            return checkSimilarityOfListsRecursively(listToCompare, currentNode.getNext());
        } else {
            return false;
        }
    }

    public void printNodes() {
        CustomNode current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }


    //    V-8
    public CustomTwoLinkedList checkNearDuplicates() {
        CustomNode current = head;
        CustomTwoLinkedList list = new CustomTwoLinkedList();

        while (current != null) {
            if (current.getNext() != null && current.getValue() == current.getNext().getValue()) {
                list.addElement(current.getValue());
            }
            current = current.getNext();
        }

        return list;
    }

    public CustomTwoLinkedList checkNearDuplicatesRecursively() {

        return checkNearDuplicates(new CustomTwoLinkedList(), head);
    }

    public CustomTwoLinkedList checkNearDuplicates(CustomTwoLinkedList list, CustomNode node) {
        if (node == null) return list;

        if (node.getNext() != null && node.getValue() == node.getNext().getValue()) {
            list.addElement(node.getValue());
        }

        return checkNearDuplicates(list, node.getNext());
    }
}
