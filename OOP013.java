/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;
import java.util.*;

class Book {
    private String bookId, title, author;
    
    public Book(String bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    
    public String toString(){
        return "Sách: " + title + " (Mã: " + bookId + ") - " + author;
    }
}

class Borrow {
    private String borrowId;
    private Book book;
    private String borrower;
    private int days;
    
    public Borrow(String borrowId, Book book, String borrower, int days){
        this.borrowId = borrowId;
        this.book = book;
        this.borrower = borrower;
        this.days = days;
    }
    
    public double calculateFee(){
        return days * 5000.0;
    }
    
    public String toString(){
        return "Mã phiếu: " + borrowId + "\n" +
                "Người mượn: " + borrower + "\n" +
                book.toString() + "\n" +
                "Số ngày mượn: " + days + "\n" +
                String.format("Phí mượn: %.1f\n", calculateFee());
    }
}


public class OOP013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bookId = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        Book b = new Book(bookId, title, author);
        String borrowId = sc.nextLine();
        String borrower = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());
        Borrow a = new Borrow(borrowId, b, borrower, days);
        System.out.println("--- Phiếu mượn sách ---");
        System.out.println(a);
    }
}
