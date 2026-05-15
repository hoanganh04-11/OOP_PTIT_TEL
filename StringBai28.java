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
public class StringBai28 {
    
    public static String getMax(String a, String b){
        if(a.length() > b.length()) return a;
        if(a.length() < b.length()) return b;
        if(a.compareTo(b) > 0) return a;
        else return b;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("[a-zA-Z]", " ");
        String[] arr = s.trim().split("\\s+");
        
        String res = "0";
        for(String x : arr){
            StringBuilder sb = new StringBuilder(x);
            while(sb.length() > 1 && sb.charAt(0) == '0'){
                sb.deleteCharAt(0);
            }
            res = getMax(res, sb.toString());
        }
        System.out.println(res);
    }
}
