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
public class StringBasicBai29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String[] a = s.split("/");
        String[] b = t.split("/");
        String s1 = a[2] + a[1] + a[0];
        String t1 = b[2] + b[1] + b[0];
        if(s1.compareTo(t1) < 0)
            System.out.println("28tech");
        else if(s1.compareTo(t1) > 0)
            System.out.println("29tech");
        else
            System.out.println("30tech");
    }
}
