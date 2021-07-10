package main.java.practice.week5.sun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedArrays {

    public static void main(String[] args) {

        List<String> arrayedList = new ArrayList<>();
        List<String> linkerList = new LinkedList<>();

        long t0 = System.currentTimeMillis();

        for (int i = 0; i <= 10000000; i++) {
            arrayedList.add("bugagasa");
        }

        long t1 = System.currentTimeMillis();
        System.out.println("ArrayList Time: "+ (t1 - t0));

        for (int n = 0; n <= 10000000; n++) {
            linkerList.add("newgagasha");
        }

        t0 = System.currentTimeMillis();

        System.out.println("LinkedList Time: " + (t0 - t1));


    }


}
