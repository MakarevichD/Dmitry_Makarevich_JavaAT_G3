package main.java.practice.week4;

public enum EColor {

    RED("red", 1),
    BLUE("blue",2),
    YELLOW("yellow", 3),
    PURPLE("purple", 4),
    GREEN("green", 5);

    String color;
    int hex;

    EColor(String color, int hex){
        this.color = color;
        this.hex = hex;


    }
}
