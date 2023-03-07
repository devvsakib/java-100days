package com;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass {
    public static void main(String[] args) {
        // Gregorian Calender
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
       
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Dhaka"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        
    }
}
