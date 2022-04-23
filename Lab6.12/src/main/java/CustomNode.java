public class CustomNode {
    private Route value;
    private CustomNode right;
    private CustomNode left;

    public CustomNode(Route value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public Route getValue() {
        return value;
    }

    public void setValue(Route value) {
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
