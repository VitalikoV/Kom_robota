import com.company.CircularLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {

    @Test
    @DisplayName("Check Quantity of times the value was used")
    void calculateQuantityOfValueUsedTest() {
        CircularLinkedList list = new CircularLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(5);
        list.addNode(3);
        list.addNode(5);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(1);

        assertEquals(2, list.calculateQuantityOfValueUsed(1));
        assertEquals(3, list.calculateQuantityOfValueUsed(5));
    }
}
