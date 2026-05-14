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
public class StringBasicBai5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        int dem = 0;
        for(int i=s.length()-1; i>=0; i--){
            t += s.charAt(i);
            ++dem;
            if(dem % 3 == 0 && i != 0){
                t += ",";
            }
        }
        for(int i=t.length()-1; i>=0; i--){
            System.out.print(t.charAt(i));
        }
    }

}
