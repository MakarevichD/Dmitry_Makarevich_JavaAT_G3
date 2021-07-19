package main.java.practice.week7.sat;

import java.util.concurrent.atomic.AtomicLong;

public class ConcurrentMap {


    public static void main(String[] args) {


        Object newSync = new Object();
        AtomicLong myCounter = new AtomicLong();

        Thread t1 = new Thread(() -> {
            synchronized (newSync) {
                for (int j = 0; j < 1_000_000; j++) {
                    myCounter.getAndIncrement();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (newSync) {
                for (int j = 0; j < 1_000_000; j--) {
                    myCounter.getAndDecrement();
                }
            }
        });
        t1.start();
        t2.start();
        System.out.println(myCounter.get());

    }

}
