package com.javarush.test.level10.lesson06.task01;

public class Solution {
    public static void main(String[] args) {


    int i = 5;
    float f = 444.23f;
    String s = "17";

        Object o = f;
        if (o instanceof Integer)
        {
            Integer i2 = (Integer) o;
        }
        else if (o instanceof Float)
        {
            Float f2 = (Float) o;
        }
        else if (o instanceof String)

        {
            String i2 = (String) o;
        }
    }
}
