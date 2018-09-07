package com.javarush.test.level05.lesson07.task05;

/* Create a class Rectangle
Create a class Rectangle. Its data will be top, left, width, and height. Create for it as much initialize (...) methods as possible

    Examples:
    -	4 parameters are set: left, top, width, height
    -	width/height are not set (both equal 0)
    -	height are not set (equal to width), create a square
    -	create a copy of another rectangle (it’s passed in the parameters)
*/

public class Rectangle
{
    private int left;
    private int top;
    private int width;
    private int hight;

    public void initialize(int left, int top, int width, int hight)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.hight = hight;
    }

    public void initialize(int left, int top)
    {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.hight = 0;
    }

    public void initialize(int left, int top, int width)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.hight = width;
    }

    public void initialize(Rectangle copy)
    {
        this.left = copy.left;
        this.top = copy.top;
        this.width = copy.width;
        this.hight = copy.hight;
    }

}
