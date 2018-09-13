package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* List of arrays of numbers
Create a list whose elements are arrays of numbers. Add to the list five object arrays with length 5, 2, 4, 7, 0, respectively.
    Fill arrays with any data and display them on the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //add your code here
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
