package com.javarush.test.level04.lesson06.task06;

/* 18 is enough
Write a program that reads a name and age from keyboard.
    If the age is more than 20 display «18 is enough»
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String sAge = br.readLine();

        int nAge = Integer.parseInt(sAge);
        if (nAge > 20 )
            System.out.println("18 is enough");
    }
}
