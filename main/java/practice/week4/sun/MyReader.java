package main.java.practice.week4.sun;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {

    public static void read(String fileName) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
