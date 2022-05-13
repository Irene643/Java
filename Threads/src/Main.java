
public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        //anonymous class
        //new Thread(() -> System.out.println("hello from the anonymous class.")).start();//works as well
        new Thread(){
            public void run(){
                System.out.println(ThreadColor.ANSI_RED +"hello from the anonymous class.");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from anonymous class implementation of run()");
                try{
                    anotherThread.join();
                    System.out.println(ThreadColor.ANSI_RED + "Another thread terminated or timed out so i'm running again");
                }catch (InterruptedException e){
                    System.out.println(ThreadColor.ANSI_RED + "I couldn't wait after all. I was interrupted.");
                }
            }
        });
        myRunnableThread.start();
        anotherThread.interrupt();

        System.out.println(ThreadColor.ANSI_PURPLE  + "Hello again from the main thread.");
    }
}
