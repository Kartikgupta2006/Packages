package multiThreading;

public class SecondTask extends Thread{
    @Override
    public void run() {
        //second Task
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d& ", i);
        }
        System.out.printf("\n %s & second task complete", Thread.currentThread().getName());
    }
}
