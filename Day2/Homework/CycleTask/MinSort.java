package Day2.Homework.CycleTask;

import java.util.Random;

public class MinSort {

    public static void SortThis() {

        int[] arraySort = new int[5];
        Random random = new Random();


        for (int i = 0; i < arraySort.length; i++) {
            arraySort[i] = random.nextInt(100);

            }
        for (int i = 0; i < arraySort.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arraySort.length; j++) {
                if (arraySort[j] < arraySort[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arraySort[i];
            arraySort[i] = arraySort[minIndex];
            arraySort[minIndex] = temp;
        }
        for (int i = 0; i < arraySort.length; i++) {
            System.out.print(arraySort[i] + " ");
        }

    }
}
