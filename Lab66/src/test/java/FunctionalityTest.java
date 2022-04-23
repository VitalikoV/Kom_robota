import jdk.jfr.Description;
import org.example.CustomQueue;
import org.example.FileParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {

    @Test
    @Description("Checks if the min element was found")
    public void checkMinElem(){
        CustomQueue queue = FileParser.readCSVFile("numbers.txt");
        assertEquals(1, queue.getSmallestElem());
        assertEquals(1, queue.getSmallestElemPos());
    }

    @Test
    @Description("Checks if the max element was found")
    public void checkMaxElem(){
        CustomQueue queue = FileParser.readCSVFile("numbers.txt");
        assertEquals(10, queue.getBiggestElem());
        assertEquals(10, queue.getBiggestElemPos());
    }
}
