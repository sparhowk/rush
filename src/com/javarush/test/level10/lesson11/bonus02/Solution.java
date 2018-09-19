package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Add new functionality to the program.
    Old task: The program should display a pair (a number and a string) entered from the keyboard.
    New task: The program should store in HashMap pairs (a number and a string) entered from the keyboard.
    An empty string means the end of input. Numbers may be repeated.     Strings are always unique. Input data must not be lost!
    The program should display the contents of HashMap to the screen.

    Example input:
    1
    Stop
    2
    Look

    Example output:
    1 Stop
    2 Look
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> idAndNames = new HashMap<Integer, String>();

        while (true)
        {
            String idString = reader.readLine();
            if (idString.isEmpty()) break;

            String name = reader.readLine();
            if (name.equals("")) break;

            int id = Integer.parseInt(idString);
            idAndNames.put(id, name);
        }

        for (Map.Entry<Integer, String> map: idAndNames.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
