package synochronize;

public class TestingSynochronize {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        Counter counter = new Counter();
        updaterThread t1 = new updaterThread(counter);
        updaterThread t2 =new updaterThread(counter);



        try {
            t1.start();
            t1.join();
            t2.start();

            t2.join();
        }catch (InterruptedException e){
            System.out.println("Thread interpted" + e.getMessage());
        }
        long endTime= System.currentTimeMillis();
        System.out.printf("Final counter value: %d  and time taken %d"  , counter.getCount(), (endTime - starttime));
    }
}
