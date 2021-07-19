package main.java.practice.week7.sat;

import java.util.stream.IntStream;

public class Thread2_task2 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            IntStream.range(0, 20).forEach(i -> System.out.println("t1 " + i));
        });
        Thread t2 = new Thread(() -> {
            IntStream.range(0, 20).forEach(i -> System.out.println("t2 " + i));
        });
        Thread t3 = new Thread(() -> {
            IntStream.range(0, 20).forEach(i -> System.out.println("t3 " + i));
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
