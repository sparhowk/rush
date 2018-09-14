package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Learning and practicing algorithm.
Task: Read from the keyboard the list of words and numbers. Display to the screen words in ascending order and the numbers in descending order.

    Example input:
    Cherry
    1
    Bean
    3
    Apple
    2
    0
    Watermelon

    Example output:
    Apple
    3
    Bean
    2
    Cherry
    1
    0
    Watermelon
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //add your code here
    }

    //String compare method: '?' greater then 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //Is string a number?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //Contains '-' inside string
                    || (!Character.isDigit(c) && c != '-') ) // Not a digit, does not begin with '-'
            {
                return false;
            }
        }
        return true;
    }
}
