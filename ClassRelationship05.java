
package oop_tel_ptit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

class Author {
    private String name, email;
    private char gender;
    
    public Author(String name, String email, char gender){
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
        return "Author Information: " + "\n"
                + name + "\n" + email + "\n" + gender
                + "\n---------------------------";
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
    
    public Author getAuthor(){
        return this.author;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

    public String getName() {
        return name;
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

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book Details :" + "\n" 
               + name + "\n" + price + "\n"+ qty + "\n"
                + author.toString();        
    }
    
    
    
}

public class ClassRelationship05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Book> b1 = new ArrayList<>(); 
        for(int i=0; i<n; i++){
            String bookName = sc.nextLine();
            double bookPrice = Double.parseDouble(sc.nextLine());
            int bookQty = Integer.parseInt(sc.nextLine());
            String authorName = sc.nextLine();
            String authorEmail = sc.nextLine();
            char authorGender = sc.nextLine().charAt(0);
            Author a0 = new Author(authorName, authorEmail, authorGender);
            Book b0 = new Book(bookName, a0, bookPrice, bookQty);
            b1.add(b0);
        }
        Collections.sort(b1, new Comparator<Book>(){
           public int compare(Book x, Book y){
              if(x.getPrice() != y.getPrice()){
                  return Double.compare(y.getPrice(), x.getPrice());
              }
              else
                  return x.getName().compareTo(y.getName());
           } 
        });
        for(Book x : b1){
            System.out.println(x);
        }
        
    }
}
