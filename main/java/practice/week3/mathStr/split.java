package main.java.practice.week3.mathStr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class split {

    public static void main(String[] args) {

    //    //Pattern p = Pattern.compile("\\d");
      //  Matcher m = p.matcher("mama myla ramu; ignat el mylo; tanya pil313a shampun");


     //   System.out.println(m.group());


        String s = " ma9201ma myla ra980mu; ignat el mylo; tanya pil313a shampun122";
        String[] array = s.split("\\D+"); // исключает цфиры, перекидывает на новую строку
        System.out.println(s.replaceAll("\\D",""));
        //String [] array = s.split(";");

        for (String x : array) {
            System.out.println(x);

        }

    }
}
