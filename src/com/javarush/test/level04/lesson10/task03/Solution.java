package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* You can never have too much of a good thing
Write a program that reads from keyboard a string and number N.
    Program should display to the screen the string N times. Use “while” loop.
    Example input:
    abc
    2
    Example output:
    abc
    abc
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String sN = br.readLine();
        int nN = Integer.parseInt(sN);
        int i = 1;
        while (i <= nN)
        {
            System.out.println(text);
            i++;
        }
    }
}
