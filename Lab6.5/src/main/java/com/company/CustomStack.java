package com.company;

import java.util.EmptyStackException;

public class CustomStack {

    CustomNode top = null;
    int length = 0;

    public void push(double data) {
        CustomNode tempNode = new CustomNode(data);
        tempNode.setNext(top);
        top = tempNode;
        length++;
    }

    public double pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        CustomNode node = top;
        top = top.getNext();
        length--;
        return node.getData();
    }

    public double getLastElem() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getData();
    }


    public CustomStack clone() {
        CustomStack stack = new CustomStack();
        CustomNode tempNode = top;
        while (tempNode != null) {
            stack.push(tempNode.getData());
            tempNode = tempNode.getNext();
        }

        return stack;
    }

    public CustomStack sort() {
        CustomStack stack = new CustomStack();
        CustomStack copyOfStack = this.clone();

        while (copyOfStack.top != null) {
            double tempVal = copyOfStack.pop();
            while (stack.top != null && stack.getLastElem() < tempVal) {
                copyOfStack.push(stack.pop());
            }
            stack.push(tempVal);
        }
        return stack;
    }

    public void printValues() {
        CustomNode tempNode = top;
        while (tempNode != null) {
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }
}
