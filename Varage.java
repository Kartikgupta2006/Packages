package varage;

 class Varage {
    public static void main(String... args) {
        System.out.println(sum(3,4));
        System.out.println(sum(4,4,43,2,2));
    }
    public static int sum(int...a){
        int sum=0;
        for (int i :a){
            sum+=i;
        }
        return sum;
    }

//    public static int sum(int[] a){
//        int sum=0;
//        for (int i :a){
//            sum+=i;
//        }
//        return sum;
//    }
    public static int sum(int a, int b){
        return a+b;
    }
}
