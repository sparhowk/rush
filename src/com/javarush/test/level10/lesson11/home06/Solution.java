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
        String surname;
        int age;
        int weight;
        int height;

        public Human() {
            this.name = "Name";
            this.lastName = "Last Name";
            this.surname = null;
            this.age = 0;
            this.weight = 70;
            this.height = 70;
        }

        public Human(String name, String lastName, String surname, int age, int weight, int height) {
            this.name = name;
            this.lastName = lastName;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName, int age, int weight) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String lastName, int age, int weight, int height) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;

        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }


    }
}
