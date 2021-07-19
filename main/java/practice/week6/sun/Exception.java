package main.java.practice.week6.sun;

public class Exception {

    public static void main(String[] args) {

        try {
            new ExceptionCatch().doSomething();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

        int a = 2;
        int b = 0;

        int[] array = {1, 2};


        try {


            System.out.println(array[3]);
            System.out.println(a / b);



        } catch (ArithmeticException e) {
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("bugaga");

    }
}
