package com.javarush.test.level08.lesson04.typingTask03;

import java.util.Date;

public class Task
{
    public static void main(String[] args) throws Exception
    {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;  // add 5 seconds to date
        Date endDate = new Date(endTime);

        Thread.sleep(3000);                   // wait 3 seconds

        Date currentTime = new Date();
        if (currentTime.after(endDate))             // checking currentTime after endDate
        {
            System.out.println("End time!");
        }
    }
}
