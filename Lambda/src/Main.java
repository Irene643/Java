public class Main {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("Printing from Runnable")).start();

    }
}
class CodeToRun implements Runnable{

    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}
