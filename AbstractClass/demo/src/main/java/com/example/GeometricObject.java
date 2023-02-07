package com.example;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    
    protected GeometricObject() {
        this("White", true);
    }
    
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }
    
    public String getColor() { return color; }
    
    public void setColor(String color) { this.color = color; }
    
    public boolean isFilled() { return filled; }
    
    public void setFilled(boolean filled) { this.filled = filled; }
    
    public java.util.Date getDateCreated() { return dateCreated; }
    
    public String toString() {
        return "Created on " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
}