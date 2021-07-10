package main.java.practice.week5.sun;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

    public static void main(String[] args) {

        Set<String> mySetIterator = new HashSet<>();
        String mamaAgain = "мама мыла раму мыла";
        String[] setListArray = mamaAgain.split(" ");


        for (String x : setListArray) {
            mySetIterator.add(x);
        }

        for (String x : setListArray) {

        }

        Iterator<String> iterator = mySetIterator.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
