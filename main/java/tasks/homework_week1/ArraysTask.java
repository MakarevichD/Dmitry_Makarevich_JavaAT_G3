package main.java.tasks.homework_week1;

import java.util.Random;

public class ArraysTask {

    public void testArray() {

        int[] arrayAlpha = new int[7];
        Random random = new Random();
        // random.nextInt(100);

        for (int i = 0; i < arrayAlpha.length; i++) {
            arrayAlpha[i] = random.nextInt(100);

        }
        int count = 0;
        for (int i : arrayAlpha) {
            System.out.println("element [" + count++ + "] is " + i);
        }


    }
}
