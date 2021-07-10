package main.java.practice.week5.sun;


import java.util.ArrayList;
import java.util.List;

public class NewArrayList {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        String newSentense = "мама мыла раму мыла";
        String[] listArray = newSentense.split(" ");


        for (String x : listArray) {
            myList.add(x);
        }
        for (String x : myList) {
            System.out.println(x);;
        }
        for (int i= 0; i< myList.size();i++){
            System.out.println(myList.get(i));
        }


    }


}
