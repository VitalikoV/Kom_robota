package org.example;

public class CustomNode {
    private int value;
    private CustomNode right;
    private CustomNode left;

    public CustomNode(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CustomNode getRight() {
        return right;
    }

    public void setRight(CustomNode right) {
        this.right = right;
    }

    public CustomNode getLeft() {
        return left;
    }

    public void setLeft(CustomNode left) {
        this.left = left;
    }
}
