/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

/**
 *
 * @author Hoang Anh
 */
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;


public class TapGiaoCuaKyTu {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        
        int n = sc.nextInt(), m = sc.nextInt();
        char[] a = new char[n];
        for(int i=0; i<n; i++){
            a[i] = sc.next().charAt(0);
        }
        char[] b = new char[n];
        for(int i=0; i<n; i++){
            b[i] = sc.next().charAt(0);
        }
        for(char x : a){
            map.put(x, 1);
        }
        for(char x : b){
            if(map.containsKey(x) && map.get(x) == 1){
                map.put(x, 2);
            }
        }
        for(char x : a){
            if(map.get(x) == 2){
                System.out.print(x + " ");
                map.remove(x);
            }
        }
    }
}
