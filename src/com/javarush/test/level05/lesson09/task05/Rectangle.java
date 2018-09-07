package com.javarush.test.level05.lesson09.task05;

/* Create a class Rectangle
Create a class Rectangle. Its data will be top, left, width and height. Create for it as much constructors as possible:
    Examples:
    -	4 parameters are set: left, top, width, height
    -	width/height are not set (both equal 0)
    -	height are not set (equal to width), create a square
    -	create a copy of another rectangle (it’s passed in the parameters)
*/

public class Rectangle
{
    int left;
    int top;
    int width;
    int height;

    public Rectangle(int left, int top, int width, int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int top)
    {
        this.left = left;
        this.top = top;
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(int left, int top, int width)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public Rectangle(Rectangle copy)
    {
        this.left = copy.left;
        this.top = copy.top;
        this.width = copy.width;
        this.height = copy.height;
    }
}
