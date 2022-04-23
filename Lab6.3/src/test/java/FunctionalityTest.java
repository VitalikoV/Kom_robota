import com.company.CustomTwoLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {

    @Test
    @DisplayName("Check Similarity Positive Test")
    void checkSimilarityPositive() {
        CustomTwoLinkedList list = new CustomTwoLinkedList();
        list.addElement(4);
        list.addElement(5);
        list.addElement(3);
        list.addElement(2);
        list.addElement(1);

        CustomTwoLinkedList listToCheck = new CustomTwoLinkedList();
        listToCheck.addElement(1);
        listToCheck.addElement(1);
        listToCheck.addElement(2);
        listToCheck.addElement(3);
        listToCheck.addElement(4);
        listToCheck.addElement(4);
        listToCheck.addElement(5);
        listToCheck.addElement(5);

        assertEquals(true, list.checkSimilarityOfLists(listToCheck));
    }

    @Test
    @DisplayName("Check Similarity Negative Test")
    void checkSimilarityNegative() {
        CustomTwoLinkedList list = new CustomTwoLinkedList();
        list.addElement(1);
        list.addElement(2);
        list.addElement(2);
        list.addElement(3);
        list.addElement(7);
        list.addElement(8);
        list.addElement(9);
        list.addElement(10);

        CustomTwoLinkedList listToCheck = new CustomTwoLinkedList();
        listToCheck.addElement(1);
        listToCheck.addElement(1);
        listToCheck.addElement(2);
        listToCheck.addElement(3);
        listToCheck.addElement(4);
        listToCheck.addElement(4);
        listToCheck.addElement(5);
        listToCheck.addElement(5);

        assertEquals(false, list.checkSimilarityOfLists(listToCheck));
    }
}
