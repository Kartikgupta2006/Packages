package synochronize;

public  class Counter {
    private static int count =1;

    public static synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }


}
