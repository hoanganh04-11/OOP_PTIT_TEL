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

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
    
    
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    @Override
    public String toString() {
        return "Book[name=" + name + ", " + author.toString() 
             + ", price=" + price + ", qty=" + qty + "]";
    }
    
       
   
}


public class OOP012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            String bookType = sc.nextLine();
            String bookName = sc.nextLine();
            double bookPrice = sc.nextDouble();
            int bookQty = sc.nextInt();
            
            sc.nextLine();
            
            String authorType = sc.nextLine();
            String authorName = sc.nextLine();
            String authorEmail = sc.nextLine();
            char authorGender = sc.nextLine().charAt(0);
            
            Author author = new Author(authorName, authorEmail, authorGender);
            Book book = new Book(bookName, author, bookPrice, bookQty);
            
            System.out.println(book);
        }
        String end = sc.nextLine();
        sc.close();
    }
}
