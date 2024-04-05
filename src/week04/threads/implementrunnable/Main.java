package week04.threads.implementrunnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        //myRunnable.run();

        Thread thread=new Thread();
        thread.start();
    }
}
