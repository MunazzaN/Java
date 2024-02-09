package Additional;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class SwapTest {
    @Test
    public void testTwoNumbers(){


        int number1=10;
        int number2=5;
        Swap.swapTwoNumberwithoutExtraVariable(number1,number2);
        assertEquals(5,number2);
        assertEquals(10,number1);
    }

}




