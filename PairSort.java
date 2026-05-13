/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class PairSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1 mảng array list có n arraylist
        ArrayList<Integer>[] a = new ArrayList[n];
        for(int i=0; i<n; i++){
            a[i] = new ArrayList<>();
            a[i].add(sc.nextInt());
            a[i].add(sc.nextInt());
        }
        Arrays.sort(a, new Comparator<ArrayList<Integer>>(){
           public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2){
               int dis1 = o1.get(0) * o1.get(0) + o1.get(1) * o1.get(1);
               int dis2 = o2.get(0) * o2.get(0) + o2.get(1) * o2.get(1);
               if(dis1 != dis2)
                   return dis1 - dis2;
               if(o1.get(0) != o2.get(0))
                   return o1.get(0) - o2.get(0);
               return o1.get(1) - o2.get(1);
           } 
        });
        
        for(ArrayList<Integer> x : a){
            System.out.println(x.get(0) + " " + x.get(1));
        }
    }
}
