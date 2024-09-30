package ENUMS;

enum  Enums {
    RED("stop"), GREEN("start"),YELLOW("break");

    private final String action;

    Enums(String action) {
        this.action = action;
    }
}
