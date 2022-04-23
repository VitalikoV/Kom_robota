package main.java.com.company;
import com.company.File;

public class CustomNode {
    private File value;
    private CustomNode right;
    private CustomNode left;

    public CustomNode(File value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public File getValue() {
        return value;
    }

    public void setValue(File value) {
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
