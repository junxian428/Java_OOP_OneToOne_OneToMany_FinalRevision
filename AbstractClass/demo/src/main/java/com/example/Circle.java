package com.example;

public class Circle extends GeometricObject {
    private double radius;
    
    public Circle() {
        this(0.0);
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius() { return radius; }
    
    public void setRadius(double radius) { this.radius = radius; }
    
    public double getDiameter() { return radius * 2; }
    
//    @Override
    public double getArea() { return Math.PI * radius * radius; }
    
//    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
}