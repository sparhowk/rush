package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Learning and practicing algorithms.
Task: Write a program that reads from keyboard 5 numbers and displays them in ascending order.
    Example input:
    3
    2
    15
    6
    17
    Example output:
    2
    3
    6
    15
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        ascendingSort(array);

        for (int x: array)
        {
            System.out.println(x);
        }
    }

    public static void ascendingSort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < (array.length - 1); j++)
            {
                if (array[j] > array[j+1])
                {
                    int x = array[j+1];
                    array[j+1] = array[j];
                    array[j] = x;
                } else continue;
            }
        }
    }
}
