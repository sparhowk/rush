package com.javarush.test.level09.lesson06.task04;

import java.util.ArrayList;

/* Exception when operating with List collections
Catch the exception that occurs when run the code:
    ArrayList<String> list = new ArrayList<String>();
    String s = list.get(18);
    Display the exception to the screen, specifying its type.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        try {

            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (Exception e) {
            //add your code here
            System.out.println(e);
        }
    }
}
