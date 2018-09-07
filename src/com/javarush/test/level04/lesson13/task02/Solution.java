package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Draw a rectangle
Write a program that reads from keyboard two numbers: m and n.
    The program should display to the screen a rectangle composed of eights sized m by n. Use “for” loop.

    Example: m=2, n=4
    8888
    8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String m = br.readLine();
        String n = br.readLine();

        int mm = Integer.parseInt(m);
        int nn = Integer.parseInt(n);

        for(int i = 1;i <= mm;i++)
            for(int j = 1;j <= nn;j++)
            {
                System.out.print("8");
                if (j == nn )
                    System.out.println("");
            }

    }
}
