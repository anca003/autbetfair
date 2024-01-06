package oop;

public class Circle {

    public static String name;

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(){
        super();
    }


    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.24 * radius * radius;
    }

    public static void setName (String name){
        Circle.name = name;
    }



}
