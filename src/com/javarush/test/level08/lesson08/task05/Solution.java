package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Remove people having the same first name
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Remove people that have the same first name.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //add your code here
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Stallone", "John");
        map.put("Pytin", "Aris");
        map.put("Stall", "One");
        map.put("Koshchei", "Alan");
        map.put("Yaga", "Asia");
        map.put("Yoda", "Anna");
        map.put("Enakin", "Sonya");
        map.put("Dart", "Mort");
        map.put("Art", "Mort");
        map.put("Kart", "Mort");

        System.out.printf("Before: %s%n", map);
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //add your code here
        HashMap<String, String> mapCopy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> search1 : mapCopy.entrySet())
        {
            for (Map.Entry<String, String> search2 : mapCopy.entrySet())
            {
                if(search1.getValue().equals(search2.getValue()) && !search1.getKey().equals(search2.getKey()))
                {
                    map.remove(search1.getKey());
                }
            }
        }

        System.out.printf("Remove dublicates %s%n", map);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
        System.out.printf("Remove by Value %s%n", map);
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeItemFromMapByValue(map, "Mort");
        removeTheFirstNameDuplicates(map);
    }
}
