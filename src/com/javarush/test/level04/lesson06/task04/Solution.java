package com.javarush.test.level04.lesson06.task04;

/* Compare names
Write a program that reads two names from keyboard, and if the names are the same, displays «Names are identical».
    Display «Name lengths are equal» if the names are different, but their lengths are equal.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String names1 = br.readLine();
        String names2 = br.readLine();
        if (names1.equals(names2))
        {
            System.out.println("Names are identical");
        } else if (names1.length() == names2.length())
        {
            System.out.println("Name lengths are equal");
        }
    }
}
