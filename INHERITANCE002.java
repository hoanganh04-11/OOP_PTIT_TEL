package oop_tel_ptit;

import java.util.*;

class Item {
    private String name;
    private int weight;
    
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    public Item(String name){
        this.name = name;
        this.weight = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }
    
}

abstract class Box {
    public abstract void add(Item item);
    public abstract boolean isInBox(Item item);
}


class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public BoxWithMaxWeight(int maxWeight){
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    @Override
    public void add(Item item){
        int totalWeight = 0;
        for(Item i : items){
            totalWeight += i.getWeight();
        }
        if(totalWeight + item.getWeight() <= maxWeight){
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        for(Item i : items){
            if(i.getName().equals(item.getName())){
                return true;
            }
        }
        return false;
    }
}

public class INHERITANCE002 {
    public static void main(String[] args){
        BoxWithMaxWeight box = new BoxWithMaxWeight(10);
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));
        box.add(new Item("Kopi Luwak", 5));
        
        System.out.println(box.isInBox(new Item("Saludo", 0)));
        System.out.println(box.isInBox(new Item("Pirkka", 0)));
        System.out.println(box.isInBox(new Item("Kopi Luwak", 0)));
    }
}
