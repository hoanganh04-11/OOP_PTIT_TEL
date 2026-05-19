/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;


/**
 *
 * @author Hoang Anh
 */
class Product {
    private String name, location;
    private int weight;
    
    public Product(String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }
    
    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }
    
    public Product(String name, int weight){
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return name + " " + "(" + weight + "kg) " + 
            "can be found from the " + location;
    }
}


public class OOP010 {
    public static void main(String[] args){
        Product p1 = new Product("Tape measure");
        System.out.println(p1);
        Product p2 = new Product("Plaster", "home improvement section");
        System.out.println(p2);
        Product p3 = new Product("Tyre", 5);
        System.out.println(p3);
    }
}
