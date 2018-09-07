package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Remove all the people born in the summer
Create a dictionary (Map<String, Date>) and add ten entries according to the model «last mane» - «birth date».
    Remove from the map all the people born in the summer.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Pytin", new Date("JUNE 1 1980"));
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Koshchei", new Date("JUNE 1 1980"));
        map.put("Yaga", new Date("JUNE 1 1980"));
        map.put("Yoda", new Date("JUNE 1 1980"));
        map.put("Enakin", new Date("JUNE 1 1980"));
        map.put("Dart", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if (month >= 6 && month <= 8)
            {
                iterator.remove();
            }
        }
    }
}

