package main.java.practice.week4.sun;

import java.io.IOException;

public class SerializeRunner {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Serializer.serializeWrite();
        Serializer.deserializeRead();
    }
}
