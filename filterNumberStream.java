package LamdaFunction;

import java.util.List;

public class filterNumberStream {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,2,66,2,34,421,3,43,35,2);
        num.stream().filter(nums -> nums>10)
                        .forEach(nums -> System.out.println(nums));


    }
}
