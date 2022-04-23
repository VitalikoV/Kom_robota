package org.example.customList;

import org.example.CustomNode;
import org.example.File;

import java.util.Objects;

public class CustomLinkedList {
    private CustomListNode head;

    public void addElement(File newData) {
        CustomListNode newCustomNode = new CustomListNode(newData);
        newCustomNode.setNext(head);
        head = newCustomNode;
    }

    public void deleteElement(String element){
        CustomListNode temp = head;
        CustomListNode prev = null;
        while (temp != null && Objects.equals(temp.getData().getName(), element)) {
            head = temp.getNext();
            temp = head;
        }

        while (temp != null) {
            while (temp != null && !Objects.equals(temp.getData().getName(), element)) {
                prev = temp;
                temp = temp.getNext();
            }

            if (temp == null) return;

            prev.setNext(temp.getNext());
            temp = prev.getNext();
        }
    }

    public void deleteElementRecursively(String element){
        deleteElement(head, null, element);
    }

    CustomLinkedList deleteElement(CustomListNode node, CustomListNode prev, String element){
        if (node == null) return this;

        if (Objects.equals(node.getData().getName(), element) && head == node &&  node.getNext() == null) {
            head = null;
            return this;
        }
        CustomListNode n = node.getNext(), p = node;

        if (Objects.equals(node.getData().getName(), element) && head == node) {
            head = head.getNext();
            n = head;
            p = null;
        } else if (Objects.equals(node.getData().getName(), element)) {
            prev.setNext(node.getNext());
            n = prev;
            p = null;
        }
        return deleteElement(n, p, element);
    }

    public void deleteNextElementRecursively(String element){
        deleteNextElement(head, null, element);
    }

    CustomLinkedList deleteNextElement(CustomListNode node, CustomListNode prev, String element){
        if (node == null) return this;

        if (Objects.equals(node.getData().getName(), element) && head == node &&  node.getNext() == null) {
            //head = null;
            return this;
        }
        CustomListNode n = node.getNext(), p = node;

        if (Objects.equals(node.getData().getName(), element)) {
            System.out.println("head: " + head);
            node.setNext(node.getNext().getNext());
            System.out.println("head.getNext().getNext() : " + head);
            n = node.getNext();
            p = null;
        }
        return deleteNextElement(n, p, element);
    }

    public void printList() {
        CustomListNode tCustomNode = head;
        while (tCustomNode != null){
            System.out.print(tCustomNode.getData() + " ");
            tCustomNode = tCustomNode.getNext();
        }
        System.out.println();
    }

    public CustomListNode getHead() {
        return head;
    }

    public void setHead(CustomListNode head) {
        this.head = head;
    }
}
