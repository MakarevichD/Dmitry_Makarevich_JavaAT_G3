package main.java.practice.week6.sun;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdasPt2 {

    public static void main(String[] args) {

        List<String> newWords = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        boolean print = newWords.stream().anyMatch("мама"::equals);

        System.out.println(print);

        boolean oneletter = newWords.stream().allMatch(letter -> newWords.contains("м"));
        System.out.println(oneletter);

        List<String> s = newWords.stream().map(p -> p + "м").collect(Collectors.toList());
        System.out.println(s);

        List<String> b = newWords.stream().flatMap(x -> Arrays.stream(x.split("а"))).filter(s1 -> !s1.equals("")).collect(Collectors.toList());
        System.out.println(b);

    }
}
