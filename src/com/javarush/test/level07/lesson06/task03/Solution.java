package com.javarush.test.level07.lesson06.task03;

/* 5 lines in reverse order
1. Create a list of strings.
    2. Read 5 strings from keyboard, then add them to the list.
    3. Arrange them in reverse order.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
        {
            list.add(br.readLine());
        }

        for (int i = 0; i < list.size(); i++)
        {
            int x = list.size() - i -1;
            System.out.println(list.get(x));
        }
    }
}
