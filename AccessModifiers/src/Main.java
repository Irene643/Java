public class Main {
    public static void main(String[] args) {

    Account irenesAccount = new Account("Irene");
        irenesAccount.deposit(1000);
        irenesAccount.withdrawal(500);
        irenesAccount.withdrawal(-200);
        irenesAccount.deposit(-20);

        irenesAccount.calculateBalance();
        irenesAccount.balance = 5000;

        System.out.println("Account balance is "+irenesAccount.getBalance());
    }
}
