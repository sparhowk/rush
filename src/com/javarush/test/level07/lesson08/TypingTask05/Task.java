package com.javarush.test.level07.lesson08.TypingTask05;

import java.io.*;
import java.util.ArrayList;

public class Task
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int x = Integer.parseInt(s);
            if (x % 2 == 0)
                list.add(x);
            else
                list.add(0, x);
        }
    }
}
