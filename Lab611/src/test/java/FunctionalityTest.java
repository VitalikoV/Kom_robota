import jdk.jfr.Description;
import org.example.BinaryTree;
import org.example.File;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {

    @Test
    @Description("Checks if quantity is correct")
    public void checkQuantityTest(){
        Date today = new Date();
        Date lastYear = new Date();
        lastYear.setYear(2021);
        Date january = new Date();
        january.setMonth(1);

        File firstFile = new File("Test 1", today);
        File secondFile = new File("Test 2", lastYear);
        File thirdFile = new File("Test 3", january);

        BinaryTree tree = new BinaryTree();
        tree.add(firstFile);
        tree.add(secondFile);
        tree.add(thirdFile);

        File foundFile = tree.get("Test 2", lastYear);
        assertEquals(3,foundFile.getViewsQuantity());
    }

    @Test
    @Description("Checks the item is deleted from the binary tree")
    public void checkDeletedItem(){
        Date today = new Date();
        Date lastYear = new Date();
        lastYear.setYear(2021);
        Date january = new Date();
        january.setMonth(1);

        File firstFile = new File("Test 1", today);
        File secondFile = new File("Test 2", lastYear);
        File thirdFile = new File("Test 3", january);

        BinaryTree tree = new BinaryTree();
        tree.add(firstFile);
        tree.add(secondFile);
        tree.add(thirdFile);

        tree.delete(secondFile);

        File foundFile = tree.get("Test 2", lastYear);
        assertEquals(null,foundFile);
    }
}
