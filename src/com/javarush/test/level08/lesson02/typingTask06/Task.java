package com.javarush.test.level08.lesson02.typingTask06;

import java.util.*;

public class Task
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Stop");
        set.add("Look");
        set.add("Listen");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())
        {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
