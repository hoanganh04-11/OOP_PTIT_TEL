/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class StringBai16_ChuanHoaTen {
    
    public static String convertName(String s){
        String[] arr = s.toLowerCase().trim().split("\\s+");
        String res = "";
        for(String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i<x.length(); i++){
                res += x.charAt(i);
            }
            res += " ";
        }
        return res.trim();
    }
    
    public static String getBirth(String s){
        String[] a = s.split("/");
        String res = String.format("%02d/%02d/%04d", Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
        return res;
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(convertName(s));
        System.out.println(getBirth(b));
    }
}
