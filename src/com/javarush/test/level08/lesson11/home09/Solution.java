package com.javarush.test.level08.lesson11.home09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
        System.out.println("January 11 2018 = " + isDateOdd("January 11 2018"));

    }

    public static boolean isDateOdd(String date){
        LocalDate now = LocalDate.now();
        LocalDate firstDayOfYear = now.with(firstDayOfYear());

        String testDate = "January 11 2018";
//        DateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        //            Date date1 = simpleDateFormat.parse(testDate);
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);

        long days = ChronoUnit.DAYS.between(firstDayOfYear, localDate);
        System.out.println(days);

        if (days%2 == 0) {
            System.out.println("Parzyste");
            return true;
        } else {
            System.out.println("Nie parzyste");
            return false;
        }
    }
}
