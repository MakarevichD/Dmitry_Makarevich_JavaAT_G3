package main.java.tasks.homework_week5.tasks;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {


        List<String> butterflies = new ArrayList();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        int letterCounter = 0;

        for (String findLetter : butterflies) {
            if (findLetter.contains("o")) {
                letterCounter++;
            }
            System.out.println("'" + findLetter + "'");

        }
        System.out.println(letterCounter);

        for (int i = 0; i < 4; i++) {

            System.out.printf(butterflies.get(i) + " ");
        }

        for (String finLetter : butterflies) {
            System.out.println(finLetter + "\n");

        }

    }
}
