
package oop_tel_ptit;

import java.util.*;

class Product {
    public int price, stock;
    
    public Product(int price, int stock){
        this.price = price;
        this.stock = stock;
    }
    
}


class Warehouse {
    private HashMap<String, Product> products;
   	
    public Warehouse(){
        products = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        products.put(product, new Product(price, stock));
    }
    
    public int price(String product){
        if(products.containsKey(product)){
            return products.get(product).price;
        }
        return -99;
    }
}

public class COLLECTION001 {
    public static void main(String[] args){
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 5);
        warehouse.addProduct("coffee", 5, 7);
        
        System.out.println("prices:");
        System.out.printf("milk: %d\n", warehouse.price("milk"));
        System.out.printf("coffee: %d\n", warehouse.price("coffee"));
        System.out.printf("sugar: %d\n", warehouse.price("sugar"));
    }
}
