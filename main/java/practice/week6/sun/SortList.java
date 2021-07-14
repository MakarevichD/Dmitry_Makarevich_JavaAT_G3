package main.java.practice.week6.sun;

import main.java.practice.week6.sat.Person;
import main.java.practice.week6.sat.PersonList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

    public static void main(String[] args) {
        List<String> newWords2 = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> goodPeople = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN)
        );

        List<String> s = newWords2.stream().sorted().collect(Collectors.toList());
        System.out.println(s);

        List<String> x = newWords2.stream().sorted((o1, o2) -> o1.compareTo(o2)).distinct().collect(Collectors.toList());
        System.out.println(x);

        List<Person> people = goodPeople.stream().sorted((o1, o2) -> {
            if (o1.sex != o2.sex) {
                return o1.sex.compareTo(o2.sex);
            }
            return o1.age - o2.age;
        }).peek(System.out::println).collect(Collectors.toList());


    }
}
