package com.javarush.test.level07.lesson05.TypingTask03;

import java.io.*;
import java.util.ArrayList;

public class Task
{
    public static void main(String[] args) throws IOException
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}
