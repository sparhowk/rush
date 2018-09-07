package com.javarush.test.level07.lesson08.Example01;
/*
      Reading list of numbers from keyboard
*/
import java.io.*;
import java.util.*;

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
            list.add(Integer.parseInt(s));
        }
    }
}
