package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Ten cats
Create a class Cat with a field String name.
    Create a dictionary Map<String, Cat>, add 10 cats on the model «Name» - «Cat».
    Get from the Map a Set of names and display the set to the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> cats = new HashMap<String, Cat>();
        String nameCat;
        for (int i = 0; i < 10; i++) {
            nameCat = "Cats0" + i;
            cats.put(nameCat, new Cat(nameCat));
        }
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> valuesCatSet = new HashSet<Cat>();
        for (Map.Entry<String, Cat> names: map.entrySet()) {
            valuesCatSet.add(names.getValue());
        }
        return valuesCatSet;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat " + this.name;
        }
    }


}
