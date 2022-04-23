//package test.java;

import com.company.StackCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.company.StackCalculator.getFormulaToCalc;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {

    @Test
    @DisplayName("Check calculation")
    public void testCalculation(){
        String formula = "b-a-c/d*a-b*c*d";

        StackCalculator calc = new StackCalculator();
        String a = "1";
        String b = "2";
        String c = "3";
        String d = "4";

        Double result = calc.compute(getFormulaToCalc(formula, a, b, c, d));
        assertEquals(-23.75, result);
    }
}
