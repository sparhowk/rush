package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Month number
    The program should read from the keyboard the name of the month and display to the screen
    its number in following way: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException, ParseException {
        //add your code here
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        Date dateMonth = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse(month);
        System.out.println(month + " is " + (dateMonth.getMonth()+1) + " month");
    }

}
