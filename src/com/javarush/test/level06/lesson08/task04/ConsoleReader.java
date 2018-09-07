package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Class ConsoleReader
Write a class ConsoleReader, which will have 4 static methods:
    - String readString() to read strings from keyboard
    - int readInt() to read numbers from keyboard
    - double readDouble() to read fractional numbers from keyboard
    - void readLn() to wait for pressing enter [use readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        return string;
    }

    public static int readInt() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        return number;
    }

    public static double readDouble() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double fractional = Double.parseDouble(br.readLine());
        return fractional;
    }

    public static void readLn() throws Exception
    {
        readString();
    }
}
