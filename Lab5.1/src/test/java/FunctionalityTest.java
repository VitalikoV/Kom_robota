package test.java;

import com.company.NumbersController;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {
    @Test
    @Description("test numbers function")
    public void evenNumbersTest(){
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 53;
        nums[2] = 34;
        nums[3] = 56;
        nums[4] = 12;


        int[] evenNums = NumbersController.getEvenNumbers(nums, false);
        assertEquals(34, evenNums[0]);
    }

    @Test
    @Description("test numbers function")
    public void oddNumbersTest(){
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 53;
        nums[2] = 34;
        nums[3] = 56;
        nums[4] = 12;


        int[] oddNums = NumbersController.getEvenNumbers(nums, true);
        assertEquals(1, oddNums[0]);
    }
}
