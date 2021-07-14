package main.java.practice.week6.sun;

import main.java.practice.week6.sat.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        List<String> task3Words = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> badPeople = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN)
        );

        task3Words.stream().flatMap(x-> Arrays.stream(x.split("")))
                .peek(System.out::println)
                .max(String::compareTo)
                .get();
        System.out.println();


        badPeople.stream().min(Comparator.comparingInt(p-> p.age)).get();
        System.out.println();

    }
}
