package main.java.practice.week4.sat;

public class ColorContainerRunner {

 public void printerColor(String color) {

        if (color.equals(ColorContainer.RED.getColor())) {
            System.out.println(ColorContainer.RED.getColor());
        } else if (color.equals(ColorContainer.BLUE.getColor()))
        System.out.println(ColorContainer.BLUE.getColor());
    }
}

