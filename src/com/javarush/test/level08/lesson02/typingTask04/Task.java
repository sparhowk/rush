package com.javarush.test.level08.lesson02.typingTask04;

import java.util.ArrayList;
import java.util.List;

public class Task
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Stop");
        list.add("Look");
        list.add("Listen");

        for (String text : list)
        {
            System.out.println(text);
        }
    }
}
