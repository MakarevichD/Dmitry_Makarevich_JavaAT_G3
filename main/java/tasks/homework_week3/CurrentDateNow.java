package main.java.tasks.homework_week3;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class CurrentDateNow {

    public void ShowTimeDate(){

        String pattern = "dd MMMMM yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat(pattern, new Locale("en", "BY"));

        String date = simpleDateFormat.format(new Date());
        System.out.println("Сейчас на дворе:" + date );
       // System.out.println(date);
    }


}

