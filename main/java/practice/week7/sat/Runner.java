package main.java.practice.week7.sat;

import java.util.stream.IntStream;

public class Runner {

    public static void main(String[] args) {

        ThreadsExample threadRun = new ThreadsExample();
        threadRun.start();


        Thread threadRun2 = new Thread (() -> IntStream.range(0,20).forEach(System.out::println));
        threadRun2.start();




    }
}
