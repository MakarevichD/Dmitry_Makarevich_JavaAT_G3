package main.java.practice.week7.sat;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class JoinTask {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(JoinTask::heavyMethod);
        Thread t2 = new Thread(JoinTask::heavyMethod);
        Thread t3 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            heavyMethod();
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t3.setPriority(Thread.MIN_PRIORITY);
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

