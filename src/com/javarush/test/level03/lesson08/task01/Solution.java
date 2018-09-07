/* How to conquer the world
Write a program that reads from keyboard a name and a number and displays the text:
    «name» will conquer the world in «number» years. Bwahaha!
    (The sequence of input data is important.)

    Example:
    Joe will conquer the world in 8 years. Bwahaha!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int iAge = Integer.parseInt(sAge);
        String name = reader.readLine();
        System.out.print(name + "will conqure the world in " + iAge + "years. Bwahaha!");
/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        String name = reader.readLine();
        System.out.print(name + " will conquer the world in " + nAge + " years. Bwahaha!");
*/
    }
}