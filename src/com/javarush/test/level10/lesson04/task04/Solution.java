package com.javarush.test.level10.lesson04.task04;

/*
short number = 9;
char zero = '0';
char nine = zero + number;
*/

public class Solution
{
    public static void main(String[] args)
    {
        short number = 9;
        char zero = '0';
        char nine = (char)(zero + number);
    }
}