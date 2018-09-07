package com.javarush.test.level05.lesson05.task05;

/* Hold three twosome fights between cats
Create three cats using the class Cat.
    Hold three pairwise fights between cats.
    Do not create the class Cat. For the fight, use the method boolean fight(Cat anotherCat).
    Display the result of each fight.
*/

public class Solution {
    public static void main(String[] args) {
        Cat catTommy = new Cat("Tommy", 10, 17, 21);
        Cat catBeny = new Cat("Beny", 9, 18, 29);
        Cat catMia = new Cat("Mia", 12, 19, 23);

        System.out.println(catTommy.fight(catBeny));
        System.out.println(catTommy.fight(catMia));
        System.out.println(catMia.fight(catBeny));

    }

    public static class Cat
    {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;


        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
