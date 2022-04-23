package com.company.V8;

import java.util.EmptyStackException;

public class CustomStackV8 {
    CustomNodeV8 top = null;

    public void push(char data) {
        CustomNodeV8 tempNode = new CustomNodeV8(data);
        tempNode.setNext(top);
        top = tempNode;
    }

    public char pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        CustomNodeV8 node = top;
        top = top.getNext();
        return node.getData();
    }

    public int getLastElem() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getData();
    }


    public CustomStackV8 clone() {
        CustomStackV8 stack = new CustomStackV8();
        CustomNodeV8 tempNode = top;
        while (tempNode != null) {
            stack.push(tempNode.getData());
            tempNode = tempNode.getNext();
        }

        return stack;
    }

    public CustomStackV8 sort() {
        CustomStackV8 stack = new CustomStackV8();
        CustomStackV8 copyOfStack = this.clone();

        while (copyOfStack.top != null) {
            char tempVal = copyOfStack.pop();
            while (stack.top != null && stack.getLastElem() < tempVal) {
                copyOfStack.push(stack.pop());
            }
            stack.push(tempVal);
        }
        return stack;
    }

    public void printValues() {
        CustomNodeV8 tempNode = top;
        while (tempNode != null) {
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }

}
