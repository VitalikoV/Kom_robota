import jdk.jfr.Description;
import org.example.CustomLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {
    @Test
    @Description("Test of the functionality of list creation")
    public void testCreation(){
        CustomLinkedList list = new CustomLinkedList();
        list.addElement(6);
        list.addElement(355);
        list.addElement(746);
        list.addElement(87);
        list.addElement(2);
        list.addElement(84);

        assertEquals(84, list.getHead().getData());
    }

    @Test
    @Description("Test the comparing of two lists")
    public void testCompare(){
        CustomLinkedList list = new CustomLinkedList();
        list.addElement(6);
        list.addElement(355);
        list.addElement(746);
        list.addElement(87);
        list.addElement(2);
        list.addElement(84);

        CustomLinkedList listToCompare = new CustomLinkedList();
        listToCompare.addElement(6);
        listToCompare.addElement(355);
        listToCompare.addElement(746);
        listToCompare.addElement(87);
        listToCompare.addElement(2);
        listToCompare.addElement(84);
        assertEquals(true, list.compare(listToCompare));
    }

    @Test
    @Description("Test the comparing of two lists")
    public void testCompareNegative(){
        CustomLinkedList list = new CustomLinkedList();
        list.addElement(6);
        list.addElement(355);
        list.addElement(746);
        list.addElement(87);
        list.addElement(2);
        list.addElement(84);

        CustomLinkedList listToCompare = new CustomLinkedList();
        listToCompare.addElement(6);
        listToCompare.addElement(4);
        listToCompare.addElement(2);
        listToCompare.addElement(7);
        listToCompare.addElement(4);
        listToCompare.addElement(84);
        assertEquals(false, list.compare(listToCompare));
    }
}
