package com;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Practice {
    public static void main(String[] args) {
        
        // P1
        ArrayList<String > ar = new ArrayList<>();
        ar.add("S 1");
        ar.add("S 2");
        ar.add("S 3");
        ar.add("S 4");
        ar.add("S 5");

        for(Object o : ar){
            // System.out.println(o);
        }


        // P2
        HashSet<Integer> s = new HashSet<>();

        s.add(12);
        s.add(14);
        s.add(42);
        s.add(18);
        s.add(12);

        // System.out.println(s);

        // P3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE));

        
        // P4
        

    }
}
// avac -d . Practice.java && java com/Practice