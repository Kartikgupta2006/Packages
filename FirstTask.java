package multiThreading;

public class FirstTask extends Thread{
    @Override
    public void run() {
        // first task
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.printf("\n %s * first task complete", Thread.currentThread().getName());
    }
}
