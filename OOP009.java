/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */

class Student {
    private String name;
    private int age;
    public static int numberOfStudent = 0;
    
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }
    
    public void display(){
        if(age >= 18){
            System.out.println(name);
        }
    }
    
    
}

public class OOP009 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            if(!sc.hasNextLine()) break;
            int age = Integer.parseInt(sc.nextLine());
            Student a = new Student(name, age);
            a.display();
        }
        System.out.println(Student.numberOfStudent);
        sc.close();
    }
}
