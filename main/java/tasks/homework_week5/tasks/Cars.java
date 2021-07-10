package main.java.tasks.homework_week5.tasks;

import java.util.HashSet;
import java.util.Set;

public class Cars {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        for (String oldCars : cars) {
            System.out.println("\"" + oldCars + "\"");
        }
    }
}
