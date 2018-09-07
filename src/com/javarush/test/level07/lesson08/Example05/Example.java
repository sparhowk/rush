package com.javarush.test.level07.lesson08.Example05;
/*
*   Merging lists
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Example
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();        // create a list
        Collections.addAll(list1, 1, 4, 6, 8, 9, 19, 22); // fill the list

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 23, 41, 56, 232, 455, 554, 56);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);           // add all the values from one list to another
        result.addAll(list2);

        for (Integer x : result)  // quick "for" through all the elements, for collections only ( loop foreach )
        {
            System.out.println(x);
        }
    }
}
