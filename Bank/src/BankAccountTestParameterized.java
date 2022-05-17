import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {

    private BankAccount account;
    private boolean branch;
    private double amount;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.branch = branch;
        this.amount = amount;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("John", "Doe", 1000, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
            {100.00, true, 1100.00},
            {200.00, true, 1200.00},
            {325.14, true, 1325.00},
            {489.33, true, 1489.33},
            {1000.00, true, 2000.00}
        });
    }

    @org.junit.Test
    public void deposit() {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), .01);
    }
}
