package com.javarush.test.level08.lesson02.typingTask05;

import java.util.HashMap;
import java.util.Map;

public class Task
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Stop");
        map.put("second", "Look");
        map.put("third", "Listen");

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
