package org.example;

import java.util.Objects;

public class  CustomQueue {

    private int length;
    private CustomNode first, last;

    public CustomQueue() {
        first = last = null;
    }

    public void push(int data) {
        CustomNode node = new CustomNode(data);
        if (isEmpty()) {
            first = node;
        } else {
            last.setNext(node);
        }
        last = node;
        length++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty queue");
        }
        int result = first.getData();
        first = first.getNext();
        length--;
        if (isEmpty()) {
            last = null;
        }
        return result;
    }

    public int getSmallestElem(){
        CustomNode tempNode = first;
        int val = tempNode.getData();
        while (tempNode != null) {
            if(tempNode.getData() < val){
                val = tempNode.getData();
            }
            tempNode = tempNode.getNext();
        }
        return val;
    }

    public int getSmallestElemPos(){
        CustomNode tempNode = first;
        int val = tempNode.getData();
        int position = 1;
        int counter = 1;
        while (tempNode != null) {
            counter++;
            if(tempNode.getData() < val){
                val = tempNode.getData();
                position = counter;
            }
            tempNode = tempNode.getNext();
        }
        return val;
    }
    public int getBiggestElem(){
        CustomNode tempNode = first;
        int val = tempNode.getData();
        while (tempNode != null) {
            if(tempNode.getData() > val){
                val = tempNode.getData();
            }
            tempNode = tempNode.getNext();
        }
        return val;
    }

    public int getBiggestElemPos(){
        CustomNode tempNode = first;
        int val = tempNode.getData();
        int position = 1;
        int counter = 1;
        while (tempNode != null) {
            counter++;
            if(tempNode.getData() > val){
                val = tempNode.getData();
                position = counter;
            }
            tempNode = tempNode.getNext();
        }
        return val;
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return first.getData();
    }

    public CustomNode search(int val) {
        CustomNode tempNode = first;
        while (tempNode != null) {
            if (tempNode.getData() == val) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void printData() {
        CustomNode tempNode = first;
        while (tempNode != null) {
            System.out.println(tempNode.getData() + " ");
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
