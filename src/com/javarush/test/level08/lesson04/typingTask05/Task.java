package com.javarush.test.level08.lesson04.typingTask05;

import java.util.Date;

public class Task
{
    public static void main(String[] args) throws Exception
    {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);       //set first day of month
        yearStartTime.setMonth(0);      //set January mouth; the numbering from mouths is 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;           // how many milliseconds in one day

        int dayCount = (int) (msTimeDistance/msDay);    // the number of full days
        System.out.println("Days from start of year: " + dayCount);
    }
}
