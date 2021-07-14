package main.java.practice.week6.sun;


import java.util.Arrays;
import java.util.List;

public class Reducelamda {
    public static void main(String[] args) {

        List<String> wordReduce = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        long s = wordReduce.stream().flatMap(x -> Arrays.stream(x.split(""))).count();

        System.out.println(s);

        long d = wordReduce.stream().mapToInt(String::length).sum();
        System.out.println(d);

        long f = wordReduce.stream().map(String::length).reduce((x, y) -> x + y).get();
        System.out.println(f);

    }


}
