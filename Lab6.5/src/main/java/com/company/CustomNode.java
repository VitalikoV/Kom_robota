package com.company;

import com.company.V8.CustomNodeV8;

public class CustomNode {
    private double data;
    private CustomNode next;
    CustomNode(double d){
        data = d;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public CustomNode getNext() {
        return next;
    }

    public void setNext(CustomNode next) {
        this.next = next;
    }
}
