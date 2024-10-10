package synochronize;


public class updaterThread extends Thread {

    private final Counter count;

    public updaterThread(Counter count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Counter.increment();
        }
    }
}
