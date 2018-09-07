package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Static cats
1. Add a public static variable cats (ArrayList<Cat>) in the class Cat.
    2. Every time you create a cat (a new object Cat), let this new cat be added to the variable cats. Create 10 objects Cat.
    3. The method printCats() should display all the cats. You need to use the variable cats  in the method.

    Tip:
    To create cats variable use code line:
    public static ArrayList<Cat> cats = new ArrayList<Cat>();
*/

public class Cat {
    public Cat() {
    }
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {

        Cat cat01 = new Cat();
        cats.add(cat01);
        Cat cat02 = new Cat();
        cats.add(cat02);
        Cat cat03 = new Cat();
        cats.add(cat03);
        Cat cat04 = new Cat();
        cats.add(cat04);
        Cat cat05 = new Cat();
        cats.add(cat05);
        Cat cat06 = new Cat();
        cats.add(cat06);
        Cat cat07 = new Cat();
        cats.add(cat07);
        Cat cat08 = new Cat();
        cats.add(cat08);
        Cat cat09 = new Cat();
        cats.add(cat09);
        Cat cat10 = new Cat();
        cats.add(cat10);
        printCats();
    }

    public static void printCats() {
            System.out.println(cats);
    }
}
