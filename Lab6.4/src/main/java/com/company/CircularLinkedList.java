package com.company;

public class CircularLinkedList {
    private CustomNode head = null;
    private CustomNode tail = null;

    public void addNode(int value) {
        CustomNode newNode = new CustomNode(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }

        tail = newNode;
        tail.setNext(head);
    }

    public int calculateQuantityOfValueUsed(Integer valueToCalc) {
        CustomNode current = head;
        int quantity = 0;

        do {
            if(current.getValue() == valueToCalc){
                quantity++;
            }
            current = current.getNext();
        } while (current != head);

        return quantity;
    }

    public void printList() {
        CustomNode current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Nodes of the circular linked list: ");
            do {
                System.out.print(" " + current.getValue());
                current = current.getNext();
            } while (current != head);
            System.out.println();
        }
    }

    //    V-8

    public void rearrangeNodesRec() {
        rearrangeNodes(head);
    }

    public CircularLinkedList rearrangeNodes(CustomNode node) {

        int tempVal = node.getValue();
        node.setValue(node.getNext().getValue());
        node.getNext().setValue(tempVal);

        node = node.getNext().getNext();
        if (node == head) return this;

        return rearrangeNodes(node);
    }

    public void rearrangeNodes() {
        CustomNode current = head;
        do {
            int tempVal = current.getValue();
            current.setValue(current.getNext().getValue());
            current.getNext().setValue(tempVal);

            current = current.getNext().getNext();
        } while (current != head && current != head.getNext());
    }

}
