package main.java.practice.week6.sat;

import java.util.Arrays;
import java.util.List;

public class PersonList {

    public static void main(String[] args) {

        List<Person> boysGirls = Arrays.asList(
                new Person("Vasya", 13, Person.Sex.MAN),
                new Person("Katya", 28, Person.Sex.WOMAN),
                new Person("Vova", 24, Person.Sex.MAN),
                new Person("Masha", 38, Person.Sex.WOMAN),
                new Person("Roman Petrovich", 72, Person.Sex.MAN)
        );
        int peopleCounter = 0;
        for (Person person : boysGirls) {
            if ((person.sex == Person.Sex.MAN && person.age > 18 && person.age < 60) || (person.sex == Person.Sex.WOMAN && person.age > 18 && person.age < 55)) {
                peopleCounter++;

            }
        }
        System.out.println(peopleCounter);

        long x = boysGirls.stream().filter(person -> person.age >= 18).filter(person -> person.age < 55 || (person.sex == Person.Sex.MAN && person.age < 60)).count();


        System.out.println(x);
    }
}

