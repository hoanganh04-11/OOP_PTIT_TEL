
package oop_tel;

import java.util.Scanner;

class HanhTinh {
    private double khoiLuong;
    private double banKinh;
    public static final double G = 6.67300e-11;
    
    public HanhTinh(double khoiLuong, double banKinh){
        this.khoiLuong = khoiLuong;
        this.banKinh = banKinh;
    }
    
    double trongLucBeMat(){
        return khoiLuong * G / (banKinh * banKinh);
    }
    
    double khoiLuongBemat(double khoiLuongTraiDat){
        HanhTinh traiDat = new HanhTinh(5.976e+24, 6.37814e6);
        double gTraiDat = traiDat.trongLucBeMat();
        return khoiLuongTraiDat * gTraiDat / trongLucBeMat();
    }
}

public class OOP007 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            double m = Double.parseDouble(sc.nextLine());
            double r = Double.parseDouble(sc.nextLine());
            double trongLuong = Double.parseDouble(sc.nextLine());
            
            HanhTinh hanhTinh = new HanhTinh(m, r);
            double res = hanhTinh.khoiLuongBemat(trongLuong);
            System.out.printf("Your weight on %s is %.2f", name, res);
        }
    }
    
}
