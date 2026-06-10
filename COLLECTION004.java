
package oop_tel_ptit;

import java.util.*;

class Item {
    private String product;
    private int quantity, unitPrice, originalQuantity;
    
    public Item(String product, int quantity, int price){
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = price;
        this.originalQuantity = quantity;
    }
    
    public Item(String product, int quantity){
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = 0;
    }
    
    public String getProduct(){
        return product;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public int getUnitPrice(){
        return unitPrice;
    }
    
    public int getOriginalQuantity(){
        return originalQuantity;
    }
    
    public int getTotalPrice(){
        return quantity * unitPrice;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public void printItemInfo(){
        System.out.printf("Product: %s has quantity %d with price: %d\n", product, quantity, getTotalPrice());
    }
    
}

class Warehouse {
    private HashMap<String, Item> items;
    
    public Warehouse(){
        items = new HashMap<>();
    }
    
    public void importProduct(Item item){
        items.put(item.getProduct(), item);
    }
    
    public Item getItem(String product){
        return items.get(product);
    }
    
    public void removeProduct(String product, int amount){
        if(items.containsKey(product)){
            int currentQuantity = items.get(product).getQuantity();
            currentQuantity -= amount;
            items.get(product).setQuantity(currentQuantity);
            if(currentQuantity < 0){
                items.get(product).setQuantity(0);
            }
        }
    }
    
    public void decreaseQuantityInWarehouseByOne(){
        for(String x : items.keySet()){
            items.get(x).setQuantity(items.get(x).getQuantity() - 1);
        }
    }
    
    public void takeFormItemToWarehouse(List<Item> itemsToCheck, String product, int quantity){
        Item item =	items.get(product);
        if(item == null) return;
        for(Item x : itemsToCheck){
            if(x.getProduct().equals(product)){
                int toAdd = Math.min(item.getQuantity(), quantity);
                item.setQuantity(x.getQuantity() + toAdd);
                break;
            }
        }
    }
    
    public void printWarehouseInfo(){
        for(Item i : items.values()){
            i.printItemInfo();
        }
    }
}

public class COLLECTION004 {
    public static void main(String[] args){
        
        Warehouse warehouse = new Warehouse();
        
        Item milk= new Item("milk", 4, 2);
        Item buttermilk = new Item("buttermilk", 10, 2);
        
        milk.printItemInfo();
        buttermilk.printItemInfo();
        
        warehouse.importProduct(milk);
        warehouse.importProduct(buttermilk);
        
        warehouse.removeProduct("milk", 1);
        warehouse.removeProduct("buttermilk", 3);        
        warehouse.getItem("milk").printItemInfo();
        warehouse.getItem("buttermilk").printItemInfo();
        
        warehouse.decreaseQuantityInWarehouseByOne();
		warehouse.getItem("milk").printItemInfo();
		warehouse.getItem("buttermilk").printItemInfo();
        
        List<Item> itemsToCheck = new ArrayList<>();
        itemsToCheck.add(new Item("milk", 2));
        itemsToCheck.add(new Item("buttermilk", 6));
        
        warehouse.takeFormItemToWarehouse(itemsToCheck, "milk", 5);
        warehouse.takeFormItemToWarehouse(itemsToCheck, "buttermilk", 1);
        
        warehouse.getItem("milk").printItemInfo();
        warehouse.getItem("buttermilk").printItemInfo();
        
        
    }
}

