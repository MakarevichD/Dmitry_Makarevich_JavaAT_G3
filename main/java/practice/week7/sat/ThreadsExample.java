package main.java.practice.week7.sat;

import java.util.stream.IntStream;

public class ThreadsExample extends java.lang.Thread {

    public void run(){
        IntStream.range(0,33).forEach(System.out::println);
    }




}
