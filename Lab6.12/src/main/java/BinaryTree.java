public class BinaryTree {
    CustomNode root;

    public void add(Route value){
        root = add(root, value);
    }

    private CustomNode add(CustomNode current, Route value){
        if(current == null){
            return new CustomNode(value);
        }

        if(current.getValue().getRouteNumber() > value.getRouteNumber()){
            current.setLeft(add(current.getLeft(), value));
        }else if(current.getValue().getRouteNumber() < value.getRouteNumber()){
            current.setRight(add(current.getRight(), value));
        }else{
            return current;
        }
        return current;
    }

    public void printTree(){
        printTree(root);
        System.out.println();
    }

    public void printTree(CustomNode node) {
        if (node != null) {
            printTree(node.getLeft());
            System.out.print(" " + node.getValue().toString());
            printTree(node.getRight());
        }
    }

    public Route get(int val){
        return get(root, val);
    }

    private Route get(CustomNode node, int val){
        if(node == null){
            return null;
        }

        if(val == node.getValue().getRouteNumber()){
            return node.getValue();
        }

        return val < node.getValue().getRouteNumber()? get(node.getLeft(), val) : get(node.getRight(), val);

    }

    public Boolean containsValue(int val){
        return containsValue(root, val);
    }

    private Boolean containsValue(CustomNode node, int val){
        if(node == null){
            return false;
        }

        if(val == node.getValue().getRouteNumber()){
            return true;
        }

        return val < node.getValue().getRouteNumber()? containsValue(node.getLeft(), val) : containsValue(node.getRight(), val);

    }


    public int maxDepth(){
        return getDepth(root);
    }

    public int getDepth(CustomNode node){
        if(node == null){
            return -1;
        }

        int leftDepth = getDepth(node.getLeft());
        int rightDepth = getDepth(node.getRight());

        if(leftDepth > rightDepth){
            return leftDepth + 1;
        }else{
            return rightDepth + 1;
        }

    }

    public void delete(int value){
        delete(root, value);
    }

    private CustomNode delete(CustomNode current, int value){
        if (current == null){
            return current;
        }

        if(current.getValue().getRouteNumber() > value){
            current.setLeft(delete(current.getLeft(), value));
        }else if(current.getValue().getRouteNumber() < value){
            current.setRight(delete(current.getRight(), value));
        }else{ //current.getValue() == value
            if(current.getLeft() == null && current.getRight() == null){
                current = null; //if it's the last element, we can symply set the null
            }else if(current.getRight() != null){
                current.setValue(successor(current));
                current.setRight(delete(current.getRight(), current.getValue().getRouteNumber()));
            }else{
                current.setValue(predecessor(current));
                current.setLeft(delete(current.getLeft(), current.getValue().getRouteNumber()));
            }
        }

        return current;
    }

    private Route successor(CustomNode current){
        current = current.getRight();
        while(current.getLeft() != null){
            current = current.getLeft();
        }
        return current.getValue();
    }

    private Route predecessor(CustomNode current){
        current = current.getLeft();
        while(current.getRight() != null){
            current = current.getRight();
        }
        return current.getValue();
    }
}
