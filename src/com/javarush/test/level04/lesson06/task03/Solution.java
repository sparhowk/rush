package com.javarush.test.level04.lesson06.task03;

/* Sort three numbers
Write a program that reads three numbers from keyboard and displays them in descending order.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nNum1 = Integer.parseInt(br.readLine());
        int nNum2 = Integer.parseInt(br.readLine());
        int nNum3 = Integer.parseInt(br.readLine());
        int a, b, c;
        a = min3(nNum1, nNum2, nNum3);
        b = midle(nNum1, nNum2, nNum3);
        c = max3(nNum1, nNum2, nNum3);
        System.out.print(c + " ");
        System.out.print(b + " ");
        System.out.print(a);
    }
    public static int min2(int a, int b)
    {
        int wynik = (a<b) ? a:b;
        return wynik;
    }
    public static int min3(int a, int b, int c)
    {
        int x = min2(a,b);
        int wynik = min2(x,c);
        return wynik;
    }
    public static int max2(int a, int b)
    {
        int wynik = (a>b) ? a:b;
        return wynik;
    }
    public static int max3(int a, int b, int c)
    {
        int x = max2(a,b);
        int wynik = max2(x,c);
        return wynik;
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
