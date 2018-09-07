package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 words beginning with «L»
Create a set of strings (Set<String>), place into it 20 words beginning with «L».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> list = new HashSet<String>();
        list.add("01 - Лила");
        list.add("02 - Люда");
        list.add("03 - Лора");
        list.add("04 - Люк");
        list.add("05 - Ллейс");
        list.add("06 - Лайка");
        list.add("07 - Ложка");
        list.add("08 - Лимон");
        list.add("09 - Лопух");
        list.add("10- Лизун");

        list.add("11 - Люс");
        list.add("12 - Лама");
        list.add("13 - Лаунч");
        list.add("14 - Лира");
        list.add("15 - Лада");
        list.add("16 - Лампочка");
        list.add("17 - Люстра");
        list.add("18 - Лиса");
        list.add("19 - Лань");
        list.add("20 - Лорд");

        return list;
    }
}
