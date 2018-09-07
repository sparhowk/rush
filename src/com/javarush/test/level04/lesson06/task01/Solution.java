package com.javarush.test.level04.lesson06.task01;

/* Minimum of two numbers
Write a program that reads two numbers from keyboard and displays to the screen the minimum of these numbers.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = br.readLine();
        String sNum2 = br.readLine();
        int nNum1 = Integer.parseInt(sNum1);
        int nNum2 = Integer.parseInt(sNum2);
        if (nNum1 < nNum2 )
        {
            System.out.println(nNum1);
        } else
        {
            System.out.println(nNum2);
        }
    }
}