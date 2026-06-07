
package oop_tel_ptit;

import java.util.*;

abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;
    
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public String getName(){
        return this.name;
    }
    
    public abstract double calculateCost(int quantity);
    
    public void displayDetails(){
        System.out.printf("Name: %s\nPrice: $%.1f\nAvailable Quantity: %d\n", name, price, quantity);
    }
}

class Book extends Product {
    private String author;
    
    public Book(String name, double price, int quantity, String author){
        super(name, price, quantity);
        this.author = author;
    }
    
   	@Override
    public double calculateCost(int quantity){
        return price * quantity;
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

class Electronics extends Product {
    private String brand;
    
    public Electronics(String name, double price, int quantity, String brand){
        super(name, price, quantity);
        this.brand = brand;
    }
    
   	@Override
    public double calculateCost(int quantity){
        return price * quantity * 1.1;
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Brand: " + brand);
    }
}


class User {
    private String username;
    private double totalSpent;
    
    public User(String username){
        this.username = username;
        totalSpent = 0;
    }
    
    public void buyProduct(Product product, int quantity){
        if(quantity <= product.getQuantity()){
            double cost = product.calculateCost(quantity);
            product.setQuantity(product.getQuantity() - quantity);
            totalSpent += cost;
            System.out.printf("User: %s bought %d %s for $%.1f\n", username, quantity, product.getName(), cost);
        }else{
            System.out.printf("Insufficient quantity of %s available.\n", product.getName());
        }
    }
    
    public double getTotalSpent(){
        return this.totalSpent;
    }
    
    public String getUserName(){
        return this.username;
    }
}


public class INHERITANCE010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Product laptop = new Electronics("laptop", 20, 10, "Dell");
            Product book = new Book("Harry Potter", 10, 12, "camnh");
            
            User user1 = new User("Alice");
            User user2 = new User("Bob");
            User user3 = new User("Charlie");
            
            user1.buyProduct(laptop, 3);
            user1.buyProduct(book, 10);
            user2.buyProduct(laptop, 1);
            user3.buyProduct(book, 5);
            
            System.out.println("====");
            
            System.out.println("Users with Highest Total Spent:");
            User[] users ={user1, user2, user3};
            for(int i=0; i<users.length; i++){
                for(int j=i+1; j<users.length; j++){
                    if(users[i].getTotalSpent() < users[j].getTotalSpent()){
                        User tmp = users[i];
                        users[i] = users[j];
                        users[j] = tmp;
                    }
                }
            }
            
            for(int i=0; i<users.length; i++){
                System.out.printf("%d. %s: $%.1f\n", i+1, users[i].getUserName(), users[i].getTotalSpent());
            }
            
            System.out.println("====");
            laptop.displayDetails();
            System.out.println("---");
            book.displayDetails();
            
        }
    }
}
