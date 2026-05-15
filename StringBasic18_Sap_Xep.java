/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Hoang Anh
 */
public class StringBasic18_Sap_Xep {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.trim().split("\\s+");
        Comparator<String> cmp = new Comparator<String>(){
            public int compare(String x, String y){
                if(x.length() != y.length())
                    return x.length() - y.length();
                return x.compareTo(y);
            }
        };
        Arrays.sort(arr, cmp);

        for(String x : arr){
            System.out.print(x + " ");
        }
    }
}
