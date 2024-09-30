package ENUMS;

public enum Day {


    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THRUSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);
    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType(){
        if(isWeekday){
            return "weekday";
        }else{
            return "weekend";
        }
    }
}
