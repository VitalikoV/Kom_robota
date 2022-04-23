package org.example.customList;

import org.example.File;

public class CustomListNode {
    private File data;
    private CustomListNode next;
    CustomListNode(File d){
        data = d;
        next = null;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }

    public CustomListNode getNext() {
        return next;
    }

    public void setNext(CustomListNode next) {
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
