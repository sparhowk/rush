package com.javarush.test.level08.lesson03.task01;

/* A plant HashSet
Create a HashSet collection of String type elements.
    Add to the collection 10 strings: watermelon, banana, cherry, pear, melon, blackberry, ginseng, strawberry, iris, and potato.
    Display to the screen the contents of the collection. Each entry should be on a new line.
    Watch how changed the order of added elements.
*/

import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        Set<String> set = new HashSet<String>();
        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("melon");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
