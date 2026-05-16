/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

/**
 *
 * @author Hoang Anh
 */

class Dog {
    private String name;
    private String breed;
    private int age;
    
    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name:" + this.name + "--Breed:" + this.breed + "--Age:" + this.age;
    }
    
    
}

public class OOP001 {
    public static void main(String[] args){
        Dog d = new Dog("Micky", "Husky", 12);
        System.out.println(d);
    }
}
