package oop_tel_ptit;


import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Anh
 */
public class StringBai19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            String[] arr = s.trim().toLowerCase().split("\\s+");
            int m = arr.length;
            String email = arr[m-2];
            for(int j=0; j<m-2; j++){
                email += arr[j].charAt(0);
            }
            if(map.containsKey(email)){
                map.put(email, map.get(email) + 1);
                email += map.get(email) + "xyz.edu.vn";
            }
            else{
                map.put(email, 1);
                email +="xyz.edu.vn";
            }
            System.out.println(email);
            String ns = arr[m-1];
            String[] b = ns.split("/");
            System.out.println(Integer.parseInt(b[0]) + "" + Integer.parseInt(b[1]) + "" + Integer.parseInt(b[2]));
        }
    }
}
