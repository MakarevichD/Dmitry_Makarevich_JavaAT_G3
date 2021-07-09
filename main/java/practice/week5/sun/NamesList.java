package main.java.practice.week5.sun;

import java.util.ArrayList;
import java.util.List;

public class NamesList {

    public static void main(String[] args) {

        List<String> names = new ArrayList();
        names.add("zina");
        names.add("petya");
        names.add("klava");
        names.add("ignat");
        names.add("galya");

        for (String x : names) {
            System.out.println(x);
        }

        names.add(2, "Zina");
        names.add(4, "Katya");

        for (int i = 0; i<names.size();i++){
            System.out.println("===========");
        }
        names.remove("Zina");
        names.remove(3);

        for(String name : names){
            System.out.println(name + " ");
        }


        /*System.out.println();
        System.out.println(names.get(1));
        System.out.println(names.get(3));*/
    }
}
