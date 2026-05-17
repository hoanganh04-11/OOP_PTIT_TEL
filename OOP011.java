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

    public double getPrice() {
        return price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
    
    
    
}


class Order {
    private String orderId;
    private Product product;
    private int quantity;
    
    public Order(String orderId, Product product, int quantity){
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }
    
    public double calculateTotal(){
        return quantity * product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    
    public String toString(){
        return "Đơn hàng: " + orderId + "\n"
            + "Sản phẩm: " + product.getName() + " (Mã: " + product.getProductId() + ")" + "\n"
            + "Giá: " + String.format("%.1f", product.getPrice()) + "\n"
            + "Số lượng: " + quantity + "\n"
            + "Tổng tiền: " + String.format("%.1f", calculateTotal());
    }
}

public class OOP011 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String idProduct = sc.nextLine();
        String nameProduct = sc.nextLine();
        int priceProduct = sc.nextInt();
        sc.nextLine();
        String idOrder = sc.nextLine();
        int quantityProduct = sc.nextInt();
        Product product = new Product(idProduct, nameProduct, priceProduct);
        Order order = new Order(idOrder, product, quantityProduct);
        System.out.println("--- Thông tin đơn hàng ---");
        System.out.println(order);
    }
}
