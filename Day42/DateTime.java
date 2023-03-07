package com;

public class DateTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() / 1000/3600/24/365);
    }
}

/*
 * How java stores a Date?
 * Date in java is stored in the form of a long number. This long number holds
 * the number of ms passed since 1 jan 1970.
 * 
 * Java assumes that 1900 is the start year which means it calculates year
 * passed since 1900 whenever we ask it for year passed.
 * 
 * System.CurrentTimeMillis()
 */

// javac -d . DateTime.java && java com/DateTime