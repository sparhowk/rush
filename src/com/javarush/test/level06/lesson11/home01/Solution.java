package com.javarush.test.level06.lesson11.home01;

/* Class Cat and static variable catCount
Write a static variable public int catCount in the class Cat. Create a constructor [public Cat()].
    Let the static variable catCount increase by 1 every time you create a cat (a new object Cat).
    Create 10 objects Cat and display the value of the variable catCount.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat01 = new Cat();
        Cat cat02 = new Cat();
        Cat cat03 = new Cat();
        Cat cat04 = new Cat();
        Cat cat05 = new Cat();
        Cat cat06 = new Cat();
        Cat cat07 = new Cat();
        Cat cat08 = new Cat();
        Cat cat09 = new Cat();
        Cat cat10 = new Cat();

        System.out.println(Cat.catCount);
    }

    public static class Cat
    {
        public static int catCount;

        public Cat() { Cat.catCount++; }
    }

}
