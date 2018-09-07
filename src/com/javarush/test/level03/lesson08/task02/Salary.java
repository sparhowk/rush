package java.level03.lesson08.task02;
/* Salary in 5 years
Write a program that reads from keyboard a name and two numbers. Program should display the text:
    «name» earns «number1» in «number2» years.

    Example:
    Nick earns $150,000 in 5 years.
*/

import java.io.*;
public class Salary {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sNumber1 = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber1);
        String sNumber2 = reader.readLine();
        int nNumber2 = Integer.parseInt(sNumber2);
        String s = name + " earns " + nNumber1 + " in " + nNumber2 + " years.";
        System.out.print(s);
    }
}
