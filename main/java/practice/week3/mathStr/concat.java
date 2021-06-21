package main.java.practice.week3.mathStr;

public class concat {
    public static void main(String[] args) {

        String s = "bugaga";

        System.out.println(s.concat("zzz"));
        System.out.println(s + " lol");

        StringBuilder newString = new StringBuilder();


        for (int i = 0; i<10000; i++);{
            newString.append ("l1_l2_l3##");
        }
        System.out.println(newString);


    }
}
