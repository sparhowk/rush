package com.javarush.test.level07.lesson08.Lesson08.Example03;
/*
*   Delete all the numbers greater than 5
*/

import java.io.*;
import java.util.ArrayList;

public class Example
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size();) // put increment i inside the loop
        {
            if (list.get(i) > 5)
                list.remove(i); // do not increase i if the current entry is deleted
            else
                i++;
        }
    }
}
