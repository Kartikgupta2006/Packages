package multiThreading;

public class testingTrafficSignal {
    public static void main(String[] args) throws InterruptedException {
        trafficSignalThread red = new trafficSignalThread(TrafficColor.RED);
        trafficSignalThread yellow = new trafficSignalThread(TrafficColor.YELLOW);
        trafficSignalThread Green = new trafficSignalThread(TrafficColor.GREEN);

        Green.start();
        Green.join();
        yellow.start();
        yellow.join();
        red.start();
        red.join();



    }
}
