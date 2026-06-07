/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;


class Person {
    private String name, address;
    
    public Person(String name, String address){
    	this.name = name;
        this.address = address;
    }
    
    public String toString(){
    	return name + " - " + address ;
    }
}

class Student extends Person {
    private int credits = 0;
    
    public Student(String name, String address){
    	super(name, address);
    }
    
    public int credits(){
    	return this.credits;
    }
    
    public void study(){
    	this.credits++;
    }
    
}

public class INHERITANCE008 {
    
    public static void main(String[] args){
    	Student s = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(s);
        System.out.println("Study credits " + s.credits());
        s.study();
        System.out.println("Study credits " + s.credits());
    }
}
