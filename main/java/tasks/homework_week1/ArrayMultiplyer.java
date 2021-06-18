package main.java.tasks.homework_week1;

import java.util.Random;

public class ArrayMultiplyer {

    public void multiplyIt (){

        int[] array3 = new int[9];
        Random random = new Random();


        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(100);

        }
        int count = 0;
        for (int i : array3) {
            System.out.println("element [" + count++ + "] is " + i*5);

        }

    }


}
