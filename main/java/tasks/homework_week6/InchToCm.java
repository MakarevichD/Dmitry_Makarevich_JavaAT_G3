package main.java.tasks.homework_week6;

import java.util.stream.IntStream;

public class InchToCm {

    public static void main(String[] args) {

        int n = 1;
        int c = 21;
        IntStream.range(n, c)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println(i * 2.54 + " cm in inch"))
                .reduce((sum1, sum2) -> sum1 + sum2)
                .ifPresent(System.out::println);


    }
}
