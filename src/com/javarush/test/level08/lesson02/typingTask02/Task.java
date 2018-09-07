package com.javarush.test.level08.lesson02.typingTask02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task
{
            public static void main(String[] args)
            {
                List<String> list = new ArrayList<String>();
                list.add("Stop");
                list.add("Look");
                list.add("Listen");

                Iterator<String> iterator = list.iterator();  // obtain an iterator to set

                while (iterator.hasNext())                    // check whether there are more elements
                {
                    String text = iterator.next();            // get the current iterator and move the next
                    System.out.println(text);
                }
            }
}
