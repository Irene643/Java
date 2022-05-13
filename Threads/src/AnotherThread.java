public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from another thread.");
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");
            return;
        }
        System.out.println("Three seconds have passed and i'm awake.");
    }
}
