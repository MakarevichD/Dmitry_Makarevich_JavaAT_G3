package main.java.tasks.homework_week2;

import java.util.Random;

public class SumByMM {

    public void CurrentMonthDate(int n) {

        int[] array = new int[12];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % n == 0) {
                System.out.print(array[i] + " ");
                a = array[i] + a;
            }
        }

        System.out.println();
        System.out.print(a);
        System.out.println();
    }
}

