package org.example;

import java.util.Objects;

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

    public CustomNode searchByVal(int value){
        CustomNode current = head;
        while (current != null) {
            if(current.getValue() == value){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public CustomTwoLinkedList getSimilarElements(){
        CustomTwoLinkedList list = new CustomTwoLinkedList();
        CustomNode current = head;
        if (head == null) {
            return list;
        }
        while (current != null) {
            if(current.getNext() != null &&  current.getPrev() != null &&
                current.getValue() == current.getNext().getValue()
                && current.getValue() == current.getPrev().getValue()) {
                list.addElement(current.getValue());
            }
            current = current.getNext();
        }

        return list;
    }

    public void deleteMinimalVal(){
        if(head == null) return;
        CustomNode current = head;

        int min = head.getValue();

        while (current != null) {
            if(current.getValue() < min){
                min = current.getValue();
            }
            current = current.getNext();
        }
        delete(min);
    }


    public void delete(int value){
        if(head == null) return;

        CustomNode current = head;
        while (current != null) {
            if(current.getValue() == value){
                if (head == current) {
                    head = current.getNext();
                }

                if(current.getNext() != null) {
                    current.getNext().setPrev(current.getPrev());
                }

                if(current.getPrev() != null){
                    current.getPrev().setNext(current.getNext());
                }
            }
            current = current.getNext();
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
            System.out.println(current.getValue());
            current = current.getNext();
        }
        System.out.println();
    }

    public CustomTwoLinkedList clone() {
        CustomTwoLinkedList list = new CustomTwoLinkedList();
        CustomNode current = head;
        if (head == null) {
            System.out.println("List is empty");
            return list;
        }
        while (current != null) {
            list.addElement(current.getValue());
            current = current.getNext();
        }

        return list;
    }

    public CustomNode getHead() {
        return head;
    }
}
