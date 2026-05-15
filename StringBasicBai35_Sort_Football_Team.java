/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Hoang Anh
 */
public class StringBasicBai35_Sort_Football_Team {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            int idx = s.indexOf("-");
            
            String X = s.substring(0, idx-1);
            String Y = s.substring(idx+2);
            
            if(map.containsKey(X)){
                map.put(X, map.get(X) + 1);
            }
            else{
                map.put(X, 1);
            }
            
            if(map.containsKey(Y)){
                map.put(Y, map.get(Y)+ 1);
            }
            else{
                map.put(Y, 1);
            }
        }
        
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> x, Map.Entry<String, Integer> y){
                if(!x.getValue().equals(y.getValue())){
                    return y.getValue() - x.getValue();
                }
                else{
                    return x.getKey().compareTo(y.getKey());
                }
            }
        });
        
        for(Map.Entry<String, Integer> x : list){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
