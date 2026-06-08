
package oop_tel_ptit;

import java.util.*;

abstract class Device {
    private double basePrice;
    
    public Device(double basePrice){
        this.basePrice = basePrice;
    }
    
    public double getBasePrice(){
        return basePrice;
    }
    
    public abstract double calculateWarrantyCost();
}

class Laptop extends Device {
    private int ramSize;
    
    public Laptop(double basePrice, int ramSize){
        super(basePrice);
        this.ramSize = ramSize;
    }
    
    @Override
    public double calculateWarrantyCost(){
       return super.getBasePrice() * 0.07;
    }
    
    @Override
    public String toString(){
        return String.format("Laptop - Giá gốc: %.2f, Dung lượng RAM: %d GB, Chi phí bảo hành: %.2f\n", super.getBasePrice(), ramSize, calculateWarrantyCost());
    }
}

class Smartphone extends Device {
    private double screenSize;
    
    public Smartphone(double basePrice, double screenSize){
        super(basePrice);
        this.screenSize = screenSize;
    }
    
    @Override
    public double calculateWarrantyCost(){
        return getBasePrice() * 0.05 + screenSize * 50;
    }
    
    @Override
    public String toString(){
        return String.format("Smartphone - Giá gốc: %.2f, Kích thước màn hình: %.2f inch, Chi phí bảo hành: %.2f\n", getBasePrice(), screenSize, calculateWarrantyCost());
    }
}

public class INHERITANCE015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách thiết bị và chi phí bảo hành:");
        int n = Integer.parseInt(sc.nextLine());
        double res = 0;
        for(int i=0; i<n; i++){
            String[] arr = sc.nextLine().trim().split("\\s+");
            switch(arr[0]){
                case "Laptop":
                    Laptop l1 = new Laptop(Double.parseDouble(arr[1]), Integer.parseInt(arr[2]));
                    res += l1.calculateWarrantyCost();
                    System.out.print(l1);
                    break;
                case "Smartphone":
                    Smartphone s1 = new Smartphone(Double.parseDouble(arr[1]), Double.parseDouble(arr[2]));
                    res += s1.calculateWarrantyCost();
                    System.out.print(s1);
                    break;
            }
        }
        System.out.printf("Tổng chi phí bảo hành: %.2f", res);
    }
}

