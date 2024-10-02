package multiThreading;

public class TestingMultiThreading {
        public static void main(String[] args) {
            long starttime = System.currentTimeMillis();
            FirstTask t1 = new FirstTask();
            SecondTask t2 = new SecondTask();
            ThirdTask t3 = new ThirdTask();
            System.out.println("first thread");
            t1.start();
            System.out.println("Second Thread");
            t2.start();
            System.out.println("third Thread");
            t3.start();
            long finaltime = System.currentTimeMillis();
            System.out.printf("%s Total time task completed :%d",Thread.currentThread(),
                    ( finaltime- starttime));
        }
    }

