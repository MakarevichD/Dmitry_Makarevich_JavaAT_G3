package main.java.tasks.homework_week2;

import java.util.Random;

public class nElementsArraySum {

    public void nRandomArray(int n) {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        System.out.println("Array's numbers");
        for (int i : array) {

            System.out.print(i + " / ");
        }

        System.out.println();


        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % n == 0) {
                System.out.print(array[i] + " / ");
                a = array[i] + a;
            }
        }
        System.out.println();

        System.out.print(a);
    }

}
