package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rectangle object = new Rectangle(5, 5, "Green", true);
        
        System.out.println(object.toString());
        System.out.println(object.getArea());
        System.out.println(object.getPerimeter());
    }
}
