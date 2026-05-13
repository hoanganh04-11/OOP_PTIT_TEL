/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Hoang Anh
 */
public class SapXepTheoTriTuyenDoi {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), X = sc.nextInt();
        Integer a[] = new Integer[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        Comparator<Integer> cmp = new Comparator<Integer>(){
            public int compare(Integer x, Integer y){
                if(Math.abs(X - x) != Math.abs(X - y)){
                    return Math.abs(X - x) - Math.abs(X - y);
                }
                else
                    return x-y;
            }
        };
        
        Arrays.sort(a, cmp);
        for(int x : a){
            System.out.print(x + " ");
        }
        
        System.out.println("");
        
        Comparator<Integer> cmp1 = new Comparator<Integer>(){
            public int compare(Integer x, Integer y){
                int r1 = x % 2, r2 = y % 2;
                if(r1 == 0 && r2 == 0){
                    return x - y;
                }
                if(r1 == 1 && r2 == 1){
                    return y - x;
                }
                if(r1 == 0 && r2 == 1){
                    return -1;
                }
                return 1;
            }
        };
        
        Arrays.sort(a, cmp1);
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
