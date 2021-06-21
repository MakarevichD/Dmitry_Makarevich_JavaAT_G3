package main.java.practice.week3.mathStr;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class dateTime {

    public static void main(String[] args) throws ParseException {

        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = formatter.parse("21.06.2001");
        System.out.println(date.toString());

        }
    }
