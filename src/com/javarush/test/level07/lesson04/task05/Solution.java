package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* One large and two small arrays
1. Create an array of 20 numbers.
    2. Read from keyboard 20 numbers and fill the array with them.
    3. Create two arrays of 10 numbers each.
    4. Copy numbers of the large array to two small arrays: the half of the numbers to the first array, the other half to the second one.
    5. Display to the screen the second small array. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        int[] small01 = new int[10];
        int[] small02 = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            String s = br.readLine();
            numbers[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < numbers.length; i++)
        {
            if (i < small01.length)
                small01[i] = numbers[i];
            else
                small02[i-10] = numbers[i];
        }

        for (int i = 0; i < small02.length; i++)
        {
            System.out.println(small02[i]);
        }
    }
}
