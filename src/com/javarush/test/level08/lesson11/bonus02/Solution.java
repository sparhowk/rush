package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Add new functionality to the program.
Task: The program determines which family (its last name) lives in a house with the specified number.
    New task: The program should work with the cities and not with house numbers.

    Example input:
    Washington
    the Smiths
    New York
    the Browns
    London
    the Johnsons

    London

    Example output:
    the Johnsons
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        //read home number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size())
        {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }
    }
}
