package LamdaFunction;

import java.util.List;

public class FilterAndConcetinateStream {
    public static void main(String[] args) {
        List<String> strs = List.of("prasant jain","ghatiya", " teaching java", "bekar",
                                   " on kg coding", " best youtuber");
        String result = strs.stream().filter(str -> str.length()>10)
                .reduce("",(a,b) -> a + "" +b);
        System.out.println(result);
    }
}
