

import com.company.CustomLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {
    @Test
    @DisplayName("Check creation of elements")
    void checkCreationOfElements() {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.addElement(1);
        linkedList.addElement(2);
        linkedList.addElement(3);
        linkedList.addElement(4);
        linkedList.addElement(5);

        assertEquals(5, linkedList.getHead().getData());

    }

    @Test
    @DisplayName("Check creation of elements")
    void checkDeletionOfElement() {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.addElement(1);
        linkedList.addElement(2);
        linkedList.addElement(3);
        linkedList.addElement(4);
        linkedList.addElement(5);

        linkedList.deleteElement(5);
        assertEquals(4, linkedList.getHead().getData());

    }
}
