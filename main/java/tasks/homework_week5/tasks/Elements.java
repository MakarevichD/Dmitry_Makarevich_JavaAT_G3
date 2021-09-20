package main.java.tasks.homework_week5.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Elements {

    public static void main(String[] args) {

        List<String> testerThings = new ArrayList<>();
        testerThings.add("Text field");
        testerThings.add("Radio");
        testerThings.add("Check-box");
        testerThings.add("Drop-down");
        testerThings.add("Picker");
        testerThings.add("Breadcrumb");

        for (String showMe : testerThings) {
            System.out.print("--"+ showMe + "-- ");
        }

        for (String showMe : testerThings) {

        }

    }
}
