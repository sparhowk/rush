package com.javarush.test.level08.lesson11.home09;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

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
        System.out.println("JANUARY 1 2000 = " + isDateOdd("JANUARY 1 2000"));
        System.out.println("JANUARY 2 2020 = " + isDateOdd("JANUARY 2 2020"));
        System.out.println("MAY 1 2013 = " + isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date){
        Date dateFromUser = new Date(date);
        Date startDateFromUser = new Date(date);
        startDateFromUser.setHours(0);
        startDateFromUser.setMinutes(0);
        startDateFromUser.setSeconds(0);
        startDateFromUser.setDate(1);
        startDateFromUser.setMonth(0);
        long caluclateDate = dateFromUser.getTime() - startDateFromUser.getTime();
        long caluclateMS = 1000 * 60 * 60 * 24;
        int calulateDays = (int) (caluclateDate / caluclateMS);

        if (calulateDays%2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
