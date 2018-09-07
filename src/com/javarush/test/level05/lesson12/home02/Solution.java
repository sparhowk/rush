package com.javarush.test.level05.lesson12.home02;

/* A Man and A Woman
1. Create public static classes Man and Woman within the class Solution.
    2. Classes must have fields: name(String), age(int), address(String).
    3. Create constructors to pass all the possible parameters to.
    4. Use the constructor to create two objects of each class with all the data.
    5. Display the objects in format [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Joe", 24, "Hanover");
        Man man2 = new Man("Ken", 32, "Berlin");
        Woman woman1 = new Woman("Kelly", 25, "San Fracisoo");
        Woman woman2 = new Woman("Amelin", 51, "Moscow");

        //output them to screen here
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man
    {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
