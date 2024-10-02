package multiThreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();

        // first task
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * first task complete");

        //second Task
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d& ", i);
        }
        System.out.println("\n & Second task complete");

        //Third Task
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n $ third task complete");

        long finaltime = System.currentTimeMillis();
        System.out.printf("Total time task completed :%d", ( finaltime- starttime));
    }
}
