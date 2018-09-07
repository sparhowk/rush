package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Stop Look Listen. Now capitalized
Write a program that should read from the keyboard a string.
    The program should replace the first letters of all words in the text with the uppercase.
    Display to the screen the result.

    Example input:
    stop look listen
    Example output:
    Stop Look Listen
*/

public class Solution
{

    public static String capitalizeString(String string) {
        String [] words = string.split(" ");
        String capitalizeString = "";
        for (int i=0; i < words.length; i++) {
            capitalizeString += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " ";
        }
        return capitalizeString.trim();
    }

    public static String capitalizeString2(String string) {
        String [] words = string.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word: words ) {
            stringBuilder.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static String capitalizeString3(String string) {
        String capitalizeString = "";
        String [] words = string.split(" ");
        for (String word : words) {
            capitalizeString += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
        }
        return capitalizeString.trim();
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char [] words = s.toCharArray();
        words[0] = Character.toUpperCase(words[0]);

        for (int i = 0; i < words.length; i++) {
            if (words[i] == ' ') {
                words[i+1] = Character.toUpperCase(words[i+1]);
            }
        }
        System.out.println(words);
    }
}
