public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double myNumber = 20.00d;
        double mySecondNumber = 80.00d;
        double myThirdNumber = (myNumber + mySecondNumber) * 100.00d;
        double myRemainder = myThirdNumber % 40.00d;
        System.out.println(myRemainder);
        boolean myBoolean = false;
        if (myRemainder == 0){
            myBoolean = true;
        }
        System.out.println(myBoolean);
    }
}