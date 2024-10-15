package Executor_Service;


public class printTask extends Thread{

    private final int threadNumber;

    public printTask(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf(" %s thread-starting %d\n" ,
                Thread.currentThread().getName(),
                threadNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf(" %s thread-end %d\n" ,
                Thread.currentThread().getName(),
                threadNumber);
    }
}

