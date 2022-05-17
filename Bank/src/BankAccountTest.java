import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BankAccountTest {
    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup(){
      account = new BankAccount("John", "Doe", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test.");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        double balance = account.withdrawal(600.00, true);
        assertEquals(400, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception{
        account.withdrawal(600.00, false);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdrawal(200.00, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        assertTrue(account.isChecking());
    }
    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test case. Count = "+ count++);
    }
    @org.junit.After
    public void teardown(){
        System.out.println("Count = " + count++);
    }
}