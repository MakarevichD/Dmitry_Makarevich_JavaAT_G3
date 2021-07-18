package main.java.practice.week7.sat;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class SleepTask {

    public static void main(String[] args) {

        Thread t1 = new Thread(SleepTask::heavyMethod);
        Thread t2 = new Thread(SleepTask::heavyMethod);
        Thread t3 = new Thread(SleepTask::heavyMethod);

        t1.start();
        t2.start();
        t3.start();

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
