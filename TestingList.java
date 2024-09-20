package collection;

import java.util.ArrayList;
import java.util.List;


public class TestingList {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();

        strList.add("kartik");
        strList.add("gupta");
        strList.add(1,"Don");


        if(strList.contains("Don")){
            System.out.println("exist"+strList.indexOf("Don"));
        }

        strList.remove(1);

        for (String s : strList) {
            System.out.print(s);
        }
    }
}
