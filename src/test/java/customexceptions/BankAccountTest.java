package customexceptions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BankAccountTest {
    main m = new main();
    @Test
    void testSuccessfulWithdrawal() {

        String result=m.CallSuccessWithdrawals();
        String expected= "Successful Withdrawal";
        assertEquals(expected,result);

    }

    @Test
    void testInsufficientFundsException() {

        String expected1="Insufficient funds for withdrawal";
        String result1=m.CallInsufficientFundsException();
        assertEquals(expected1,result1);
    }

    @Test
    void testInvalidWithdrawalException() {

        String expected2="Withdrawal amount cannot be negative";
        String result2=m.CallInvalidWithdrawalException();
        assertEquals(expected2,result2);
    }
}
