package main.java.practice.week5.sun;

import java.util.ArrayList;
import java.util.List;

public class Vegetables {

    public static void main(String[] args) {

        List<String> vegaNames = new ArrayList();
        vegaNames.add("tomato");
        vegaNames.add("cucumber");
        vegaNames.add("cabachok");
        vegaNames.add("batat");
        vegaNames.add("potato");

        int counter = 0;

        for(String letterA : vegaNames) {
            if (letterA.contains("a")) {
                counter++;
            }
            System.out.println(letterA+ " ");
        }
        System.out.println(counter);

    }


}

