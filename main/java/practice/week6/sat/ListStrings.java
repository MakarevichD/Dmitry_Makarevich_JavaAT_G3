package main.java.practice.week6.sat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ListStrings {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("мама","мыла","раму","мама", "чисто");
        words.stream().findFirst().orElse("мама");
        System.out.println(words.stream().findFirst());

        words.stream().filter("мама" :: equals).findFirst().get();
        System.out.println(words.stream());

        words.stream().skip(4).findFirst().get();
        System.out.println(words.stream());

        Object[] y = words.stream().skip(2).limit(2).toArray();
        System.out.println(y);

        words.stream().filter(s->s.contains("м")).distinct().collect(Collectors.toList());
        words.forEach(System.out::println);




    }

}
