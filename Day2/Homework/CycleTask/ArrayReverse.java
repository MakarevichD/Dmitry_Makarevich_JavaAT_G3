package Day2.Homework.CycleTask;

import java.util.Random;

public class ArrayReverse {

    public static void ArrayReverso() {

        int[] array_4 = new int[5];
        Random random = new Random();

        for (int i = 0; i < array_4.length; i++) {
            array_4[i] = random.nextInt(100);

        }
        int n = array_4.length;
        int temp;

        for (int i = 0; i < n / 2; i++) {

            temp = array_4[n - i - 1];
            array_4[n - i - 1] = array_4[i];
            array_4[i] = temp;

        }
        for (int i = 0; i < array_4.length; i++) {
            System.out.print(array_4[i] +" ");
        }

    }
}
