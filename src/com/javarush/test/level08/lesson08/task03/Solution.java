package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Identical first and last names
    Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Check how many people have the same first or last name as the name specified.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //add your code here
        HashMap<String, String> names = new HashMap<String, String>();
        names.put("Сергеев", "Антон");
        names.put("Иванов", "Петя");
        names.put("Стаханов", "Жора");
        names.put("Сталин", "Иосиф");
        names.put("Куриев", "Артур");
        names.put("Сколов", "Антон");
        names.put("Воробев", "Станичлав");
        names.put("Сергеева", "Антон");
        names.put("Глодин", "Паша");
        names.put("Кинг", "Стивен");
        return names;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int countTheSameFirstName=0;

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext())
        {
            Map.Entry<String, String> pair = iter.next();
            String firstName = pair.getValue();
            if (firstName.equals(name))
            {
                countTheSameFirstName++;
            }
        }

        return countTheSameFirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int countTheSameLastName=0;
        for(Map.Entry<String, String> pair : map.entrySet())
        {
            String lastName = pair.getKey();
            if (lastName.equals(familiya))
            {
                countTheSameLastName++;
            }
        }
        return countTheSameLastName;
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Антон"));
        System.out.println(getCountTheSameLastName(map, "Сколов"));
    }
}
