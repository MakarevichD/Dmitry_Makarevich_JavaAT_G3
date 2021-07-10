package main.java.practice.week5.sun;

import java.util.HashMap;
import java.util.Map;

public class MapList {

    public static void main(String[] args) {

        Map<Integer, String> newWords = new HashMap<Integer, String>();
        String[] mapHashArray = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < mapHashArray.length; i++) {
            newWords.put(i, mapHashArray[i]);
        }
        for (int i : newWords.keySet()) {
            System.out.println(i);
        }
        for (String b : newWords.values()) {
            System.out.println(b);
        }
        for (Map.Entry<Integer, String> entry : newWords.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
