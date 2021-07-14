package main.java.tasks.homework_week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InchToCm {

    public static void main(String[] args) {

        int n = 1;
        int c = 21;
        IntStream.range(n, c)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println(i * 2.54 + " cm in inch"))
                .reduce((s1, s2) -> s1 + s2)
                .ifPresent(System.out::println);


    }
}
