/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
/**
 *
 * @author Hoang Anh
 */
public class Comparison_function {
    
    public static int demChan(int n){
        int res = 0;
        while(n != 0){
            int r = n % 10;
            if(r % 2 == 0){
                res++;
            }
            n /= 10;
        }
        return res;
    }
    
    public static int demLe(int n){
        int res = 0;
        while(n != 0){
            int r = n % 10;
            if(r % 2 !=0){
                res++;
            }
            n /= 10;
        }
        return res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer a[] = new Integer[n];
        Integer b[] = new Integer[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Comparator<Integer> cmp1 = new Comparator<Integer>(){
            @Override
            public int compare(Integer x, Integer y){
                if(demChan(x) != demChan(y)){
                    return demChan(x) - demChan(y);
                }
                else
                    return x - y;
            }
        };
        Comparator<Integer> cmp2 = new Comparator<Integer>(){
            @Override
            public int compare(Integer x, Integer y){
                    return demLe(x) - demLe(y);
            }
        };
        
        Arrays.sort(a, cmp1);
        Arrays.sort(b, cmp2);
        for(int x : a){
            System.out.print(x + " ");
        }
        System.out.println("");
        for(int x : b){
            System.out.print(x + " ");
        }
    }
}
