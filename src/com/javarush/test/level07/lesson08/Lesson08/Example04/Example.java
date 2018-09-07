package com.javarush.test.level07.lesson08.Lesson08.Example04;
/*
*   Divide an array into two arrays of even and odd numbers
*/

import java.io.*;
import java.util.ArrayList;

public class Example
{
    public static void main(String[] args)
    {
        int[] data = {1, 2, 5, 7, 12, 54, 12, 27};  // static array initialization
        ArrayList<Integer> list = new ArrayList<Integer>(); //create a list where all elements are of Integer type

        for (int i = 0; i < data.length; i++) //fill the list from the data array
        {
            list.add(data[i]);
        }

        ArrayList<Integer> even = new ArrayList<Integer>(); //List of even numbers
        ArrayList<Integer> odd = new ArrayList<Integer>();  //List of  odd numbers

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)                         // check if x is even
                even.add(x);                        // add x to the collection of even numbers
            else
                odd.add(x);                         // add x to the collection of odd numbers
        }
    }
}
