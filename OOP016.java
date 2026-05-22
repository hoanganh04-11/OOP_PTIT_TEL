
package oop_tel_ptit;

import java.util.*;

class Money {
    private int euros;
    private int cent;
    
    public Money(int euros, int cent){
        this.euros = euros;
        this.cent = cent;
    }
    
    public String toString(){
        return String.format("%d.%02de", euros, cent);
    }
    
    public Money plus(Money added){
        int totalCent = this.cent + added.cent;
        int totalEuros = this.euros + added.euros + totalCent/100;
        totalCent %= 100;
        return new Money(totalEuros, totalCent);
    }
    
    public boolean lessThan(Money compared){
        int totalThis = euros * 100 + cent;
        int totalCompare = compared.euros * 100 + compared.cent;
        return totalThis < totalCompare;
    }
    
    public Money minus(Money minus){
        int thisTotal = euros * 100 + cent;
        int minusTotal = minus.euros * 100 + minus.cent;
        if(thisTotal < minusTotal) return new Money(0, 0);
        int diff = thisTotal - minusTotal;
        return new Money(diff/100, diff%100);
    }
}

public class OOP016 {
    public static void main(String[] args){
        Money a = new Money(10, 8);
        Money b = new Money(5, 5);
        Money c = a.plus(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        Money u = new Money(10, 0);
        Money y = new Money(3, 0);
        Money w = new Money(5, 0);
        System.out.println(u.lessThan(y));
        System.out.println(y.lessThan(w));
        
        Money m = new Money(10, 0);
        Money n = new Money(3, 50);
        Money o = m.minus(n);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        o = o.minus(m);
        System.out.println(o);
        
    }
}
