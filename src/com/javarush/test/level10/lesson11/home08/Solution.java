package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Array of string lists
Create an array whose elements are lists of strings. Fill the array with any data and display them to the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //add your code here
        ArrayList<String>[] listOfString = new ArrayList[5];

        for (int i = 0; i < listOfString.length; i++) {
            listOfString[i] = new ArrayList<>();
            listOfString[i].add("" + i);
            listOfString[i].add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam quis est sed lorem tempor fermentum ut ut lectus. Cras vel ullamcorper ");
            listOfString[i].add("felis. Sed varius non dolor sit amet euismod. Pellentesque vitae mauris pharetra, eleifend augue at, facilisis tortor. Maecenas feugiat, justo ");
            listOfString[i].add("sit amet aliquam pretium, urna eros dictum enim, et feugiat lectus ex molestie turpis. Praesent id aliquam eros. Donec euismod at mauris ");
            listOfString[i].add("quis tempor. Morbi viverra bibendum dignissim.");
        }
        return listOfString;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}