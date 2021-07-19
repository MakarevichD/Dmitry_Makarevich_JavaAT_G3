package main.java.practice.week7.sat;

import static java.lang.Math.tan;
import static java.lang.Math.atan;

public class HeavyRunner {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                heavyMethod();
            }).start();
        }

    }

    public static void heavyMethod() {

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {

            double d = tan(atan(123456789.123456789));
        }
        System.out.printf("i am %s, and i have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }


}

