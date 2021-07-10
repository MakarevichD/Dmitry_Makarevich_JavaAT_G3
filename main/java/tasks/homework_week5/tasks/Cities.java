package main.java.tasks.homework_week5.tasks;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city + "\n");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(cities.get(i) + " ");
        }

        int letterCounter = 0;
        for (String city : cities) {
            letterCounter = letterCounter + city.length();
        }
        System.out.println("\n" + letterCounter);
    }
}
