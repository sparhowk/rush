package com.javarush.test.level10.lesson04.task01;

/* Task number 1 for the conversion of integer types
    Arrange where the cast operator is of type:
byte a = 1234;
int b = a;
byte c = a * a;
int d = a / c;
*/

public class Solution
{
    public static void main(String[] args)
    {
        byte a = (byte)1234;
        int b = a;
        byte c = (byte) (a * a);
        int d = a / c;
    }
}
