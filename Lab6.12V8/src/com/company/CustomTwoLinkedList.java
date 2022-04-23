package com.company;

import java.util.Objects;

public class CustomTwoLinkedList {
    private CustomNode head = null;
    private CustomNode lastElem = null;

    public void addElement(Student element) {
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

    public Student searchByLastName(String name){
        CustomNode current = head;
        while (current != null) {
            if(Objects.equals(current.getValue().getLastName(), name)){
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public void delete(String lastname){
        if(head == null) return;

        CustomNode current = head;
        while (current != null) {
            if(Objects.equals(current.getValue().getLastName(), lastname)){
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
            System.out.println(current.getValue().toString());
            current = current.getNext();
        }
        System.out.println();
    }

    public CustomNode getHead() {
        return head;
    }
}
