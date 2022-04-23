import jdk.jfr.Description;
import org.example.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {
    @Test
    @Description("Testing creation of new binary tree")
    public void containsValTest(){
        BinaryTree tree = new BinaryTree();
        tree.add(43);
        tree.add(642);
        tree.add(345);
        tree.add(987);
        tree.add(142);

        assertEquals(true, tree.containsValue(345));
    }

    @Test
    @Description("Testing creation of new binary tree")
    public void containsValTestNegative(){
        BinaryTree tree = new BinaryTree();
        tree.add(43);
        tree.add(642);
        tree.add(345);
        tree.add(987);
        tree.add(142);

        assertEquals(false, tree.containsValue(5112));
    }

    @Test
    @Description("Testing the depth of the tree")
    public void getMaxDepthTest(){
        BinaryTree tree = new BinaryTree();
        tree.add(43);
        tree.add(642);
        tree.add(345);
        tree.add(987);
        tree.add(142);

        assertEquals(3, tree.maxDepth());
    }

    @Test
    @Description("Testing delete of the element in the tree")
    public void deleteElementTest(){
        BinaryTree tree = new BinaryTree();
        tree.add(43);
        tree.add(642);
        tree.add(345);
        tree.add(987);
        tree.add(142);

        tree.delete(987);
        tree.delete(642);
        assertEquals(false, tree.containsValue(987));
        assertEquals(false, tree.containsValue(642));
        assertEquals(true, tree.containsValue(142));
    }
}
