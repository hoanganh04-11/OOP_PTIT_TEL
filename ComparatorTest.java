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
    
    public static int sumDigit(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] a = {313221, 224, 224, 114, 5, 2310, 138, 47};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int x : a ){
            list.add(x);
        }
        
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer x, Integer y){
               if(sumDigit(x) != sumDigit(y))
                   return sumDigit(x) - sumDigit(y);
               else
                   return x - y;
            }
        });
        // < 0: Nếu x đứng trước y sau khi mảng sắp xếp
        // > 0: Nếu x đứng sau y sau khi mảng sắp xếp
        // = 0: x với y bằng nhau
        
        for(int x : list){
            System.out.print(x + " ");
        }
    }
}

// Sắp xếp theo tổng chữ số tăng dần
// Nếu 2 số có cùng tổng chữ số thì số nhỏ hơn đứng trước

// B1. tìm ra thứ tự muốn sắp xếp mảng, Araylist
// B2. tìm điều kiện để x đứng trước y sau khi mảng được sắp xếp
// B3. Kiểm tra điều kiện đã tìm ở B2, nếu đúng => -1, sai => 1