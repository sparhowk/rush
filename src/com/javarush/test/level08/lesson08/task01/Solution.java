package com.javarush.test.level08.lesson08.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 20 words beginning with «L»
Create a set of strings (Set<String>), place into it 20 words beginning with «L».
*/

public class Solution {
    public static Set<String>  createSet() {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            set.add("Л" + i);
        }
//        Set<String> set = new HashSet<String>(Arrays.asList("Let", "Leed", "Loaf", "Load", "Left", "Lord", "Lemon", "Loot", "Leave", "Leaf", "Love", "Live", "Lend", "Land", "Level", "Lamb", "Lair", "Liar", "Lies", "Lot"));

        return set;
    }

}