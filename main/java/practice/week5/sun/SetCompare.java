package main.java.practice.week5.sun;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCompare {

    public static void main(String[] args) {

        Set<String> myHashList = new HashSet<>();
        Set<String> myTreeList = new TreeSet<>();

        long t0 = System.currentTimeMillis();

        for (int i = 0; i <= 10000000; i++) {
            myHashList.add("bugagasa");
        }

        long t1 = System.currentTimeMillis();
        System.out.println("HashList Time: " + (t1 - t0));

        t0 = System.currentTimeMillis();

        Iterator<String> iterator = myHashList.iterator();
        while (iterator.hasNext()) {
            iterator.next();

        }

        t1 = System.currentTimeMillis();
        System.out.println("Hashlist Read Time :" + (t0 - t1));

        t0 = System.currentTimeMillis();

        for (int n = 0; n <= 1000000; n++) {
            myTreeList.add("newgagasha");

        }
        t1 = System.currentTimeMillis();
        System.out.println("Treelist Time: " + (t1 - t0));

        Iterator<String> iterator2 = myHashList.iterator();
        while (iterator.hasNext()) {
            iterator2.next();
            System.out.println();

        }

    }
}
