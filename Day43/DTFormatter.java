package com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DTFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        // System.out.println(dt);


        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-yyyy-mm -- E m");
        
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        
        
        String myDate = dt.format(df);
        System.out.println(myDate);

    }
}

/*
    Format date as you want.
    Example: 12-15-2222, 2222-12-15, 15-2222-12, 12-2222-15
*/

// javac -d . DTFormatter.java && java com/DTFormatter