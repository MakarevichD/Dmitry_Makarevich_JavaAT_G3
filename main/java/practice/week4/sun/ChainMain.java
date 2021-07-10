package main.java.practice.week4.sun;

import main.java.practice.week3.mathStr.Person;

public class ChainMain {

    public static void main(String[] args) {

        method1("bui", 4, true, new Person("vasya", 22, 21, 41), "hello");

    }

    private static void method1(String word, int number, boolean condition, Person human, String doubleWord) {
        System.out.println("im method1" + word + number + condition + human + doubleWord);
        method2(number, condition, human, doubleWord);

    }

    private static void method2(int number, boolean condition, Person human, String doubleWord) {
        System.out.println("im method2" + number + condition + human + doubleWord);
        method3(condition, human, doubleWord);
    }

    private static void method3(boolean condition, Person human, String doubleWord) {
        System.out.println("im method3" + condition + human + doubleWord);
        method4(human, doubleWord);
    }

    private static void method4(Person human, String doubleWord) {
        System.out.println("im method4" + human + doubleWord);
        method5(doubleWord);
    }

    private static void method5(String doubleWord) {
        System.out.println("im method5" + doubleWord);

    }
}
