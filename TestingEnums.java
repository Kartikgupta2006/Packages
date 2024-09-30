package ENUMS;

public class TestingEnums {

    public static void main(String[] args) {
        Enums color= Enums.RED;
        color = Enums.GREEN;
        Grade grade= Grade.valueOf("D");
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
        System.out.println("printing all the day of enum class:");
        for (Day day : Day.values()) {
            System.out.println(day+ " : " + day.getType());
        }
    }
}
