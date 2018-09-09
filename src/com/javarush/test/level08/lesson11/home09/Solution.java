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
        System.out.println("JANUARY 1 2000 = " + isDateOdd("JANUARY 1 2000"));
        System.out.println("JANUARY 2 2020 = " + isDateOdd("JANUARY 2 2020"));
        System.out.println("MAY 1 2013 = " + isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date){
        LocalDate now = LocalDate.now();
        LocalDate firstDayOfYear = now.with(firstDayOfYear());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(convertToLower(date), dateTimeFormatter);

        long days = ChronoUnit.DAYS.between(firstDayOfYear, localDate);

        if (days%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String convertToLower(String string) {
        char [] words = string.toCharArray();
        words[0] = Character.toUpperCase(words[0]);
        for (int i = 1; i < words.length; i++) {
            words[i] = Character.toLowerCase(words[i]);
            if(words[i] == ' ') { break; }
        }
        return String.valueOf(words);
    }
}
