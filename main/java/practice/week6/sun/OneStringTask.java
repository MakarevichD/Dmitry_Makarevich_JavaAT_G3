package main.java.practice.week6.sun;

import main.java.practice.week6.sat.Person;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OneStringTask {

    public static void main(String[] args) {

        List<String> newWords2 = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> badPeople = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN)
        );
        String s = newWords2.stream().collect(Collectors.joining(":", "<p>", "</p>"));
        System.out.println(s);

        Map persona = badPeople.stream().collect(Collectors.toMap(person -> person.hashCode(), person -> person));
        System.out.println(persona);

        //Map persona2 = badPeople.stream().collect(Collectors.groupingBy(person -> person.sex)).keySet().forEach(System.out::println);


    }
}
