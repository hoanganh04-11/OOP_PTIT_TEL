package oop_tel_ptit;



import java.util.*;
abstract class Shape {
    protected String name;
    
    public Shape(String name){
        this.name = name;
    }
    
    public abstract double calculateArea();
    public abstract void displayInfo();
}

class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(String name, double length, double width){
        super(name);
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double calculateArea(){
        return length * width;
    }
    
    @Override 
    public void displayInfo(){
        System.out.printf("Shape:%s|Area:%.2f\n", name, calculateArea());
    }
    
    
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    
    @Override 
    public void displayInfo(){
        System.out.printf("Shape:%s|Area:%.2f\n", name, calculateArea());
    }
}

public class INHERITANCE007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String[] arr = sc.nextLine().trim().split("\\s+");
            switch(arr[0]){
                case "Rectangle":
                    double width = Double.parseDouble(arr[1]);
                    double length = Double.parseDouble(arr[2]);
                    Rectangle r = new Rectangle(arr[0], width, length);
                    r.displayInfo();
                    break;
                case "Circle":
                    double radius = Double.parseDouble(arr[1]);
                    Circle c = new Circle(arr[0], radius);
                    c.displayInfo();
                    break;
            }
        }
    }
}
