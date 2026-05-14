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
public class StringBasicBai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int tong = 0;
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                tong += x - '0';
            }
        }
        System.out.println(tong);
    }
}
