package com.javarush.test.level08.lesson03.task06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* HashMap collection of Object
There is a collection HashMap<String, Object>, it already has 10 different object pairs.
    Display to the screen the contents of the collection. Each entry should be on a new line.

    Output example (only one string is shown):
    Sim - 5
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double)123);

        //add your code here
        Iterator <Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Object> pair = iterator.next();
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
