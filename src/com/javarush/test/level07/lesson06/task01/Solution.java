package com.javarush.test.level07.lesson06.task01;

/* 5 different strings in a list
1. Create a list of strings.
    2. Add 5 different strings to the list.
    3. Display to the screen its size.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        ArrayList<String> list = new ArrayList<String>();
        list.add("Task 01");
        list.add("Task 01, Task 02");
        list.add("Task 01, Task 02, Task 03");
        list.add("Task 01, Task 02, Task 03, Task 04");
        list.add("Task 01, Task 02, Task 03, Task 04, Task 05");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
