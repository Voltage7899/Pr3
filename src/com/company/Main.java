package com.company;

public class Main {
    public static void main(String [] args)
    {
Shape s1=new Circle(5.5,"red",false);
        System.out.println(s1.getRadius());
        System.out.println(s1.getArea());
        System.out.println(s1.getPer());
        System.out.println(s1.toString());
Circle circle=(Circle)s1;
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPer());
        System.out.println(circle.toString());
    }

}
