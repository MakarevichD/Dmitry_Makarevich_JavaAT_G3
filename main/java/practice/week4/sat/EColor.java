package main.java.practice.week4.sat;

public enum EColor {

    RED("red", 1),
    BLUE("blue", 2),
    YELLOW("yellow", 3),
    PURPLE("purple", 4),
    GREEN("green", 5);

    String color;
    int hex;

    EColor(String color, int hex) {
        this.color = color;
        this.hex = hex;
    }

    public static EColor byHex(int hex) {

        switch (hex) {
            case 2:
                return BLUE;
            case 3:
                return GREEN;
            default:
                return RED;
        }
    }
}
