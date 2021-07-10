package main.java.tasks.homework_week5.tasks;

import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {

        List<String> noodleCup = new ArrayList<>();
        noodleCup.add("Hakka");
        noodleCup.add("Ramen");
        noodleCup.add("Hibachi");
        noodleCup.add("Schezwan");

        for (String yumiNoodle : noodleCup) {
            System.out.print(yumiNoodle + "-");
        }

        System.out.println();


        for (String yumiNoodle : noodleCup) {

            String changeLetter = yumiNoodle.replaceAll("a", "o");
            noodleCup.add(changeLetter);
        }
        System.out.println();

    }

}

