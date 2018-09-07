package com.javarush.test.level05.lesson07.task02;

/* Create a class Cat
Create a class Cat with five initializers:
    - Name
    - Name, weight, age
    - Name, age (standard weight)
    - Weight, color, (name, address and age are unknown, it’s an alley cat)
    - Weight, color, address (it’s someone’s house cat)
    Initializer’s task is to make an object valid. For example, if the weight is unknown, you need to specify some average weight. A cat can’t have any weight at all, likewise age. But it can have no name (null). The same applies to the address - can be null.
*/

public class Cat
{
    private String nameCat = null;
//    private String adress = null;
//    private String color = null;
//    private String weight;
//    private String age;

    public void initialize(String name)
    {
        this.nameCat = name;
    }

    public void initialize(String name, int weight, int age)
    {
        this.nameCat = name + weight + age;
    }

    public void initialize(String name, int age)
    {
        this.nameCat = name + age;
    }

    public void initialize(int weight, String color)
    {
        this.nameCat = weight + color;
    }

    public void initialize(int weight, String color, String address)
    {
        this.nameCat = weight + color + address;
    }

}
