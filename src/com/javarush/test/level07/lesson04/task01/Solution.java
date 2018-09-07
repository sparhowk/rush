package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Maximum of an array of 20 numbers
1. In the method initializeArray():
    1.1. Create an array of 20 numbers
    1.2. Read from the keyboard 20 numbers and fill the array with them
    2. The method max(int[] array) should find the maximum number of the elements of the array
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        //Initialize (create and fill) an array here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            String s = br.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }

    public static int max(int[] array) {
        //Find the max value here
        int x = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if ( array[i] > x)
                x = array[i];
        }
        return x;
    }
}
