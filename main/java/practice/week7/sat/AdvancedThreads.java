package main.java.practice.week7.sat;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AdvancedThreads {

    static Map<Integer, Integer> concurrentMap = new ConcurrentHashMap<>();
    static int i = 0;

    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 10_000; j++) {
                concurrentMap.put(j, j);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 10000; j++) {
                concurrentMap.forEach((k, v) -> i += v);
            }
        });

        t1.start();
        t2.start();
        t2.join();
        System.out.println(i);
    }

}
