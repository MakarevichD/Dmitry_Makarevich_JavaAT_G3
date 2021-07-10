package main.java.tasks.homework_week5.tasks;

import main.java.tasks.homework_week5.objectclasses.Person;

import java.util.ArrayList;
import java.util.List;

public class People {

    public static void main(String[] args) {

        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person(32, "Коля"));
        peoples.add(new Person(24, "Оля"));
        peoples.add(new Person(55, "Вася"));
        peoples.add(new Person(63, "Маша"));

        for (Person humans : peoples) {
            System.out.print(humans.getAge() + " ");
        }
        System.out.println();

        for (Person humans : peoples) {
            System.out.print(humans.getName() + " ");
        }
        System.out.println();

        for (int humans = 0; humans < peoples.size(); humans++) {
            System.out.println(peoples.get(humans).toString());

        }
    }
}

