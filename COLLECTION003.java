/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.*;

class Warehouse {
    private HashMap<String, Integer> stocks;
    private HashMap<String, Integer> prices;
    
    public Warehouse(){
        stocks = new HashMap<>();
        prices = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        stocks.put(product, stock);
        prices.put(product, price);
    }
    
    public int price(String product){
        if(stocks.containsKey(product)){
            return prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(stocks.containsKey(product)){
            return stocks.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(stocks.containsKey(product) && stocks.get(product) > 0){
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> s = new HashSet<>();
        for(String key : stocks.keySet()){
            if(stock(key) > 0) s.add(key);
        }
        return s;
    }
}


public class COLLECTION003 {
    public static void main(String[] args){
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 2);
        warehouse.addProduct("yogurt", 2, 20);
        
        warehouse.take("buttermilk");
        warehouse.take("milk");
        warehouse.take("buttermilk");
        
        for(String product : warehouse.products()){
            System.out.println(product);
        }
    }
}
