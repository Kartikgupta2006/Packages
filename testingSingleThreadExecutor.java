package Executor_Service;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testingSingleThreadExecutor {
    public static void main(String[] args) {
       ExecutorService service = Executors.newSingleThreadExecutor();
       printTask task1 = new printTask(1);
        printTask task2 = new printTask(2);
        printTask task3 = new printTask(3);

       service.submit(task1);
        service.submit(task2);
        service.submit(task3);

       service.shutdown();

    }
}
