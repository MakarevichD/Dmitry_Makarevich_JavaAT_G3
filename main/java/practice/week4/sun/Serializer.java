package main.java.practice.week4.sun;

import main.java.practice.week3.mathStr.Person;

import java.io.*;

public class Serializer {


    private static Object Person;

    public static void serializeWrite() throws IOException {

        FileOutputStream fos = new FileOutputStream("person.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person("vasya", 21, 172, 88));
        oos.close();


    }

    public static void deserializeRead() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("person.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();
        ois.close();
        System.out.println(person);

    }
}




