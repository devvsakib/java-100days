package com;

import java.time.*;

public class TimeAPI {
    public static void main(String[] args) {
        LocalDate dn = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        
        
        System.out.println(dn);
        System.out.println(lt.getHour());
        System.out.println(ldt);
    }    
}


/*
    Java.time package
    LocalDate
    LocalTime
    LocalDateTime
    DateTimeFormatter

*/

// javac -d . TimeAPI.java && java com/TimeAPI