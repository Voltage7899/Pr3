package com.company;

public class Circle  extends Shape{
    protected double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    Circle(double radius,String colour,boolean filled)
    {
        this.radius=radius;
        this.colour=colour;
        this.filled=filled;
    }
    double getRadius()
    {
        return radius;
    }
    double getArea()
    {
        double Area=radius*radius*3.14;
        return Area;
    }
    double getPer()
    {
        double Per=radius*2*3.14;
        return Per;
    }
     public String toString()
    {
        return "Circle is" +colour+"has radius "+radius+"and filled:"+filled;
    }
}
