package LamdaFunction;

import java.util.List;

public class arrayStream {
    public static void main(String[] args) {
        List<String> names = List.of("prasant", "kartik", "kimi", "mini");
        names.stream().forEach(name -> System.out.println(name));
    }
}
