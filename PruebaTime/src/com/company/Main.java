package com.company;

import java.sql.Time;
import java.util.Calendar;

public class Main
{

    public static void main(String[] args)
    {
        Time t = Time.valueOf("17:30:00");
        Time t2 = Time.valueOf(Calendar.getInstance().getTime().toString().substring(11, 19));

        System.out.println(t2);
        System.out.println(t.compareTo(t2));
        // -1 si es menor; 0 si es igual; 1 si es mayor
    }
}
