package com.javarush.test.level04.lesson16.home02;

    import java.io.*;

/* Display an average
Write a program that reads from keyboard three numbers.
    The program should display to the screen the average of these numbers, that is, neither the biggest nor the smallest one.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = br.readLine();
        String sNum2 = br.readLine();
        String sNum3 = br.readLine();
        int nNum1 = Integer.parseInt(sNum1);
        int nNum2 = Integer.parseInt(sNum2);
        int nNum3 = Integer.parseInt(sNum3);

        int average = midle(nNum1, nNum2, nNum3);
        System.out.println(average);

    }


    public static int midle(int a, int b, int c)
    {
        if ((a >= b && a < c) || (a > c && a < b))
        {
            return a;
        } else if ((b >= a && b < c) || (b > c && b < a))
        {
            return b;
        } else
        {
            return c;
        }

    }
}
