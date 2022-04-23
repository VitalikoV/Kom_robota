package com.company;

public class CustomNode {
    private int data;
    private CustomNode next;
    CustomNode(int d){
        data = d;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CustomNode getNext() {
        return next;
    }

    public void setNext(CustomNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "CustomNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
