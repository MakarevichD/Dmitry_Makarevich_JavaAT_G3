package main.java.tasks.homework_week4;

import java.util.Scanner;

public class ScanNextMonth {

    public void printNextMonth(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month number (1-2)");
        while (scanner.hasNext()){

            String enterId = scanner.nextLine();


            if (enterId.equals("1")) {
                System.out.println("Next month is February");
            } else if (enterId.equals("2")){
                System.out.println("Next month is March");
            } else System.out.println("Enter correct number");

        }
    }

}
/*switch (enterId) {

                case 1:
                    enterId.equals("1");
                    System.out.println("Next month is February");
                    break;
                case 2:
                    enterId.equals("2");
                    System.out.println("Next month is March");
                    break;
                default:
                    System.out.println("Enter 1 or 2");
            }*/