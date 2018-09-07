package com.javarush.test.level08.lesson04.typingTask02;

import java.util.Date;

public class Task
{
    public static void main(String[] args) throws Exception
    {
        Date currentTime = new Date(); // getting current date i time
        Thread.sleep(3000);      // wait 3 sec == 3000 milliseconds
        Date newTime = new Date();     // getting new current data i time

        long msDelay = newTime.getTime() - currentTime.getTime();  // Calculating a difference
        System.out.println("Time distance is: " + msDelay + " in ms");
    }
}
