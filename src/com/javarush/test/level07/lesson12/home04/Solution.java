package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Read strings from the keyboard until user enters the string “end”
Create a list of strings.
    Read from the keyboard strings (whatever you want), add them to the list.
    Read strings from the keyboard until user enters the string “end”. “end” should be omitted.
    Display to the screen the strings. Each string should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String string = reader.readLine();
            if (string.equals("end")) break;
            list.add(string);
        }

        for (String str: list)
        {
            System.out.println(str);
        }
    }
}
