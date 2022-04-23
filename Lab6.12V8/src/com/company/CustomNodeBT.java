package com.company;

public class CustomNodeBT {
    private Student value;
    private CustomNodeBT right;
    private CustomNodeBT left;

    public CustomNodeBT(Student value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public Student getValue() {
        return value;
    }

    public void setValue(Student value) {
        this.value = value;
    }

    public CustomNodeBT getRight() {
        return right;
    }

    public void setRight(CustomNodeBT right) {
        this.right = right;
    }

    public CustomNodeBT getLeft() {
        return left;
    }

    public void setLeft(CustomNodeBT left) {
        this.left = left;
    }
}
