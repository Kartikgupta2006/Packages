package multiThreading;

public class MainThreadState {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();

        System.out.printf( "\nCreating a thread %s", t1.getState());

        t1.start();

        t1.join();

        System.out.printf( "\nfinish a thread %s", t1.getState());
    }
}
