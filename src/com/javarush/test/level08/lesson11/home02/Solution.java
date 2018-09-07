package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set of all animals
1. Create public static classes Cat and Dog within the class Solution.
    2. Implement the method createCats(), which should return a set of 4 cats.
    3. Implement the method createDogs(), which should return a set of 3 dogs.
    4. Implement the method join(), which should return the combined set of all animals, both cats and dogs.
    5. Implement the method removeCats(), which should remove from the set pets all the cats present in the set cats.
    6. Implement the method printPets(), which should display to the screen all the animals present in it. Each animal should be on a new line.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //add your code here
        for (int i = 0; i < 4; i++)
        {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs()
    {
        //add your code here
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //add your code here
        //Implement the method join(), which should return the combined set of all animals, both cats and dogs.
        HashSet<Object> jonPets = new HashSet<Object>();
        jonPets.addAll(cats);
        jonPets.addAll(dogs);
        return jonPets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //add your code here
        //Implement the method removeCats(), which should remove from the set pets all the cats present in the set cats.
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        //add your code here
        Iterator<Object> petsIterator = pets.iterator();
        for (Object result : pets )
        {
            System.out.println(result);
        }
    }

    //add your code here
    public static class Cat { }
    public static class Dog { }

}
