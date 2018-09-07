package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Draw lines
Write a program that displays
    -	a horizontal line of 10 eights
    -	a vertical line of 10 eights
    Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for(int i = 0;i < 9;i++)
            System.out.print("8");
        for(int i = 0;i < 11;i++)
            for(int j = 0;j < 1;j++)
                System.out.println("8");

    }
}
