package com.company;

public class CustomLinkedList {
    static CustomNode head;

    public void addElement(int newData) {
        CustomNode newCustomNode = new CustomNode(newData);
        newCustomNode.next = head;
        head = newCustomNode;
    }

    public void addAll(String[] data) {
        for(String val : data) {
            CustomNode newCustomNode = new CustomNode(Integer.parseInt(val));
            newCustomNode.next = head;
            head = newCustomNode;
        }
    }

    public void addAll(int[] data) {
        for(int val : data) {
            CustomNode newCustomNode = new CustomNode(val);
            newCustomNode.next = head;
            head = newCustomNode;
        }
    }

    public void changeAllOccurrences(int numberToChange, int changeVal){
        CustomNode temp = head;
        while (temp != null) {
            if(temp.data == numberToChange) {
                temp.data = changeVal;
            }
            temp = temp.next;
        }
    }

    public void printList() {
        CustomNode tCustomNode = head;
        while (tCustomNode != null){
            System.out.print(tCustomNode.data + " ");
            tCustomNode = tCustomNode.next;
        }
        System.out.println();
    }
}
