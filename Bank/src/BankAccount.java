
public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;
    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    //branch argument is true when customer is performing transactions in a bank with teller
    //false if the transaction is performed using ATM
    public double deposit(double amount, boolean branch){
        balance+= amount;
        return balance;
    }
    public double withdrawal(double amount, boolean branch){
        if(amount > 500.00 & !branch){
            throw new IllegalArgumentException();
        }
        balance -=amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }
}

