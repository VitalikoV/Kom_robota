package main.java.com.company;

import com.company.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BinaryTree {
    CustomNode root;

    public void add(File value){
        root = add(root, value);
    }

    private CustomNode add(CustomNode current, File value){
        if(current == null){
            return new CustomNode(value);
        }

        if(current.getValue().getCreatedDate().after(value.getCreatedDate())){
            current.setLeft(add(current.getLeft(), value));
        }else if(current.getValue().getCreatedDate().before(value.getCreatedDate())){
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
            System.out.print(" " + node.getValue());
            printTree(node.getRight());
        }
    }

    public Boolean containsValue(File val){
        return containsValue(root, val);
    }

    private Boolean containsValue(CustomNode node, File val){
        if(node == null){
            return false;
        }

        if(val.getName() == node.getValue().getName()){
            return true;
        }

        return val.getCreatedDate().after(node.getValue().getCreatedDate())? containsValue(node.getLeft(), val) : containsValue(node.getRight(), val);

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

    public void delete(File value){
        delete(root, value);
    }

    private CustomNode delete(CustomNode current, File value){
        if (current == null){
            return current;
        }

        if(current.getValue().getCreatedDate().after(value.getCreatedDate())){
            current.setLeft(delete(current.getLeft(), value));
        }else if(current.getValue().getCreatedDate().before(value.getCreatedDate())){
            current.setRight(delete(current.getRight(), value));
        }else{ //current.getValue() == value
            if(current.getLeft() == null && current.getRight() == null){
                current = null; //if it's the last element, we can symply set the null
            }else if(current.getRight() != null){
                current.setValue(successor(current));
                current.setRight(delete(current.getRight(), current.getValue()));
            }else{
                current.setValue(predecessor(current));
                current.setLeft(delete(current.getLeft(), current.getValue()));
            }
        }

        return current;
    }

    private File successor(CustomNode current){
        current = current.getRight();
        while(current.getLeft() != null){
            current = current.getLeft();
        }
        return current.getValue();
    }

    private File predecessor(CustomNode current){
        current = current.getLeft();
        while(current.getRight() != null){
            current = current.getRight();
        }
        return current.getValue();
    }
}
