package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* The number of letters
    Read from the keyboard 10 strings and count the number of different letters in them (for all 26 letters of the alphabet).
    Display the result to the screen.
    Example output:
    a 5
    b 8
    c 3
    d 7
    …
    z 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countLetter;
        //ABC
        String abc = "abcdefghijklnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //String reading
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //add your code here
        ArrayList<Character> listLetters = new ArrayList<Character>();
        for (int i = 0; i < list.size(); i++) {
            char[] listOfChar = list.get(i).toCharArray();
            for (int j = 0; j < listOfChar.length; j++) {
                listLetters.add(listOfChar[j]);
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            countLetter = 0;
            for (int j = 0; j < listLetters.size(); j++) {
                if (listLetters.get(j).equals(alphabet.get(i))) {
                    countLetter++;
                }
            }
            System.out.println(abc.charAt(i) + " " + countLetter);
        }
    }
}
