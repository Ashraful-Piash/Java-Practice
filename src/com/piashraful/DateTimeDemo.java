package com.piashraful;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

       for(String s:  ZoneId.getAvailableZoneIds()){
           System.out.println(s);
       }

        LocalTime time = LocalTime.now(ZoneId.of("Asia/Bangkok"));
        System.out.println(time);

        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Asia/Dhaka"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
        String formattedTime = ldt.format(formatter);
        System.out.println(formattedTime);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        System.out.println(formatter1.format(ldt));


    }
}
