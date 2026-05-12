/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
public class ComparatorTest {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] a = {3, 2, 2, 1, 5, 0, 8, 7};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int x : a ){
            list.add(x);
        }
        
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer x, Integer y){
               if(x < y){
                   return -1;
               }
               else 
                   return 1;
            }
        });
        // < 0: Nếu x đứng trước y sau khi mảng sắp xếp
        // > 0: Nếu x đứng sau y sau khi mảng sắp xếp
        // = 0: x với y bằng nhau
    }
}
