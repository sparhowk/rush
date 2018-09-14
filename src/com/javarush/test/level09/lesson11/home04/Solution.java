package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* Date converter
    Read from the keyboard a date in the format «08/18/2013»
    Display to the screen that date in the form of «AUG 18, 2013».
    Use the objects Date and SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        DateFormat myDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String userDate = bufferedReader.readLine();
        Date date = new Date(userDate);
        System.out.println(myDateFormat.format(date).toUpperCase());
    }
}
