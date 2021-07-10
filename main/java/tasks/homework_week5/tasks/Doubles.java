package main.java.tasks.homework_week5.tasks;

import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

        List<Double> doubleValues = Arrays.asList(34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (Double numbers : doubleValues) {
            System.out.print(numbers + " ");
        }

        System.out.println();

        double multiply = 1;
        for (Double numbers : doubleValues) {
            multiply = multiply * numbers;
            System.out.println(multiply);
        }

        System.out.println();

        double numbersSum = 0;
        for (Double numbers : doubleValues) {
            numbersSum = numbersSum + Math.ceil(numbers) - numbers;
        }
        System.out.println(numbersSum);
    }
}
