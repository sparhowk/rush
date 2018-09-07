package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 words in reverse order
Read from the keyboard 5 words. Add them into a string list and display them to the screen in reverse order.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        readList(list, 5);

        for (int i = 0; i < list.size(); i++)
        {
            int index = list.size() - i - 1;
            System.out.println(list.get(index));
        }
    }

    public static void readList(ArrayList list, int x) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < x; i++)
        {
            list.add(br.readLine());
        }
    }
}
