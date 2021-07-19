package main.java.tasks.homework_week3;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class CurrentDateNow {

    public void ShowTimeDate(){

        String pattern = "dd MMMM yyyy HH:mm";
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat(pattern, new Locale("ru", "BY"));

        String date = simpleDateFormat.format(new Date());
        System.out.println("Сейчас на дворе: " + date );
       // System.out.println(date);
    }


}

