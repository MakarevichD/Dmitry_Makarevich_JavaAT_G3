package main.java.practice.week4.sun;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {


    public static void write(String fileName, String text) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));

        //out.write("hello again,ignat\r\n");
        out.write(text);
        out.close();


    }
}
