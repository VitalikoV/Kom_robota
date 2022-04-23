package com.company;

import java.util.Objects;

public class  CustomQueue {

    private int length;
    private CustomNode first, last;

    public CustomQueue() {
        first = last = null;
    }

    public void push(CellularUser data) {
        CustomNode node = new CustomNode(data);
        if (isEmpty()) {
            first = node;
        } else {
            last.setNext(node);
        }
        last = node;
        length++;
    }

    public CellularUser pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty queue");
        }
        CellularUser result = first.getData();
        first = first.getNext();
        length--;
        if (isEmpty()) {
            last = null;
        }
        return result;
    }

    public CellularUser getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return first.getData();
    }

    public CellularUser search(String lastName, String phoneNumber) {
        CustomNode tempNode = first;
        while (tempNode != null) {
            if (Objects.equals(tempNode.getData().getLastName(), lastName)
                    && Objects.equals(tempNode.getData().getPhoneNumber(), phoneNumber)) {
                return tempNode.getData();
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void printData() {
        CustomNode tempNode = first;
        while (tempNode != null) {
            System.out.println(tempNode.getData().toString() + " ");
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }
}
