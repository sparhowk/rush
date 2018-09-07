package com.javarush.test.level08.lesson02.typingTask01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task
{
        public static void main(String[] args)
        {
            Map<String, String> map = new HashMap<String, String>();  // all elements are stored in paris
            map.put("first", "Stop");
            map.put("second", "Look");
            map.put("third", "Listen");

            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

            while (iterator.hasNext())
            {
                Map.Entry<String, String> pair = iterator.next();  // get the current pair-element and move the next
                String key = pair.getKey();                        // get key
                String value = pair.getValue();                    // get value
                System.out.println(key + ":" + value);
            }
        }
}
