package java.level03.lesson08.task04;
/* Sponsor! That has a proud sound!
Write a program that reads from keyboard two names and displays the text:
    «name1» sponsored «name2», and she became a famous singer.

    Example:
    Nick sponsored Helen, and she became a famous singer.
*/
import java.io.*;
public class Sponsor {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String s = name1 + " sponsored " + name2 + ", and she became a famous singer.";
        System.out.print(s);

    }
}
