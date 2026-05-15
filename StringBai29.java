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
public class StringBai29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res ="";
        for(char x : s.toCharArray()){
            if(!Character.isDigit(x)) res += " ";
            else res += x;
        }
        String[] x = res.trim().split("\\s+");
        long tong = 0;
        for(String num : x){
            tong += Long.parseLong(num);
        }
        System.out.println(tong);
    }
}
