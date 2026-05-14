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
public class StringBasicBai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        for(int i=1; i<n.length(); i++){
            if(Math.abs(n.charAt(i) - n.charAt(i-1)) != 1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("Yes");
    }
}
