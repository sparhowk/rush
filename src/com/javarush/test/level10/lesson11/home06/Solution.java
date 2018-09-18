package com.javarush.test.level10.lesson11.home06;

/* Constructors of the class Human
 Write a class Human with 6 fields. Come up with 10 different constructors for it and implement them. Each constructor should have meaning.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //Write here variables and constructors
        String name;
        String lastName;
        String Surname;
        int age;
        int weight;
        int height;

        public Human(String name, String lastName, String surname, int age, int weight, int height) {
            this.name = name;
            this.lastName = lastName;
            Surname = surname;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        Human() {

        }
    }
}
