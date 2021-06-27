package main.java.practice.week4.sun;

import java.util.Scanner;

public class ConsoleTrainer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            String incoming = scanner.nextLine();

            if (incoming.equals("Flugegehaimen")){
                return;
            }

            System.out.printf ("Just got text", incoming);
        }
    }
}