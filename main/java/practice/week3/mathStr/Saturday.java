package main.java.practice.week3.mathStr;

import java.util.Objects;

public class Saturday {


    public static void main(String[] args) {


        Person person1 = new Person("Petruxa", 23, 181, 100);
        Person person2 = new Person("Ignat", 23, 181, 100);
        Person person3 = new Person("Igor", 47, 183, 100);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());


        System.out.println(person1.equals(person2));

        System.out.println(person1.toString());


        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());




    }
}
