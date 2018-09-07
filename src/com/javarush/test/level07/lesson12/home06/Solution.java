package com.javarush.test.level07.lesson12.home06;

/* Family
Create a class Human with the fields: String name, boolean sex, int age, Human father, Human mother.
Create 9 objects of Human class and fill them in such a way as to obtain two grandfathers, two grandmothers, a father, a mother, and three children.
Display to the screen the objects to the screen.
    Tip:
    If you write your method String toString() in the class Human, then it’ll be used to display an object.
    Example output:
    Name: Anna, sex: female, age: 21, father: Paul, mother: Kate
    Name: Kate, sex: female, age: 55
    Name: Ian, sex: male, age: 2, father: Michael, mother: Anna
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather1 = new Human("Jon", true, 78, null, null);
        Human grandfather2 = new Human("Kris", true, 88, null, null);
        Human grandmother1 = new Human("Arya", false, 76, null, null);
        Human grandmother2 = new Human("Katie", false, 82, null, null);
        Human father = new Human("Tom", true, 50, grandfather1, grandmother1);
        Human mother = new Human("Anna", false, 48, grandfather2, grandmother2);
        Human child1 = new Human("Karyna", false, 48, father, mother);
        Human child2 = new Human("Asia", false, 48, father, mother);
        Human child3 = new Human("Bill", true, 48, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        private String name;
        private Boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human(String name, Boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;
//                text += ", age: " + this.father.age;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }

}
