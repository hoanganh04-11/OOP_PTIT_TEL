/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Hoang Anh
 */
public class StringTest {
    
    
    public static boolean isUpper(String s){
        for(char x : s.toCharArray()){
            if(!Character.isUpperCase(x)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        System.out.println(s.compareTo(t));
//        while(sc.hasNextLine()){
//            s = sc.nextLine();
//        }
//        System.out.println(s.length());
//        for(int i=0; i<s.length(); i++){
//            System.out.println(s.charAt(i));
//        }
//         int hoa = 0, thuong = 0, so = 0;
//         for(char x : s.toCharArray()){
//             if(Character.isUpperCase(x)) ++hoa;
//             else if(Character.isLowerCase(x)) ++thuong;
//             else if(Character.isDigit(x)) ++so;
//         }
         
//         String s = "trung anh dang hoc lap trinh huong doi tuong";
//         String[] arr = s.trim().split("\\s+");
//         int dem = 0;
//         for(String x : arr){
//             if(isUpper(x)) ++dem;
//         }
//         System.out.println(dem);

           String s = "28tech di   hoc lap trinh va,./ co trinh";
           StringTokenizer st = new StringTokenizer(s, ".,?!/ ");
           while(st.hasMoreTokens()){
               System.out.print(st.nextToken() + " ");
           }
    }
}
