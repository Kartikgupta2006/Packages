package multiThreading;

public enum TrafficColor {

    RED(9000),YELLOW(1000),GREEN(3000) ;


    private int onTimeMille;

    public int getOnTimeMille() {
        return onTimeMille;
    }

    TrafficColor(int onTimeMille) {
        this.onTimeMille = onTimeMille;
    }
}
