import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();

    }

    @Test
    public void canAdd(){
        assertEquals(4.0, calculator.add(1.0, 3.0), 0.1);
    }

    @Test
    public void canSubtract(){
        assertEquals(4.0, calculator.subtract(7.0, 3.0), 0.1);
    }

    @Test
    public void canMultiply(){
        assertEquals(8.0, calculator.multiply(4.0, 2.0), 0.1);
    }

    @Test
    public void canDivide(){
        assertEquals(2.0, calculator.divide(4.0, 2.0), 0.1);
    }
}



//    Create a Calculator class. This should have functions for
//        Add, Subtract, Multiply and Divide, each taking in two doubles
//        to perform the calculations on.
