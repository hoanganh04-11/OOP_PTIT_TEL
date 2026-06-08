
package oop_tel_ptit;

import java.util.*;

class Item {
    private String name;
    private double price, discount;
    
    public Item(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getDiscount(){
        return discount;
    }
    
    public String toString(){
        return String.format("%s $%.2f (-$%.2f)\n", name, price ,discount);
    }
}

class Employee {
    private String name;
    
    public Employee(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}

class GroceryBill {
    private Employee clerk;
    private ArrayList<Item> receipt;
    private double total;
    
    public GroceryBill(Employee clerk){
        this.clerk = clerk;
        receipt = new ArrayList<>();
        total = 0;
    }
    
    public double getTotal(){
        return total;
    }
    
    public Employee getClerk(){
        return clerk;
    }
    
    
    public void add(Item i){
        total += i.getPrice();
        receipt.add(i);
    }
    
    public String toString(){
        String res = "items:\n";
        for(Item i : receipt){
            res += String.format("   %s", i); 
        }
        res += String.format("total: $%.2f\nClerk: %s", total, clerk.getName());
        return res;
    }
}

class DiscountBill extends GroceryBill {
    private double discountAmount;
    private double total;
    private ArrayList<Item> receipt;
    
    public DiscountBill(Employee clerk){
        super(clerk);
        receipt = new ArrayList<>();
        total = 0;
        discountAmount = 0;
    }
    
    @Override
    public void add(Item i){
        total += i.getPrice();
        discountAmount += i.getDiscount();
        receipt.add(i);
    }
    
    public double getDiscountAmount(){
        return discountAmount;
    }
    
    @Override
    public String toString(){
        String res = "items:\n";
        for(Item i : receipt){
            res += String.format("   %s", i); 
        }
        res += String.format("sub-total: $%.2f\n", total);
        res += String.format("discount: $%.2f\n", discountAmount);
        double res1 = total - discountAmount;
        res += String.format("total: $%.2f\nClerk: %s", res1, getClerk().getName());
        return res;
    }
}

public class INHERITANCE009 {
    public static void main(String[] args){
        Employee clerk1 = new Employee("Grocery Bill");
        GroceryBill g1 = new GroceryBill(clerk1);
        g1.add(new Item("item 1", 2.3, 0));
        g1.add(new Item("item 2", 3.45, 0));
        
        System.out.println(g1);
        System.out.println("");
        
        Employee clerk2 = new Employee("Discount Bill");
        DiscountBill d1 = new DiscountBill(clerk2);
        
        d1.add(new Item("item 3", 20, 15));
        d1.add(new Item("item 4", 40, 35));
        d1.add(new Item("item 5", 50, 35));
        
        System.out.println(d1);
        
    }
}


