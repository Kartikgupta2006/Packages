package Exception.Handling;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
    a();
    }
    private static void a(){
      b();
    }
    private static void b(){
   c();
    }
    private static void c(){
   d();
    }
    private static void d(){
        Scanner sc= new Scanner(System.in);
        System.out.println("----------welcome to division calculator----------------");
        System.out.print("Enter the two num:");
        int first = sc.nextInt();
        int second = sc.nextInt();
        try {
            int[] a= new int[5];
            System.out.printf("result %d" ,a[6] );
            a[6] = first/second;
            int result = first / second;
            System.out.println(result);
        }catch(ArithmeticException exception){
            System.out.printf("%s , enter the valid value", exception.getMessage());
        }
        catch (Throwable th){
            System.out.println("Array is out of bound.");
            throw th;
        }
    }

}
