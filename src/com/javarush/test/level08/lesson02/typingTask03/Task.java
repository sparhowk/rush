package com.javarush.test.level08.lesson02.typingTask03;

import java.util.*;

public class Task
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Stop");
        set.add("Look");
        set.add("Listen");

        for (String text : set)
        {
            System.out.println(text);
        }
    }

}
