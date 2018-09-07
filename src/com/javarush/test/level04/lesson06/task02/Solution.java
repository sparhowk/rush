package com.javarush.test.level04.lesson06.task02;

/* Maximum of four numbers
Write a program that reads four numbers from keyboard and displays to the screen the maximum of these numbers.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = br.readLine();
        String sNum2 = br.readLine();
        String sNum3 = br.readLine();
        String sNum4 = br.readLine();
        int nNum1 = Integer.parseInt(sNum1);
        int nNum2 = Integer.parseInt(sNum2);
        int nNum3 = Integer.parseInt(sNum3);
        int nNum4 = Integer.parseInt(sNum4);

        int max0, max1, max2;
        max1 = max(nNum1, nNum2);
        max2 = max(nNum3, nNum4);
        max0 = max(max1,max2);
        prn(max0);
    }

    public static int max(int a, int b)
    {
        int max = (a > b) ? a : b;
        return max;
    }

    public static void prn(Integer s)
    {
        System.out.println(s);
    }
}
