package Executor_Service;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class testingMultilpleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            Thread.sleep(10);
            printTask task = new printTask(i);
            service.submit(task);
        }
        service.shutdown();
        System.out.println("***************");
       if(!service.awaitTermination(10,TimeUnit.SECONDS)){
           System.out.println("######################");
           service.shutdown();
       }
    }
}
