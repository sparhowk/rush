package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Largest and smallest number in an array
Create an array of 20 numbers.
    Fill it with numbers that are read from keyboard.
    Find the largest and smallest number in an array.
    Display to the screen the largest and smallest numbers separated by a space.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++)
        {
            String str = reader.readLine();
            int strNumber = Integer.parseInt(str);
            numbers.add(strNumber);
        }

        minimum = numbers.get(0);
        maximum = numbers.get(0);
        for (int x : numbers)
        {
            if (minimum > x)
                minimum = x;
            if (maximum < x)
                maximum = x;
        }

        System.out.println(maximum);
        System.out.println(maxFuntion(numbers));
        System.out.println(minimum);
        System.out.println(minFunction(numbers));
    }

    public static int minFunction(ArrayList<Integer> list)
    {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++)
        {
            min = (min < list.get(i)) ? min : list.get(i);
        }
        return min;
    }

    public static int maxFuntion(ArrayList<Integer> list)
    {
        int max = list.get(0);
        for (int x : list)
        {
            max = (max > x) ? max : x;
        }
        return max;
    }
}
