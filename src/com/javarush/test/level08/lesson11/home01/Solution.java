package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set of cats
    1. Create a public static class Cat within the class Solution.
    2. Implement the method createCats(), which should create a Set of cats and add three cats to it.
    3. In the main method, remove a cat from the Set cats.
    4. Implement the method printCats(), which should display to the screen all the cats that remain in the set. Every cat should be on a new line.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        //add your code here. step 3
        Iterator<Cat> catIterator = cats.iterator();
        cats.remove(catIterator.next());
        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //add your code here. step 2
        Set<Cat> catSet = new HashSet<Cat>();
        catSet.add(new Cat());
        catSet.add(new Cat());
        catSet.add(new Cat());
        return catSet;
    }

    public static void printCats(Set<Cat> cats)
    {
        // step 4
        Iterator<Cat> catIterator = cats.iterator();
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1
    public static class Cat {

    }
}
