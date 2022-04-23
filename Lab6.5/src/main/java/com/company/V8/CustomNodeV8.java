package com.company.V8;

public class CustomNodeV8 {
    private char data;
    private CustomNodeV8 next;
    CustomNodeV8(char d){
        data = d;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public CustomNodeV8 getNext() {
        return next;
    }

    public void setNext(CustomNodeV8 next) {
        this.next = next;
    }
}
