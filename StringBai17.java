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
public class StringBai17 {
    
    public static String convertName(String s){
        String res = "";
        res += Character.toUpperCase(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            res += Character.toLowerCase(s.charAt(i));
        }
        return res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        arr[arr.length - 1] = arr[arr.length-1].toUpperCase();
        for(int i=0; i<arr.length-1; i++){
            arr[i] = convertName(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            if(i != arr.length-2) System.out.println(", ");
            else if(i != arr.length-1) System.out.println(" ");
            
        }
    }
}
