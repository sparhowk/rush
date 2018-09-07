package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Three arrays
1. Read from the keyboard 20 numbers, save them in a list, then sort them into three other lists:
    List 1 stores numbers divisible by 3 (x%3==0)
    List 2 stores numbers divisible by 2 (x%2==0)
    List 3 stores the rest of numbers.
    The numbers divisible by 3 and 2 at the same time (for example 6) belong to both lists – list 1 and list 2.
    2. The method printList() should display each element of the list on a new line.
    3. Use the method printList() to display to the screen these three lists. First the list 1 should be displayed, then list 2, after that list 3.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);

            if ((x % 3 == 0) & (x % 2 == 0))
            {
                list1.add(x);
                list2.add(x);
            }
            else if (x % 3 == 0) list1.add(x);
            else if (x % 2 == 0) list2.add(x);
            else list3.add(x);

        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list)
    {
        for (Integer i: list)
        {
            System.out.println(i);
        }
    }

    public static void readList(List<Integer> list) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            String s = br.readLine();
            int x = Integer.parseInt(s);
            list.add(x);
        }
    }


}
