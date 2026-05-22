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

class Inventor {
    private String name, field, nationality;
    
    public Inventor(String name, String field, String nationality){
        this.name = name;
        this.field = field;
        this.nationality = nationality;
    }
    
    public String toString(){
        return "Inventor[name=" + name + ", field=" + field + ", nationality=" +
                nationality + "]";
    }
}

class Patent {
    private String title;
    private int year;
    private Inventor inventor;
    
    public Patent(String title, int year, Inventor inventor){
        this.title = title;
        this.year = year;
        this.inventor = inventor;
    }
    
    public String toString(){
        return "Patent[title=" + title +
                ", year=" + year + ", " +
                inventor.toString() + "]";
    }
}

public class OOP002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String field = sc.nextLine();
        String nationality = sc.nextLine();
        String patentTitle = sc.nextLine();
        int year = Integer.parseInt(sc.nextLine());
        if(nationality.equals("VN") || nationality.equals("INT")){
            Inventor a = new Inventor(name, field, nationality);
            Patent b = new Patent(patentTitle, year, a);
            System.out.println(b);
        }
        else{
            System.out.println("Invalid nationality. Only 'VN' or 'INT' allowed.");
            return;
        }
    }
}
