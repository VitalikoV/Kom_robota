package com.company;

public class CustomLinkedList {
    private CustomNode head;

    public void addElement(int newData) {
        CustomNode newCustomNode = new CustomNode(newData);
        newCustomNode.setNext(head);
        head = newCustomNode;
    }

    public void deleteElement(int element){
        CustomNode temp = head;
        CustomNode prev = null;
        while (temp != null && temp.getData() == element) {
            head = temp.getNext();
            temp = head;
        }

        while (temp != null) {
            while (temp != null && temp.getData() != element) {
                prev = temp;
                temp = temp.getNext();
            }

            if (temp == null) return;

            prev.setNext(temp.getNext());
            temp = prev.getNext();
        }
    }

    public void deleteElementRecursively(int element){
        deleteElement(head, null, element);
    }

    CustomLinkedList deleteElement(CustomNode node, CustomNode prev, int element){
        if (node == null) return this;

        if (node.getData() == element && head == node &&  node.getNext() == null) {
            head = null;
            return this;
        }
        CustomNode n = node.getNext(), p = node;

        if (node.getData() == element && head == node) {
            head = head.getNext();
            n = head;
            p = null;
        } else if (node.getData() == element) {
            prev.setNext(node.getNext());
            n = prev;
            p = null;
        }
        return deleteElement(n, p, element);
    }

    public void deleteNextElementRecursively(int element){
        deleteNextElement(head, null, element);
    }

    CustomLinkedList deleteNextElement(CustomNode node, CustomNode prev, int element){
        if (node == null) return this;

        if (node.getData() == element && head == node &&  node.getNext() == null) {
            //head = null;
            return this;
        }
        CustomNode n = node.getNext(), p = node;

        if (node.getData() == element) {
            System.out.println("head: " + head);
            node.setNext(node.getNext().getNext());
            System.out.println("head.getNext().getNext() : " + head);
            n = node.getNext();
            p = null;
        }
        return deleteNextElement(n, p, element);
    }

    public void printList() {
        CustomNode tCustomNode = head;
        while (tCustomNode != null){
            System.out.print(tCustomNode.getData() + " ");
            tCustomNode = tCustomNode.getNext();
        }
        System.out.println();
    }

    public CustomNode getHead() {
        return head;
    }

    public void setHead(CustomNode head) {
        this.head = head;
    }
}
