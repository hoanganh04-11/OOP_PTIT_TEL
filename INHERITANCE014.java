
package oop_tel_ptit;

import java.util.*;
abstract class Vehicle {
    private double price;
    
    public Vehicle(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public abstract double calculateTax();
        
}

class Car extends Vehicle{
    private int numberOfSeats;
    
    public Car(double price, int numberOfSeats){
        super(price);
        this.numberOfSeats = numberOfSeats;
    }
    
    @Override
    public double calculateTax(){
        return super.getPrice() * 0.05;
    }
    
    @Override
    public String toString(){
        return String.format("Car - Giá: %.2f, Số ghế: %d, Thuế: %.2f", super.getPrice(), numberOfSeats, calculateTax());
    }
}

class Truck extends Vehicle {
    private double loadCapacity;
    
    public Truck(double price, double loadCapacity){
        super(price);
        this.loadCapacity = loadCapacity;
    }
    
    @Override
    public double calculateTax(){
        return super.getPrice() * 0.1 + loadCapacity * 1000;
    }
    
    @Override
    public String toString(){
        return String.format("Truck - Giá: %.2f, Tải trọng: %.2f tấn, Thuế: %.2f", super.getPrice(), loadCapacity, calculateTax());
    }
}

public class INHERITANCE014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách phương tiện và thuế:");
        int n = Integer.parseInt(sc.nextLine());
        double res = 0;
        for(int i=0; i<n; i++){
            String[] arr = sc.nextLine().trim().split("\\s+");
            if(arr[0].equals("Car")){
                double price = Double.parseDouble(arr[1]);
                int numberOfSeats = Integer.parseInt(arr[2]);
                Car c1 = new Car(price, numberOfSeats);
                res += c1.calculateTax();
                System.out.println(c1);
            }else if(arr[0].equals("Truck")){
                Truck t1 = new Truck(Double.parseDouble(arr[1]), Double.parseDouble(arr[2]));
                res += t1.calculateTax();
                System.out.println(t1);
            }
  
        }
        System.out.printf("Tổng thuế phải đóng: %.2f", res);
    }
}
