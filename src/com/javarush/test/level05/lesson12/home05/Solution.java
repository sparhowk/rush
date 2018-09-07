package com.javarush.test.level05.lesson12.home05;
/* Read numbers from keyboard and calculate their total
Read numbers from keyboard and calculate their total until the user enters the word «total». Display to the screen the total.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        while(true){
            String s = scan.readLine();
            if(s.equals("сумма")){  // Zamiast total dać to <----------сумма
                System.out.println(total);
                break;
            }
            total += Integer.parseInt(s);
        }
    }
}

/*

package com.javarush.test.level05.lesson12.home05;

Read numbers from keyboard and calculate their total
Read numbers from keyboard and calculate their total until the user enters the word «total». Display to the screen the total.


import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0, number;
        String word, exit="сумма";

        while (true)
        {
            word = br.readLine();
            try
            {
                number = Integer.parseInt(word);
                total += number;
            }
            catch (NumberFormatException e)
            {
                if (word.equals(exit))
                    break;
                else
                    continue;
            }
        }
        System.out.println("Total : " + total);
    }
}


 */