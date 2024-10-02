package multiThreading;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        //third Task
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n %s $ third task complete", Thread.currentThread().getName());
    }
}
