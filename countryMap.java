package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class countryMap {
     public static void main(String[] args) {
         Map<String,String> countryMap = new HashMap<>();
         countryMap.put("bharat", "delhi");
         countryMap.put("china", "beijing");
         countryMap.put("america", "Uk");
         countryMap.put("japan", "tokyo");
         countryMap.put("srilanka", "colmbo");
         Scanner sc = new Scanner(System.in);
         System.out.print("Please enter the country name:");
         String country = sc.next();
         if(countryMap.containsKey(country)){
             System.out.printf("capital of %s is %s", country, countryMap.get(country));
         }else{
             System.out.println("sorry WE Don't know the capital");
         }
     }
}
