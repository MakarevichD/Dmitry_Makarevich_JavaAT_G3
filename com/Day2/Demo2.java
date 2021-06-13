package com.Day2;

import java.util.Random;

public class Demo2 {

    public static void main(String[] args) {

        foo3();


    }

    static void foo() {

        int i = 23;
        while (i < 28) {
            if (i % 13 == 0) {
                System.out.println("continue");
                break;
                //return;
                //continue;
            }
            System.out.println("i is :" + i++);
        }
        System.out.println("number is :" + i);
    }

    static void foo3() {

        int[] array = new int[10];
        Random random = new Random();
        // random.nextInt(100);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println("initial array: ");
        int count = 0;
        for (int i : array) {
            System.out.println("element [" + count++ + "] is " + i);

        }
        for (int avg : array) {
            System.out.println("Average value is :" + avg / 10);
        }


    }

    static void foo4() {

        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.print("{");
        int outerCounter = 0;
        for (int[] i : array) {


            System.out.print(" {");
            int innerCounter = 0;
            for (int e : i) {

                if (innerCounter++ < i.length - 1) {
                    System.out.print(e + ", ");
                } else {
                    System.out.print(e);
                }


            }
            if (outerCounter++ < array.length - 1) {
                System.out.println("},");
            } else {
                System.out.println("}");
            }


        }
        System.out.println("}");
    }
}