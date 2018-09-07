package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static java.time.temporal.TemporalAdjusters.firstDayOfYear;

/* Working with date
1. Implement the method isDateOdd(String date) so that it returns true, if the number of days from the beginning of the year is odd, otherwise it returns false.
    2. String date is passed in the format MAY 1 2013

    JANUARY 1 2000 = true
    JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("test"));

    }

    public static boolean isDateOdd(String date)
    {
        LocalDate now = LocalDate.now();
        LocalDate firstDayOfYear = now.with(firstDayOfYear());
        String [] dateFromUser = date.split(" ");
        Date date1 = null;
        DateFormat dateFormat = DateFormat.getDateInstance();

        String testDate = "JANUARY 1 2000";
        try {
            date1 = dateFormat.parse(testDate);
            System.out.println(date1);
        } catch (ParseException e) {
            System.out.println(e);

        }
        return true;
    }
}
