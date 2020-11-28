package com.company;

public abstract class Shape {
    protected boolean filled;
    protected String colour;
    abstract double getRadius();

    abstract double getArea();

    abstract double getPer();
    public abstract String toString();


}
