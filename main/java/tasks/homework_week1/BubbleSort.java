package main.java.tasks.homework_week1;

import java.util.Random;

public class BubbleSort {

    public void SortBubble() {

        int[] arrayBubble = new int[9];
        Random random = new Random();


        for (int i = 0; i < arrayBubble.length; i++) {
            arrayBubble[i] = random.nextInt(100);


            }
        for (int i = arrayBubble.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayBubble[j] > arrayBubble[j + 1]) {
                    int temp = arrayBubble[j];
                    arrayBubble[j] = arrayBubble[j + 1];
                    arrayBubble[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrayBubble.length; i++) {
            System.out.print(arrayBubble[i] + " ");
        }
    }
}
