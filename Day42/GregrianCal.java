package com;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.Callable;

public class GregrianCal {
    public static void main(String[] args) {
        Calendar c  = Calendar.getInstance();

        System.out.println(c.getTime());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println(c.get(Calendar.HOUR));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY));
    
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020)); // true/false
        System.out.println(gc.getFirstDayOfWeek());
    
    }
}
