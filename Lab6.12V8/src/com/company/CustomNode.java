package com.company;

public class CustomNode {
    private Student value;
    private CustomNode prev;
    private CustomNode next;

    public CustomNode(Student value) {
        this.value = value;
    }

    public Student getValue() {
        return value;
    }

    public void setValue(Student value) {
        this.value = value;
    }

    public CustomNode getPrev() {
        return prev;
    }

    public void setPrev(CustomNode prev) {
        this.prev = prev;
    }

    public CustomNode getNext() {
        return next;
    }

    public void setNext(CustomNode next) {
        this.next = next;
    }
}
