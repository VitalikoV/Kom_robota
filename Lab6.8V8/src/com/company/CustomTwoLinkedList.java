package com.company;

import java.util.Objects;

public class CustomTwoLinkedList {
    private CustomNode head = null;
    private CustomNode lastElem = null;

    public void addElement(Book element) {
        CustomNode node = new CustomNode(element);
        if (head == null) {
            head = node;
            lastElem = node;
        } else {
            lastElem.next = node;
            node.prev = lastElem;
            lastElem = node;
        }
    }

    public Book searchByName(String name){
        CustomNode current = head;
        while (current != null) {
            if(Objects.equals(current.value.getName(), name)){
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void delete(String name){
        if(head == null) return;

        CustomNode current = head;
        while (current != null) {
            if(Objects.equals(current.value.getName(), name)){
                if (head == current) {
                    head = current.next;
                }

                if(current.next != null) {
                    current.next.prev = current.prev;
                }

                if(current.prev != null){
                    current.prev.next = current.next;
                }
            }
            current = current.next;
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
            System.out.println(current.value.toString());
            current = current.next;
        }
        System.out.println();
    }

    public CustomNode getHead() {
        return head;
    }
}
