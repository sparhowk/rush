package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Vowels and consonants
Write a program that reads line from the keyboard.
    The program should display to the screen two strings:
    1) the first string should contain vowels
    2) the second string should contain consonants and punctuation characters from the entered text.
    Separate characters by spaces.

    Example input:
    Stop look listen.
    Example output:
    o o o i e
    s t p l k l s t n .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        String vowels = vowels = new String();
        String consonants = new String();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String textFromUser = reader.readLine();

        for (int i = 0; i < textFromUser.length(); i++) {
            if (textFromUser.charAt(i) == ' ') {
                continue;
            }
            else if (isVowel(textFromUser.charAt(i)))
            {
                vowels += textFromUser.charAt(i) + " ";
            } else
                consonants += textFromUser.charAt(i) + " ";
        }
        System.out.println(vowels.trim());
        System.out.println(consonants.trim());
    }


    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

    //Method checks whether the letter is a vowel
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //transform character to lowercase

        for (char d : vowels)   //Looking among the array of vowels
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
