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
public class StringBasic2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println("");
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
