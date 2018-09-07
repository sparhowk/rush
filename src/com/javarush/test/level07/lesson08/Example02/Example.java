package com.javarush.test.level07.lesson08.Example02;
/*
*   Reading list of numbers from keyboard, even numbers are added to the end of list,
*   odd numbers are added to be beginning of list.
*/

import java.io.*;
import java.util.ArrayList;

public class Example
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true)
        {
            String s = br.readLine();
            if (s.isEmpty()) break;
            int x = Integer.parseInt(s);

            if (x % 2 == 0)   //check that the remainder of division by two equals zero
                list.add(x);  //add to the end
            else
                list.add(0,x); //add to the beginning list
        }
    }
}
