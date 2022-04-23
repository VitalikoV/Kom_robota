import jdk.jfr.Description;
import org.example.CustomTwoLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {

    @Test
    @Description("check if the search of the similar elements works as expected")
    public void checkSimilarElements(){
        CustomTwoLinkedList list = new CustomTwoLinkedList();
        list.addElement(2);
        list.addElement(3);
        list.addElement(5);
        list.addElement(5);
        list.addElement(5);
        list.addElement(4);

        CustomTwoLinkedList listToCheck = list.getSimilarElements();
        assertEquals(5, listToCheck.getHead().getValue());
    }
}
