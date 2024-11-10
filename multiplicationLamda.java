package LamdaFunction;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class multiplicationLamda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryOperator<Integer> multi = (a,b) -> a*b;
        int result = multi.apply(2,5);
        System.out.println(result);
    }
}
