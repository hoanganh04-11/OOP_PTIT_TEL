/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

/**
 *
 * @author Hoang Anh
 */
import java.util.Scanner;

class Product {
    private String productId;
    private String name;
    private double price;
    
    public Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void display(){
        System.out.println("Sản phẩm: " + name + " (Mã: " + getProductId() + ")");
        System.out.printf("Giá: %.1f\n", getPrice());
    }
}


class Order {
    private String orderId;
    private Product product;
    private int quantity;

    public Order(String orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
    
    public double calculateTotal(){
        return getQuantity() * this.product.getPrice();
    }
    
    public void display(){
        System.out.println("--- Thông tin đơn hàng ---");
        System.out.println("Đơn hàng: " + orderId);
        product.display();
        System.out.println("Số lượng: " + getQuantity());
        System.out.printf("Tổng tiền: %.1f\n", calculateTotal());
    }
}

public class OOP011 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String productId = sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        sc.nextLine();
        String orderId = sc.nextLine();
        int quantity = sc.nextInt();
        
        Product a = new Product(productId, name, price);
        Order b = new Order(orderId, a, quantity);
        
        b.display();
    }
}
