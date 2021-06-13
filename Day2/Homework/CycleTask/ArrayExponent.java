package Day2.Homework.CycleTask;

import java.util.Random;

public class ArrayExponent {

    public static void ExponentIt() {

        int[] array3 = new int[3];
        Random random = new Random();


        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(100);

        }
        int count = 0;
        for (int i : array3) {
            System.out.println("Element [" + count++ + "] is " + i);
            System.out.println("Exponent " + i * i);
        }

    }

}
