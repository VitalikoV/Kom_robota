package com.company;

public class CustomNode {
    private CellularUser data;
    private CustomNode next;
    CustomNode(CellularUser d){
        data = d;
    }

    public CellularUser getData() {
        return data;
    }

    public void setData(CellularUser data) {
        this.data = data;
    }

    public CustomNode getNext() {
        return next;
    }

    public void setNext(CustomNode next) {
        this.next = next;
    }
}
