/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.*;
class Amount {
    private String currency;
    private int amount;
    
    public Amount(String currency, int amount){
        this.currency = currency;
        this.amount = amount;
    }
    
    public int add(Amount amount) throws Exception {
        if(!this.currency.equals(amount.currency)){
            throw new Exception("Currency doesn't match");
        }
        return this.amount + amount.amount;
    }
}

public class EXCEPTION001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            try{
                String[] arr = sc.nextLine().trim().split("\\s+");
                Amount amount1 = new Amount(arr[0], Integer.parseInt(arr[1]));
                Amount amount2 = new Amount(arr[2], Integer.parseInt(arr[3]));
                System.out.println(amount1.add(amount2));
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
    }
}

