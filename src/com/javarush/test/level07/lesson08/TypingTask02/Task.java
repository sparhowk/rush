package com.javarush.test.level07.lesson08.TypingTask02;

import java.io.*;
import java.util.ArrayList;

public class Task
{
    public static void main(String[] args) throws IOException
    {
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }
    }
}
