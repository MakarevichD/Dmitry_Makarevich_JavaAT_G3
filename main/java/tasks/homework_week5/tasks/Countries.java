package main.java.tasks.homework_week5.tasks;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String country : countries) {
            System.out.print(country + ", ");
        }

        int letterCounter = 0;


        for ( int i = 0 ; i<7; i ++) {
            letterCounter++;

        }
        System.out.println(letterCounter);

    }
}
