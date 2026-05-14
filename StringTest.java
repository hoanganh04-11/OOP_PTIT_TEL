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
public class StringTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
        String s = "abtrin alkdsja ;lajsd";
        String t = "ba";
        System.out.println(s.compareTo(t));
//        while(sc.hasNextLine()){
//            s = sc.nextLine();
//        }
        System.out.println(s.length());
//        for(int i=0; i<s.length(); i++){
//            System.out.println(s.charAt(i));
//        }
         int hoa = 0, thuong = 0, so = 0;
         for(char x : s.toCharArray()){
             if(Character.isUpperCase(x)) ++hoa;
             else if(Character.isLowerCase(x)) ++thuong;
             else if(Character.isDigit(x)) ++so;
         }
    }
}
