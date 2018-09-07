package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Duplicate the words
1. Read from the keyboard 10 words/strings, add them into a string list.
    2. The method doubleValues should duplicate words according to the pattern a,b,c -> a,a,b,b,c,c.
    3. Display the result. Each element of list should be on a new line. Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Read strings and init ArrayList list here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            list.add(br.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String x: result)
        {
            System.out.println(x);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            list.add(i, list.get(i));
            i++;
        }
        return list;
    }
}
