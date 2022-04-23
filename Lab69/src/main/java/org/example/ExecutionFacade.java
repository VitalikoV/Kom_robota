package org.example;

public class ExecutionFacade {
    public static void processData(){
        BinaryTree tree = new BinaryTree();
        tree.add(42);
        tree.add(16);
        tree.add(45);
        tree.add(968);
        tree.add(3675);
        tree.add(12);
        tree.add(49);
        tree.add(10);
        tree.add(9);
        tree.add(8);

        tree.printTree();

        System.out.println("Max depth of the tree is: " + tree.maxDepth());

        tree.delete(12);
        tree.delete(45);

        System.out.println("Tree contains value 968: " + tree.containsValue(968));
        System.out.println("Tree contains value 16: " + tree.containsValue(16));

        tree.printTree();

        System.out.println("Max depth of the tree is: " + tree.maxDepth());
    }
}
