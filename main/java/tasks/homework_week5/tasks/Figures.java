package main.java.tasks.homework_week5.tasks;

import java.util.ArrayList;
import java.util.List;

public class Figures {

    public static void main(String[] args) {

        List<String> figures = new ArrayList<>();
        figures.add("Овал");
        figures.add("Прямоугольник");
        figures.add("Круг");
        figures.add("Квадрат");
        figures.add("Эллипс");

        for (String geometry : figures) {
            System.out.print(geometry + "-");
        }

        System.out.println();

        int letterCounter = 0;

        for (String letters : figures) {
            if (!letters.contains("и")) {
                letterCounter++;
            }
            System.out.println(letterCounter + " ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(figures.get(i) + " ");
        }

        System.out.println();

        figures.add(3, "Треугольник");

        for (String geometry : figures) {
            System.out.println(geometry + " ");
        }
    }
}
